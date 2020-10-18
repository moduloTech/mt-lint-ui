package com.modulotech.ui.id.items

import com.modulotech.ui.id.IdItem

val buttonItems: List<IdItem> by lazy {
    listOf(
        Button(),
        ChipGroup(),
        Chip(),
        CheckBox(),
        RadioGroup(),
        RadioButton(),
        ToggleButton(),
        Switch(),
    )
}

private const val ISSUE_ID_BUTTON = "Button"

// region Items
private class Button : IdItem(
    issueIdSuffix = ISSUE_ID_BUTTON,
    tagName = listOf("Button", "androidx.appcompat.widget.AppCompatButton"),
    idPrefix = listOf("btn_")
)

private class Chip : IdItem(
    issueIdSuffix = ISSUE_ID_BUTTON,
    tagName = listOf("com.google.android.material.chip.Chip"),
    idPrefix = listOf("chip_")
)

private class ChipGroup : IdItem(
    issueIdSuffix = ISSUE_ID_BUTTON,
    tagName = listOf("com.google.android.material.chip.ChipGroup"),
    idPrefix = listOf("chip_group_")
)

private class CheckBox : IdItem(
    issueIdSuffix = ISSUE_ID_BUTTON,
    tagName = listOf("CheckBox", "androidx.appcompat.widget.AppCompatCheckBox"),
    idPrefix = listOf("check_")
)

private class RadioButton : IdItem(
    issueIdSuffix = ISSUE_ID_BUTTON,
    tagName = listOf("RadioButton", "androidx.appcompat.widget.AppCompatRadioButton"),
    idPrefix = listOf("radio_")
)

private class RadioGroup : IdItem(
    issueIdSuffix = ISSUE_ID_BUTTON,
    tagName = listOf("RadioGroup"),
    idPrefix = listOf("radio_group_")
)

private class ToggleButton : IdItem(
    issueIdSuffix = ISSUE_ID_BUTTON,
    tagName = listOf("ToggleButton", "androidx.appcompat.widget.AppCompatToggleButton"),
    idPrefix = listOf("toggle_")
)

private class Switch : IdItem(
    issueIdSuffix = ISSUE_ID_BUTTON,
    tagName = listOf("Switch"),
    idPrefix = listOf("switch_")
)
//endregion
