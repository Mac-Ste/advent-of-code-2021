package com.macste.adventofcode.puzzle.two.submarine

import com.macste.adventofcode.puzzle.two.submarine.command.consumers.SubmarineCommandConsumer

class SubmarinePositionCalculator(private val commandList: List<String>) {

   fun calculateWith(submarineCommandConsumer: SubmarineCommandConsumer): SubmarineState {
        var currentState = SubmarineState(0, 0, 0)

        commandList.forEach {
            val split = it.split(" ")
            val direction = split[0]
            val value = split[1].toLong()

            currentState = when(direction) {
                "forward" -> submarineCommandConsumer.onForward(value, currentState)
                "down" -> submarineCommandConsumer.onDown(value, currentState)
                "up" -> submarineCommandConsumer.onUp(value, currentState)
                else -> currentState
            }
        }

        return currentState
    }
}