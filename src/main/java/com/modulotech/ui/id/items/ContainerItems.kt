package com.modulotech.ui.id.items

import com.modulotech.ui.id.IdItem

val containerItems: List<IdItem> by lazy {
    listOf(
        Spinner(),
        RecyclerView(),
        ScrollView(),
        ViewPager(),
        CardView(),
        ToolBar(),
        TabLayout(),
        TabItem(),
        NavigationView(),
        BottomNavigationView(),
    )
}

// region Items
private class Spinner : IdItem(
    tagName = listOf("Spinner", "androidx.appcompat.widget.AppCompatSpinner"),
    idPrefix = listOf("spinner_")
)

private class RecyclerView : IdItem(
    tagName = listOf("androidx.recyclerview.widget.RecyclerView"),
    idPrefix = listOf("recycler_", "list_")
)

private class ScrollView : IdItem(
    tagName = listOf(
        "ScrollView",
        "HorizontalScrollView",
        "androidx.core.widget.NestedScrollView"
    ),
    idPrefix = listOf("scroll_")
)

private class ViewPager : IdItem(
    tagName = listOf("androidx.viewpager.widget.ViewPager"),
    idPrefix = listOf("pager_")
)

private class CardView : IdItem(
    tagName = listOf("androidx.cardview.widget.CardView"),
    idPrefix = listOf("card_")
)

private class ToolBar : IdItem(
    tagName = listOf(
        "Toolbar",
        "androidx.appcompat.widget.Toolbar",
        "com.google.android.material.appbar.CollapsingToolbarLayout"
    ),
    idPrefix = listOf("toolbar_")
)

private class NavigationView : IdItem(
    tagName = listOf("com.google.android.material.navigation.NavigationView"),
    idPrefix = listOf("nav_")
)

private class BottomNavigationView : IdItem(
    tagName = listOf("com.google.android.material.bottomnavigation.BottomNavigationView"),
    idPrefix = listOf("bot_nav_")
)

private class TabLayout : IdItem(
    tagName = listOf("TabLayout", "com.google.android.material.tabs.TabLayout"),
    idPrefix = listOf("tab_")
)

private class TabItem : IdItem(
    tagName = listOf("com.google.android.material.tabs.TabItem"),
    idPrefix = listOf("tab_item_")
)
// endregion

