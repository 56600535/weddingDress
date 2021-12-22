package com.github.56600535.weddingdress.services

import com.intellij.openapi.project.Project
import com.github.56600535.weddingdress.MyBundle

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
