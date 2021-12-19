package com.macste.adventofcode.puzzle_01.util

import org.assertj.core.api.Assertions
import org.junit.jupiter.api.Test

class CountPositivesListExtensionTest {
    @Test
    fun `countPositives should count all positive numbers excluding zero`() {
        val testList = listOf(1, 5, 0, 2, 1, -4, -2)

        Assertions.assertThat(testList.countPositive()).isEqualTo(4)
    }

    @Test
    fun `countPositives should return 0 on empty list`() {
        val testList = emptyList<Int>()

        Assertions.assertThat(testList.countPositive()).isZero()
    }
}