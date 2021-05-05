package com.kata

import com.patterns.strategy.AdManager
import com.patterns.strategy.Country
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class AdsManagerShould {

    @Test
    fun `check PH as a network country`() {
        val adManager = AdManager(Country.PH)

        assertThat(adManager.isNetwork()).isTrue
    }

    @Test
    fun `check ES as a not network country`() {
        val adManager = AdManager(Country.ES)

        assertThat(adManager.isNetwork()).isFalse
    }

    @Test
    fun `check AR as a playground country`() {
        val adManager = AdManager(Country.AR)

        assertThat(adManager.isPlayground()).isTrue
    }

    @Test
    fun `check ES as a not playground country`() {
        val adManager = AdManager(Country.ES)

        assertThat(adManager.isPlayground()).isFalse
    }
}