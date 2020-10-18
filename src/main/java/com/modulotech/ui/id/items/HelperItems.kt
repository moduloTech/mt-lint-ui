package com.modulotech.ui.id.items

import com.modulotech.ui.id.IdItem

val helperItems: List<IdItem> by lazy {
    listOf(
        Group(),
        Barrier(),
        Flow(),
        Guideline(),
        Layer(),
        MockView(),
    )
}

// region Items
private class Group : IdItem(
    tagName = listOf("androidx.constraintlayout.widget.Group"),
    idPrefix = listOf("group_")
)

private class Barrier : IdItem(
    tagName = listOf("androidx.constraintlayout.widget.Barrier"),
    idPrefix = listOf("barrier_")
)

private class Flow : IdItem(
    tagName = listOf("androidx.constraintlayout.helper.widget.Flow"),
    idPrefix = listOf("flow_")
)

private class Guideline : IdItem(
    tagName = listOf("androidx.constraintlayout.widget.Guideline"),
    idPrefix = listOf("guide_")
)

private class Layer : IdItem(
    tagName = listOf("androidx.constraintlayout.helper.widget.Layer"),
    idPrefix = listOf("layer_")
)

private class MockView : IdItem(
    tagName = listOf("androidx.constraintlayout.utils.widget.MockView"),
    idPrefix = listOf("mock_")
)
// endregion