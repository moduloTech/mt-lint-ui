package com.modulotech.ui.id

import com.android.tools.lint.detector.api.*
import com.modulotech.ui.id.items.*

private const val ID = "XmlIdFormat" // never change this, as it might affect prod
private const val DESCRIPTION = "id should start with predefined prefix {prefix}"
private const val EXPLANATION = "Use project naming conventions `@+id/{prefix}`"
private const val PRIORITY = 7
private val CATEGORY = Category.CORRECTNESS
private val SEVERITY = Severity.ERROR

/**
 * Id items represents an open class to handle Xml Id prefix lint checks.
 */
open class IdItem(val tagName: List<String>, val idPrefix: List<String>) {

    /**
     * Provides the [elementTag] from the [ResourceXmlDetector]'s [ResourceXmlDetector.visitElement]
     * method, and the [elementId] to check if it satisfies the condition.
     */
    fun isValid(elementTag: String, elementId: String): Boolean =
        tagName.contains(elementTag) && idPrefix.any { prefix ->
            elementId.startsWith("@+id/${prefix}")
        }

    /**
     * Create an issue for this [IdItem]
     */
    fun toIssue(): Issue {
        /** Issue describing the problem and pointing to the detector implementation */
        return Issue.create(
            // ID: used in @SuppressLint warnings etc
            ID,
            // Title -- shown in the IDE's preference dialog, as category headers in the
            // Analysis results window, etc
            DESCRIPTION.replace("{prefix}", idPrefix.first().toString()),
            // Full explanation of the issue; you can use some markdown markup such as
            // `monospace`, *italic*, and **bold**.
            EXPLANATION.replace("{prefix}", idPrefix.first().toString()),
            CATEGORY,
            PRIORITY,
            SEVERITY,
            Implementation(
                IdDetector::class.java,
                Scope.RESOURCE_FILE_SCOPE
            )
        )
    }

    companion object {

        /**
         * Returns the [IdItem] associated to the tag name. Null if no match found˚
         */
        fun of(tagName: String): IdItem? =
            idIssues.firstOrNull { it.tagName.contains(tagName) }
    }
}

/**
 * The xml elements for an Android project has be listed into categories on the IDE.
 * We follow a similar approach to group the issues. Follow Android Studio Palette window to place
 * the elements in the correct group.
 */
val idIssues: List<IdItem> =
    (textItems + buttonItems + widgetItems + layoutItems + containerItems + helperItems + googleItems)





