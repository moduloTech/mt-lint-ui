package com.modulotech.ui.id

import com.android.tools.lint.detector.api.Issue
import com.android.tools.lint.detector.api.ResourceXmlDetector
import com.android.tools.lint.detector.api.XmlContext
import com.android.tools.lint.detector.api.XmlScannerConstants
import org.w3c.dom.Element

/**
 * The Xml Detector to detect the id naming and report if any element is not following the condition
 */
class IdDetector : ResourceXmlDetector() {

    /**
     * Returns the list of elements that this detector wants to analyze. If non
     * null, this detector will be called (specifically, the
     * [visitElement] method) for each matching element in the document.
     *
     * @return a collection of elements, or null, or the special
     * [XmlScannerConstants.ALL] marker to indicate that every single
     * element should be analyzed.
     */
    override fun getApplicableElements(): Collection<String>? {
        return mutableListOf<String>().apply {
            idIssues.forEach { addAll(it.tagName) }
        }.toList()
    }

    override fun visitElement(context: XmlContext, element: Element) {
        if (element.hasAttributeNS(SCHEMA, ATTRIBUTE_ID)) { // id check
            visitIdElement(context, element)
        }
    }

    companion object {
        const val SCHEMA = "http://schemas.android.com/apk/res/android"
        const val ATTRIBUTE_ID = "id"
        internal const val EXPLANATION_ID = "Use project naming conventions @+id/{prefix}"
    }

}

private fun visitIdElement(context: XmlContext, element: Element) {
    val idValue = element.getAttributeNodeNS(IdDetector.SCHEMA, IdDetector.ATTRIBUTE_ID)
    val isValid = idIssues.any { it.isValid(element.tagName, idValue.value) }
    if (isValid.not()) {
        val issueToShow = IdItem.of(element.tagName)
        if (issueToShow != null)
            report(issueToShow.toIssue(), issueToShow.idPrefix.first(), context, element)
    }
}

private fun report(issue: Issue, prefix: String, context: XmlContext, element: Element) {
    context.report(
        issue,
        context.getLocation(element),
        IdDetector.EXPLANATION_ID.replace("{prefix}", prefix)
    )
}