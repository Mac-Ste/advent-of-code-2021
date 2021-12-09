package com.macste.adventofcode.puzzle.one.util

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.assertThrows
import java.lang.IllegalStateException

class DifferenceOfElementsWithListExtensionTest {

    @Test
    fun `differenceOfElementsWith should correctly calculate differences` () {
        val testListOne = listOf(1, 2, 3, -3, -2, -1)
        val testListTwo = listOf(3, 2, 1, -2, -1, 5)

        val result = testListOne.differenceOfElementsWith(testListTwo)

        assertThat(result).containsExactly(
            -2, 0, 2, -1, -1, -6
        )
    }

    @Test
    fun `differenceOfElementsWith should fail if list size differ` () {
        val testListOne = listOf(1, 2, 3, -3, -2, -1)
        val testListTwo = listOf(3, 2, 1)

        val exception = assertThrows<IllegalStateException> {
            testListOne.differenceOfElementsWith(testListTwo)
        }

        assertThat(exception).hasMessage(
            "Size mismatch for diff calculation! Original size: 6 Other size: 3"
        )
    }

    @Test
    fun `differenceOfElementsWith should not fail if both lists are empty` () {
        val testListOne = emptyList<Int>()
        val testListTwo = emptyList<Int>()

        val result = testListOne.differenceOfElementsWith(testListTwo)

        assertThat(result).isEmpty()
    }
}