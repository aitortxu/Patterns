package com.patterns.strategy.site

class NetworkSite() : Site() {
    override fun isNetwork(): Boolean {
        return true
    }
}
