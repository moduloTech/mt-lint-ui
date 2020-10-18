package com.modulotech.ui.id.items

import com.modulotech.ui.id.IdItem

val googleItems: List<IdItem> by lazy {
    listOf(
        MapView(),
    )
}

// region Items
private class MapView : IdItem(
    tagName = listOf("com.google.android.gms.maps.MapView"),
    idPrefix = listOf("map_")
)
//endregion
