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

// region Items
private class View : IdItem(
    tagName = listOf("View"),
    idPrefix = listOf("view_", "divider_")
)

private class ImageView : IdItem(
    tagName = listOf("ImageView", "androidx.appcompat.widget.AppCompatImageView"),
    idPrefix = listOf("img_", "icon_", "image_")
)

private class WebView : IdItem(
    tagName = listOf("WebView"),
    idPrefix = listOf("web_")
)

private class VideoView : IdItem(
    tagName = listOf("VideoView"),
    idPrefix = listOf("video_")
)

private class CalendarView : IdItem(
    tagName = listOf("CalendarView"),
    idPrefix = listOf("calendar_")
)

private class ProgressBar : IdItem(
    tagName = listOf("ProgressBar"),
    idPrefix = listOf("progress_")
)

private class Seekbar : IdItem(
    tagName = listOf("Seekbar"),
    idPrefix = listOf("seek_")
)

private class RatingBar : IdItem(
    tagName = listOf("RatingBar"),
    idPrefix = listOf("rating_")
)

private class SearchView : IdItem(
    tagName = listOf("SearchView"),
    idPrefix = listOf("search_")
)

private class TextureView : IdItem(
    tagName = listOf("TextureView"),
    idPrefix = listOf("texture_")
)

private class SurfaceView : IdItem(
    tagName = listOf("SurfaceView"),
    idPrefix = listOf("surface_")
)
//endregion
