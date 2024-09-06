package com.ezlifesol.library.gampose

enum class GamePlatform {
    Android, Desktop, Web;
}

expect fun getPlatform(): GamePlatform