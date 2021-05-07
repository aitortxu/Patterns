package com.kata

import com.patterns.strategy.ListingManager
import com.patterns.strategy.Country
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class ListingsManagerShould {

    @Test
    fun `check PH as a network country`() {
        val listingManager = ListingManager(Country.PH)

        assertThat(listingManager.isNetwork()).isTrue
    }

    @Test
    fun `check ES as a not network country`() {
        val listingManager = ListingManager(Country.ES)

        assertThat(listingManager.isNetwork()).isFalse
    }

    @Test
    fun `check AR as a playground country`() {
        val listingManager = ListingManager(Country.AR)

        assertThat(listingManager.isPlayground()).isTrue
    }

    @Test
    fun `check ES as a not playground country`() {
        val listingManager = ListingManager(Country.ES)

        assertThat(listingManager.isPlayground()).isFalse
    }
}