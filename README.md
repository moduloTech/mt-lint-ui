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

## Default configuration
Check our [Wiki](https://github.com/moduloTech/mt-lint-ui/wiki) to get more information on default configuration.

--------
## We are hiring!
Modulotech is growing fast and we continue to expand our fully distributed team. We embrace diverse perspectives, and seek out passionate, self-motivated people, committed to our shared vision of raising the standard of trust online. If you are a software engineer capable in either iOS or Android, visit our [careers page](https://www.modulotech.fr/on-recrute/) to find out more about our openings!

## Check out our Blogs!
Modulotech has started our [blog on medium](https://medium.com/modulotech). Do catch us and follow for practical information on technical and non-technical topics. 

## Terminology
We have taken steps to update our terminology and remove words with problematic racial connotations, most notably the change to `main` branches, `allow lists`, and `blocklists`. Closed issues or PRs may contain deprecated terminology that should not be used going forward.

## License

 Copyright 2020 Modulotech Group

   Licensed under the Apache License, Version 2.0 (the "License");
   you may not use this file except in compliance with the License.
   You may obtain a copy of the License at

       http://www.apache.org/licenses/LICENSE-2.0

   Unless required by applicable law or agreed to in writing, software
   distributed under the License is distributed on an "AS IS" BASIS,
   WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
   See the License for the specific language governing permissions and
   limitations under the License.
