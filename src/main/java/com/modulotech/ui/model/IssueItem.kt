package com.modulotech.ui.model

import com.android.tools.lint.detector.api.*
import com.modulotech.ui.detector.IdDetector

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
sealed class IssueItem(val tagName: List<String>, val idPrefix: List<String>) {

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

    fun isValid(elementTag: String, elementId: String): Boolean =
        tagName.contains(elementTag) && idPrefix.any { prefix ->
            elementId.startsWith("@+id/${prefix}")
        }

    companion object {

        fun of(tagName: String): IssueItem? {
            return idIssues.firstOrNull { it.tagName.contains(tagName) }
        }
    }
}

private val ID = "IdNamingConvention"
private val DESCRIPTION = "id should start with predefined prefix {prefix}"
private val EXPLANATION = "Use project naming conventions @+id/{prefix}"
private val CATEGORY = Category.CORRECTNESS
private val PRIORITY = 7
private val SEVERITY = Severity.ERROR

val idIssues: List<IssueItem> = listOf(
    TextView(),
    EditView(),
    Button(),
    ImageView(),
    Switch(),
    ScrollView(),
    CardView(),
    RecyclerView()
)

class TextView : IssueItem(
    tagName = listOf("TextView", "androidx.appcompat.widget.AppCompatTextView"),
    idPrefix = listOf("text_")
)

class EditView : IssueItem(
    tagName = listOf(
        "EditText",
        "androidx.appcompat.widget.AppCompatEditText",
        "androidx.appcompat.widget.AppCompatMultiAutoCompleteTextView",
        "com.google.android.material.textfield.TextInputEditText",
    ),
    idPrefix = listOf("input_")
)

class Button : IssueItem(
    tagName = listOf("Button", "androidx.appcompat.widget.AppCompatButton"),
    idPrefix = listOf("btn_")
)

class ImageView : IssueItem(
    tagName = listOf("ImageView", "androidx.appcompat.widget.AppCompatImageView"),
    idPrefix = listOf("img_", "icon_", "image_")
)

class Switch : IssueItem(
    tagName = listOf("Switch"),
    idPrefix = listOf("switch_")
)

class ScrollView : IssueItem(
    tagName = listOf("ScrollView", "HorizontalScrollView", "androidx.core.widget.NestedScrollView"),
    idPrefix = listOf("scroll_")
)

class CardView : IssueItem(
    tagName = listOf("androidx.cardview.widget.CardView"),
    idPrefix = listOf("card_")
)

class RecyclerView : IssueItem(
    tagName = listOf("androidx.recyclerview.widget.RecyclerView"),
    idPrefix = listOf("recycler_", "list_")
)
