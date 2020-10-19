package com.modulotech.ui.id.items

import com.modulotech.ui.id.IdItem

val textItems: List<IdItem> by lazy {
    listOf(
        TextView(),
        EditView(),
    )
}
private const val ISSUE_ID_TEXT = "Text"

// region Items
private class TextView : IdItem(
    issueIdSuffix = ISSUE_ID_TEXT,
    tagName = listOf("TextView", "androidx.appcompat.widget.AppCompatTextView"),
    idPrefix = listOf("text_")
)

private class EditView : IdItem(
    issueIdSuffix = ISSUE_ID_TEXT,
    tagName = listOf(
        "EditText",
        "androidx.appcompat.widget.AppCompatEditText",
        "androidx.appcompat.widget.AppCompatMultiAutoCompleteTextView",
        "com.google.android.material.textfield.TextInputEditText",
    ),
    idPrefix = listOf("input_")
)
// endregion