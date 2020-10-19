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

private const val ISSUE_ID_HELPER = "Helper"

// region Items
private class Group : IdItem(
    issueIdSuffix = ISSUE_ID_HELPER,
    tagName = listOf("androidx.constraintlayout.widget.Group"),
    idPrefix = listOf("group_")
)

private class Barrier : IdItem(
    issueIdSuffix = ISSUE_ID_HELPER,
    tagName = listOf("androidx.constraintlayout.widget.Barrier"),
    idPrefix = listOf("barrier_")
)

private class Flow : IdItem(
    issueIdSuffix = ISSUE_ID_HELPER,
    tagName = listOf("androidx.constraintlayout.helper.widget.Flow"),
    idPrefix = listOf("flow_")
)

private class Guideline : IdItem(
    issueIdSuffix = ISSUE_ID_HELPER,
    tagName = listOf("androidx.constraintlayout.widget.Guideline"),
    idPrefix = listOf("guide_")
)

private class Layer : IdItem(
    issueIdSuffix = ISSUE_ID_HELPER,
    tagName = listOf("androidx.constraintlayout.helper.widget.Layer"),
    idPrefix = listOf("layer_")
)

private class MockView : IdItem(
    issueIdSuffix = ISSUE_ID_HELPER,
    tagName = listOf("androidx.constraintlayout.utils.widget.MockView"),
    idPrefix = listOf("mock_")
)
// endregion