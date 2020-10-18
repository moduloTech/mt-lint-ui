package com.modulotech.ui.id.items

import com.modulotech.ui.id.IdItem

val textItems: List<IdItem> by lazy {
    listOf(
        TextView(),
        EditView(),
    )
}

// region Items
private class TextView : IdItem(
    tagName = listOf("TextView", "androidx.appcompat.widget.AppCompatTextView"),
    idPrefix = listOf("text_")
)

private class EditView : IdItem(
    tagName = listOf(
        "EditText",
        "androidx.appcompat.widget.AppCompatEditText",
        "androidx.appcompat.widget.AppCompatMultiAutoCompleteTextView",
        "com.google.android.material.textfield.TextInputEditText",
    ),
    idPrefix = listOf("input_")
)
// endregion