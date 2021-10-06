package com.github.yang747046912.plugin.services

import com.intellij.openapi.project.Project
import com.github.yang747046912.plugin.MyBundle

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
