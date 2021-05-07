package com.patterns.strategy

import com.patterns.strategy.site.CpcSite
import com.patterns.strategy.site.NetworkSite
import com.patterns.strategy.site.PlaygroundSite
import com.patterns.strategy.site.Site

class ListingManager(val country: Country) {

    var siteStrategy = getSiteStrategy(country)

    private fun getSiteStrategy(country: Country): Site {
        if (country == Country.AR){
            return PlaygroundSite()
        }
        if (country == Country.ES){
            return CpcSite()
        }
        return NetworkSite()
    }

    fun isNetwork():Boolean {
        return  siteStrategy.isNetwork()
    }

    fun isPlayground():Boolean {
        return  siteStrategy.isPlayground()
    }

    // a bunch of other methods

}
