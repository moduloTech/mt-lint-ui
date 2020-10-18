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

// region Items
private class Button : IdItem(
    tagName = listOf("Button", "androidx.appcompat.widget.AppCompatButton"),
    idPrefix = listOf("btn_")
)

private class Chip : IdItem(
    tagName = listOf("com.google.android.material.chip.Chip"),
    idPrefix = listOf("chip_")
)

private class ChipGroup : IdItem(
    tagName = listOf("com.google.android.material.chip.ChipGroup"),
    idPrefix = listOf("chip_group_")
)

private class CheckBox : IdItem(
    tagName = listOf("CheckBox", "androidx.appcompat.widget.AppCompatCheckBox"),
    idPrefix = listOf("check_")
)

private class RadioButton : IdItem(
    tagName = listOf("RadioButton", "androidx.appcompat.widget.AppCompatRadioButton"),
    idPrefix = listOf("radio_")
)

private class RadioGroup : IdItem(
    tagName = listOf("RadioGroup"),
    idPrefix = listOf("radio_group_")
)

private class ToggleButton : IdItem(
    tagName = listOf("ToggleButton", "androidx.appcompat.widget.AppCompatToggleButton"),
    idPrefix = listOf("toggle_")
)

private class Switch : IdItem(
    tagName = listOf("Switch"),
    idPrefix = listOf("switch_")
)
//endregion
