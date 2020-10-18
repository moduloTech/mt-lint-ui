package com.modulotech.ui.id.items

import com.modulotech.ui.id.IdItem

val widgetItems: List<IdItem> by lazy {
    listOf(
        View(),
        ImageView(),
        WebView(),
        VideoView(),
        CalendarView(),
        ProgressBar(),
        Seekbar(),
        RatingBar(),
        SearchView(),
        TextureView(),
        SurfaceView(),
    )
}

private const val ISSUE_ID_WIDGET = "Widget"

// region Items
private class View : IdItem(
    issueIdSuffix = ISSUE_ID_WIDGET,
    tagName = listOf("View"),
    idPrefix = listOf("view_", "divider_")
)

private class ImageView : IdItem(
    issueIdSuffix = ISSUE_ID_WIDGET,
    tagName = listOf("ImageView", "androidx.appcompat.widget.AppCompatImageView"),
    idPrefix = listOf("img_", "icon_", "image_")
)

private class WebView : IdItem(
    issueIdSuffix = ISSUE_ID_WIDGET,
    tagName = listOf("WebView"),
    idPrefix = listOf("web_")
)

private class VideoView : IdItem(
    issueIdSuffix = ISSUE_ID_WIDGET,
    tagName = listOf("VideoView"),
    idPrefix = listOf("video_")
)

private class CalendarView : IdItem(
    issueIdSuffix = ISSUE_ID_WIDGET,
    tagName = listOf("CalendarView"),
    idPrefix = listOf("calendar_")
)

private class ProgressBar : IdItem(
    issueIdSuffix = ISSUE_ID_WIDGET,
    tagName = listOf("ProgressBar"),
    idPrefix = listOf("progress_")
)

private class Seekbar : IdItem(
    issueIdSuffix = ISSUE_ID_WIDGET,
    tagName = listOf("Seekbar"),
    idPrefix = listOf("seek_")
)

private class RatingBar : IdItem(
    issueIdSuffix = ISSUE_ID_WIDGET,
    tagName = listOf("RatingBar"),
    idPrefix = listOf("rating_")
)

private class SearchView : IdItem(
    issueIdSuffix = ISSUE_ID_WIDGET,
    tagName = listOf("SearchView"),
    idPrefix = listOf("search_")
)

private class TextureView : IdItem(
    issueIdSuffix = ISSUE_ID_WIDGET,
    tagName = listOf("TextureView"),
    idPrefix = listOf("texture_")
)

private class SurfaceView : IdItem(
    issueIdSuffix = ISSUE_ID_WIDGET,
    tagName = listOf("SurfaceView"),
    idPrefix = listOf("surface_")
)
//endregion
