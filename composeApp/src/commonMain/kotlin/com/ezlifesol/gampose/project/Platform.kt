package com.ezlifesol.gampose.project

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform