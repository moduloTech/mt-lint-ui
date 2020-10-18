package com.modulotech.ui.id.items

import com.modulotech.ui.id.IdItem

val layoutItems: List<IdItem> by lazy {
    listOf(
        Space(),
    )
}

private const val ISSUE_ID_LAYOUT = "Layout"

// region Items
private class Space : IdItem(
    issueIdSuffix = ISSUE_ID_LAYOUT,
    tagName = listOf("Space"),
    idPrefix = listOf("space_")
)
// endregion
