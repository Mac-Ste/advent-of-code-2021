package com.macste.adventofcode.puzzle.two

import org.assertj.core.api.Assertions
import org.junit.jupiter.api.Test

class PuzzleTwoTest {
    @Test
    fun `partOne should correctly solve part one of the puzzle on example data` () {
        val puzzleTwo = PuzzleTwo()

        val result = puzzleTwo.partOne(PuzzleTwo.EXAMPLE_FILE)

        Assertions.assertThat(result).isEqualTo(150L)
    }

    @Test
    fun `partOne should correctly solve part one of the puzzle on input data` () {
        val puzzleTwo = PuzzleTwo()

        val result = puzzleTwo.partOne(PuzzleTwo.INPUT_FILE)

        Assertions.assertThat(result).isEqualTo(1648020L)
    }

    @Test
    fun `partTwo should correctly solve part one of the puzzle on example data` () {
        val puzzleTwo = PuzzleTwo()

        val result = puzzleTwo.partTwo(PuzzleTwo.EXAMPLE_FILE)

        Assertions.assertThat(result).isEqualTo(900L)
    }

    @Test
    fun `partTwo should correctly solve part one of the puzzle on input data` () {
        val puzzleTwo = PuzzleTwo()

        val result = puzzleTwo.partTwo(PuzzleTwo.INPUT_FILE)

        Assertions.assertThat(result).isEqualTo(1759818555L)
    }
}