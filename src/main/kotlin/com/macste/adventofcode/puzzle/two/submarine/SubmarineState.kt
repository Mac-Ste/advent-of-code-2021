package com.macste.adventofcode.puzzle.two.submarine

data class SubmarineState(
    val horizontalPosition: Long,
    val depth: Long,
    val aim: Long = 0
)