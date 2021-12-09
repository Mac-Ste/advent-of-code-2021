package com.macste.adventofcode.puzzle.one.util

fun List<Int>.countPositive() = count { it > 0 }

fun List<Int>.padZeros(leftPad: Int = 0, rightPad: Int = 0): List<Int> = toMutableList().apply {
    if (leftPad > 0) {
        addAll(0, List(leftPad) { 0 })
    }

    if (rightPad > 0) {
        addAll(List(rightPad) { 0 })
    }
}

fun List<Int>.differenceOfElementsWith(other: List<Int>): List<Int> {
    if (size != other.size) {
        throw IllegalStateException("Size mismatch for diff calculation! Original size: $size Other size: ${other.size}")
    }
    return zip(other, Int::minus)
}

fun List<Int>.differentiate() =
    if (isEmpty()) emptyList() else padZeros(rightPad = 1).differenceOfElementsWith(padZeros(leftPad = 1))
        .subList(1, size)

fun List<Int>.movingSum(windowSize: Int): List<Int> = if (isEmpty()) emptyList() else
    (1..windowSize).map { padZeros(leftPad = windowSize - it, rightPad = it - 1) }
        .reduce { acc, mutableList -> acc.zip(mutableList, Int::plus) }
        .subList(windowSize - 1, size)