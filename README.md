# mt-lint-ui 
Painless Gradle plugin for linting ui for Android xml.

It aims to be easy to set up with zero required configuration and behaves as you'd expect out of the box.

This project is in its alpha phase, many changes are expected to happen. 

## Installation 
Quickly add lint to your project dependency

<details open>
  
<summary>Groovy</summary>
```groovy
lintChecks project(':mt-lint-ui')
```
</details>

<details>
  
<summary>Kotlin</summary>
```kotlin
lintChecks(project(":mt-lint-ui"))
```
</details>


## Default ids

#### Common

| Element | id prefix  | 
| :---:   | :-: | 
| TextView | text_ | 
| EditText | input_ | 
| Button | btn_ | 
| ImageView | img_, icon_ | 
| ScrollView | scroll_ | 
| Switch | switch_ | 
| CheckBox | check_ | 
| RadioButton | radio_ | 
| RadioGroup | radio_group_ | 
| ToggleButton | radio_group_ | 
| RadioGroup | toggle_ | 

#### Widgets
| Element | id prefix  | 
| :---:   | :-: | 
| View | view_, divider_ | 
| Space | space_ | 
| WebView | web_ | 
| ProgressBar | progress_ | 
| Seekbar | seek_ | 
| RatingBar | rating_ | 
| SurfaceView | surface_ | 
| TextureView | texture_ | 
| VideoView | video_ | 
| CalendarView | calendar_ | 

#### Container
| Element | id prefix  | 
| :---:   | :-: | 
| Spinner | spinner_ | 
| RecyclerView | recycler_, list_ | 
| ScrollView<br>HorizontalScrollView<br>NestedScroll  | scroll_ | 
| ViewPager | pager_ | 
| CardView | card_ | 
| AppBar | appbar_ | 
| ToolBar<br>CollapsingToolbar  | toolbar_ | 
| BottomAppbar | bot_appbar_ | 
| NavigationView | nav_ | 
| BottomNavigationView | bot_,nav_ | 
| TabLayout | tab_ | 
| TabItem  | tab_item_  | 
| MapView  | map_  | 

#### Layout
| Element | id prefix  | 
| :---:   | :-: | 
| ConstrainLayout | layout_ | 
| LinearLayout | layout_ | 
| FrameLayout | layout_ | 
| TableLayout | layout_ | 
| Space | space_ | 
| Guideline | guide_, guideline_ | 
| Barrier | barrier_ | 

We don't support legacy items

- ListView
- GridView
- TabHost
- RelativeLayout
- GridLayout