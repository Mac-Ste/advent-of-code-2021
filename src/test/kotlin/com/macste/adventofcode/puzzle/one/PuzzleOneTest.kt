package com.macste.adventofcode.puzzle.one

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class PuzzleOneTest {
    @Test
    fun `partOne should correctly solve part one of the puzzle on example data` () {
        val puzzleOne = PuzzleOne()

        val result = puzzleOne.partOne(PuzzleOne.EXAMPLE_FILE)

        assertThat(result).isEqualTo(7)
    }

    @Test
    fun `partOne should correctly solve part one of the puzzle on input data` () {
        val puzzleOne = PuzzleOne()

        val result = puzzleOne.partOne(PuzzleOne.INPUT_FILE)

        assertThat(result).isEqualTo(1374)
    }

    @Test
    fun `partTwo should correctly solve part one of the puzzle on example data` () {
        val puzzleOne = PuzzleOne()

        val result = puzzleOne.partTwo(PuzzleOne.EXAMPLE_FILE)

        assertThat(result).isEqualTo(5)
    }

    @Test
    fun `partTwo should correctly solve part one of the puzzle on input data` () {
        val puzzleOne = PuzzleOne()

        val result = puzzleOne.partTwo(PuzzleOne.INPUT_FILE)

        assertThat(result).isEqualTo(1418)
    }
}