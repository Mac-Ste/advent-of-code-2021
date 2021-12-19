package com.macste.adventofcode.puzzle.two

import com.macste.adventofcode.puzzle.two.submarine.command.consumers.SubmarineCommandConsumer
import com.macste.adventofcode.puzzle.two.submarine.SubmarinePositionCalculator
import java.io.File

class PuzzleTwo {
    companion object {
        val EXAMPLE_FILE = File("data/puzzle_2/example.txt")
        val INPUT_FILE = File("data/puzzle_2/input.txt")
    }


    fun partOne(inputFile: File): Long {
        val submarineState = SubmarinePositionCalculator(inputFile.readLines())
            .calculateWith(SubmarineCommandConsumer.NAIVE)

        return submarineState.horizontalPosition * submarineState.depth
    }

    fun partTwo(inputFile: File): Long {
        val submarineState = SubmarinePositionCalculator(inputFile.readLines())
            .calculateWith(SubmarineCommandConsumer.PROPER)

        return submarineState.horizontalPosition * submarineState.depth
    }

}