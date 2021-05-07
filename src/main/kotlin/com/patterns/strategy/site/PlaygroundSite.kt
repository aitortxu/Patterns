package com.patterns.strategy.site

class PlaygroundSite() : Site() {
    override fun isPlayground(): Boolean {
        return true
    }
}
