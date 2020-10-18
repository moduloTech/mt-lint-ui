package com.modulotech.ui.id.items

import com.modulotech.ui.id.IdItem

val layoutItems: List<IdItem> by lazy {
    listOf(
        Space(),
    )
}

// region Items
private class Space : IdItem(
    tagName = listOf("Space"),
    idPrefix = listOf("space_")
)
// endregion
