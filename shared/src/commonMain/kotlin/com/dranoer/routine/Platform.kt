package com.dranoer.routine

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform