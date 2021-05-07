package com.patterns.strategy.site

abstract class Site (){
    open fun isNetwork(): Boolean {
        return false
    }

    open fun isPlayground(): Boolean{
        return false
    }
}
