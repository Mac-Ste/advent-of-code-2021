package com.macste.adventofcode.puzzle_01

import com.macste.adventofcode.puzzle_01.util.countPositive
import com.macste.adventofcode.puzzle_01.util.differentiate
import com.macste.adventofcode.puzzle_01.util.movingSum
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