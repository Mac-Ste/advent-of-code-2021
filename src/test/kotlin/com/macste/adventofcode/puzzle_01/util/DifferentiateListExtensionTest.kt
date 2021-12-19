package com.macste.adventofcode.puzzle_01.util

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class DifferentiateListExtensionTest {

    @Test
    fun `differentiate should correctly differentiate` () {
        val testList = listOf(1,2,2,4,3,2,0)

        val result = testList.differentiate()

        assertThat(result).containsExactly(
            1,0,2,-1,-1,-2
        )
    }

    @Test
    fun `differentiate should not fail if empty list` () {
        val testList = emptyList<Int>()

        val result = testList.differentiate()

        assertThat(result).isEmpty()
    }
}