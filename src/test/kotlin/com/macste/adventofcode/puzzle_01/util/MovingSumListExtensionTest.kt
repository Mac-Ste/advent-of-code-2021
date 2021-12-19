package com.macste.adventofcode.puzzle_01.util

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class MovingSumListExtensionTest {

    @Test
    fun `movingSum should correctly calculate moving sum` () {
        val testList = listOf(0, 1, 2, 5, 9, -3, 3)

        val result_1 = testList.movingSum(windowSize = 1)
        val result_2 = testList.movingSum(windowSize = 2)
        val result_3 = testList.movingSum(windowSize = 3)

        assertThat(result_1).containsExactly(
            0, 1, 2, 5, 9, -3, 3
        )

        assertThat(result_2).containsExactly(
            1, 3, 7, 14, 6, 0
        )

        assertThat(result_3).containsExactly(
            3, 8, 16, 11, 9
        )
    }

    @Test
    fun `movingSum should not fail if empty list` () {
        val testList = emptyList<Int>()

        val result_1 = testList.movingSum(windowSize = 1)
        val result_2 = testList.movingSum(windowSize = 2)
        val result_3 = testList.movingSum(windowSize = 3)

        assertThat(result_1).isEmpty()
        assertThat(result_2).isEmpty()
        assertThat(result_3).isEmpty()
    }
}