package com.jrjr.gestaoalunos

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform