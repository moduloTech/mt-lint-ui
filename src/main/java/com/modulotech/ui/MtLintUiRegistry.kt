package com.modulotech.ui

import com.android.tools.lint.client.api.IssueRegistry
import com.android.tools.lint.detector.api.CURRENT_API
import com.android.tools.lint.detector.api.Issue
import com.modulotech.ui.id.idIssues

/**
 * Registry which provides a list of checks to be performed on an Android project
 * The [MtLintUiRegistry] is responsible all issues present in this library/
 * Any new issue should be registered here
 */
class MtLintUiRegistry : IssueRegistry() {

    override val issues: List<Issue>
        get() = idIssues.map {
            it.toIssue()
        }

    override val api: Int
        get() = CURRENT_API

}
