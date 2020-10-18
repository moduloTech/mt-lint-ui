package com.modulotech.ui.detector

import com.android.tools.lint.detector.api.Issue
import com.android.tools.lint.detector.api.ResourceXmlDetector
import com.android.tools.lint.detector.api.XmlContext
import com.modulotech.ui.model.IssueItem
import com.modulotech.ui.model.idIssues
import org.w3c.dom.Element
/*
 * Copyright (C) 2020 The Android Open Source Project
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
class IdDetector : ResourceXmlDetector() {

    override fun getApplicableElements(): Collection<String>? {
        val elementsInteresting = mutableListOf<String>()
        idIssues.forEach { elementsInteresting.addAll(it.tagName) }
        return elementsInteresting.toList()
    }

    override fun visitElement(context: XmlContext, element: Element) {
        if (element.hasAttributeNS(SCHEMA, ATTRIBUTE_ID)) {
            val value = element.getAttributeNodeNS(SCHEMA, ATTRIBUTE_ID)

            val isValid = idIssues.any { it.isValid(element.tagName, value.value) }
            if (isValid.not()) {
                val issue = IssueItem.of(element.tagName)
                if (issue != null)
                    report(issue.toIssue(), issue.idPrefix.first(), context, element)
            }
        }
    }

    private fun report(issue: Issue, prefix: String, context: XmlContext, element: Element) {
        context.report(
            issue,
            context.getLocation(element),
            EXPLANATION.replace("{prefix}", prefix)
        )
    }

    companion object {
        internal const val EXPLANATION = "Use project naming conventions @+id/{prefix}"

        private const val SCHEMA = "http://schemas.android.com/apk/res/android"
        private const val ATTRIBUTE_ID = "id"
    }

}
