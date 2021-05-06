package com.patterns.strategy

class ListingManager(val country: Country) {
    fun isNetwork():Boolean {
        if (country == Country.PH || country == Country.CO || country == Country.PE || country == Country.TH || country == Country.PE ){
            return true
        }
        return false
    }

    fun isPlayground():Boolean {
        if (country == Country.AR || country == Country.DE){
            return true
        }
        return false
    }

}
