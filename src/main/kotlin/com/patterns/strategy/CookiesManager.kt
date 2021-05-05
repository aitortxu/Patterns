package com.patterns.strategy

class CookiesManager(val country: Country) {
    fun shouldDisplayCookiesBanner(): Boolean {
        if (country == Country.ES || country == Country.DE){
            return true
        }
        return false
    }

}
