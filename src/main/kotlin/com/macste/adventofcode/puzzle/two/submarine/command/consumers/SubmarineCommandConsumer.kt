package com.macste.adventofcode.puzzle.two.submarine.command.consumers

import com.macste.adventofcode.puzzle.two.submarine.SubmarineState

interface SubmarineCommandConsumer {

    companion object {
        val NAIVE = NaiveSubmarineCommandConsumer()
        val PROPER = ProperSubmarineCommandConsumer()
    }

    fun onForward(value: Long, submarineState: SubmarineState): SubmarineState
    fun onDown(value: Long, submarineState: SubmarineState): SubmarineState
    fun onUp(value: Long, submarineState: SubmarineState): SubmarineState
}