package com.kata

import com.patterns.strategy.CookiesManager
import com.patterns.strategy.Country.ES
import com.patterns.strategy.Country.PH
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class CookiesManagerShould {

    @Test
    fun `return true for a european country`() {
        val cookieManager = CookiesManager(ES)

        assertThat(cookieManager.shouldDisplayCookiesBanner()).isTrue
    }

    @Test
    fun `return false for a not european country`() {
        val cookieManager = CookiesManager(PH)

        assertThat(cookieManager.shouldDisplayCookiesBanner()).isFalse
    }
}