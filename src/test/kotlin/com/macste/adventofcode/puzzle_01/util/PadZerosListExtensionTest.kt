package com.macste.adventofcode.puzzle_01.util

import org.assertj.core.api.Assertions
import org.junit.jupiter.api.Test

class PadZerosListExtensionTest {

    @Test
    fun `padZeros should correctly pad both left and right`() {
        val testList = listOf(1, 2, -3)

        val result = testList.padZeros(leftPad = 2, rightPad = 2)

        Assertions.assertThat(result).containsExactly(0, 0, 1, 2, -3, 0, 0)
    }

    @Test
    fun `padZeros should correctly pad left`() {
        val testList = listOf(1, 2, -3)

        val result = testList.padZeros(leftPad = 2)

        Assertions.assertThat(result).containsExactly(0, 0, 1, 2, -3)
    }

    @Test
    fun `padZeros should correctly pad right`() {
        val testList = listOf(1, 2, -3)

        val result = testList.padZeros(rightPad = 2)

        Assertions.assertThat(result).containsExactly(1, 2, -3, 0, 0)
    }

    @Test
    fun `padZeros should by default not pad anything`() {
        val testList = listOf(1, 2, -3)

        val result = testList.padZeros()

        Assertions.assertThat(result).containsExactly(1, 2, -3)
    }
}