package com.modulotech.ui.id.items

import com.modulotech.ui.id.IdItem

val googleItems: List<IdItem> by lazy {
    listOf(
        MapView(),
    )
}

private const val ISSUE_ID_GOOGLE = "Google"

// region Items
private class MapView : IdItem(
    issueIdSuffix = ISSUE_ID_GOOGLE,
    tagName = listOf("com.google.android.gms.maps.MapView"),
    idPrefix = listOf("map_")
)
//endregion
