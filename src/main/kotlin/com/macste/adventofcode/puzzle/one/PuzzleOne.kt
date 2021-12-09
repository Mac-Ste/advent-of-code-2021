package com.macste.adventofcode.puzzle.one

import com.macste.adventofcode.puzzle.one.util.countPositive
import com.macste.adventofcode.puzzle.one.util.differentiate
import com.macste.adventofcode.puzzle.one.util.movingSum
import java.io.File

class PuzzleOne {
    companion object {
        val EXAMPLE_FILE = File("data/puzzle_1/example.txt")
        val INPUT_FILE = File("data/puzzle_1/input.txt")
    }

    fun partOne(inputFile: File): Int {
        val input =  inputFile.readLines().map { it.toInt() }.toMutableList()
        return input.differentiate().countPositive()
    }

    fun partTwo(inputFile: File): Int {
        val input = inputFile.readLines().map { it.toInt() }.toMutableList()
        return input.movingSum(windowSize = 3).differentiate().countPositive()
    }
}