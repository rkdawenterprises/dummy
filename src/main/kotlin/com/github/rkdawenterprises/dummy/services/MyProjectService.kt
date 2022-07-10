package com.github.rkdawenterprises.dummy.services

import com.intellij.openapi.project.Project
import com.github.rkdawenterprises.dummy.MyBundle

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
