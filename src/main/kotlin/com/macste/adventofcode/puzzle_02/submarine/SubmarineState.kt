package com.macste.adventofcode.puzzle_02.submarine

data class SubmarineState(
    val horizontalPosition: Long,
    val depth: Long,
    val aim: Long = 0
)