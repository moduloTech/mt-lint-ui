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

## Configuration
If your project wants to strictly follow the rules ot mt-lint-ui lib, no configuration change is necessary. 
Check the default configurations of the lint and their default severity. 
For other lint options check - https://developer.android.com/reference/tools/gradle-api/4.2/com/android/build/api/dsl/LintOptions

### Disable lint

<details open>
  
<summary>Groovy</summary>

```groovy
  lintOptions {
        disable '$lintId1', `$lintId2`
    }
```
</details>

<details>
  
<summary>Kotlin</summary>

```kotlin
  lintOptions {
        disable("$lintId1", "$lintId2")
    }
```
</details>

### Change severity 

Instead of disabling lint checks, you can customise the severity and slowly migrate the project to stronger lint checks. 

```
Example:
    lintOptions {
        warning "XmlIdFormat-Widget", "XmlIdFormat-Container"
        informational "XmlIdFormat-Text"
    }
```
Choose the severity that you prefer and get started. 

<details open>
  
<summary>Groovy</summary>

```groovy
  lintOptions {
        ignore "$lintId1", "$lintId2", "$lintId3" ....
    	warning "$lintId1", "$lintId2", "$lintId3" ....
    	error "$lintId1", "$lintId2", "$lintId3" ....
    	fatal "$lintId1", "$lintId2", "$lintId3" ....
    	informational "$lintId1", "$lintId2", "$lintId3" ....
    }
```
</details>

<details>
  
<summary>Kotlin</summary>

```kotlin
  lintOptions {
        ignore("$lintId1", "$lintId2")
        warning("$lintId1", "$lintId2")
        error("$lintId1", "$lintId2")
        fatal("$lintId1", "$lintId2")
        informational("$lintId1", "$lintId2")

    }
```
</details>

-----------

## Default configuration

### XmlIdFormat-type
Lint to check the prefix of xml ids. 
Default Severity Error
 
#### Text Items 
Issue Id -> `XmlIdFormat-Text`

| Element | id prefix  | 
| :---:   | :-: | 
| TextView | text_ | 
| EditText | input_ | 

#### Button Items
Issue Id -> `XmlIdFormat-Button`

| Element | id prefix  | 
| :---:   | :-: | 
| Button | btn_ | 
| Chip | chip_ | 
| ChipGroup | chip_group_ | 
| CheckBox | check_ | 
| RadioButton | radio_ | 
| RadioGroup | radio_group_ | 
| ToggleButton | toggle_ | 
| Switch | switch_ | 

#### Widget Items
Issue Id -> `XmlIdFormat-Widget`

| Element | id prefix  | 
| :---:   | :-: | 
| View | view_, divider_ | 
| ImageView | img_, icon_, image_ | 
| WebView | web_ | 
| VideoView | video_ | 
| CalendarView | calendar_ | 
| ProgressBar | progress_ | 
| Seekbar | seek_ | 
| RatingBar | rating_ | 
| SearchView | search_ | 
| TextureView | texture_ | 
| SurfaceView | surface_ | 

#### Container Items
Issue Id -> `XmlIdFormat-Container`

| Element | id prefix  | 
| :---:   | :-: | 
| Spinner | spinner_ | 
| RecyclerView | recycler_, list_ | 
| ScrollView | scroll_ | 
| ViewPager | pager_ | 
| CardView | card_ | 
| Toolbar | toolbar_ | 
| NavigationView | nav_ | 
| BottomNavigationView | bot_nav_ | 
| TabLayout | tab_ | 
| TabItem | tab_item_ | 

#### Helper Items
Issue Id -> `XmlIdFormat-Helper`

| Element | id prefix  | 
| :---:   | :-: | 
| Group | group_ | 
| Barrier | barrier_ | 
| Flow | flow_ | 
| Guideline | guide_ | 
| Layer | layer_ | 
| MockView | mock_ | 

#### Layout Items
Issue Id -> `XmlIdFormat-Layout`

| Element | id prefix  | 
| :---:   | :-: | 
| Space | space_ |

#### Google Items
Issue Id -> `XmlIdFormat-Google`

| Element | id prefix  | 
| :---:   | :-: | 
| MapView | map_ | 


### XmlLegacyElement

We don't support legacy items

- ListView
- GridView
- TabHost
- RelativeLayout
- GridLayout
