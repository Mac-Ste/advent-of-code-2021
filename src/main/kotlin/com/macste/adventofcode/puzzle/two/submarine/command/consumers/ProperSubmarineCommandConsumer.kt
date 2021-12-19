package com.macste.adventofcode.puzzle.two.submarine.command.consumers

import com.macste.adventofcode.puzzle.two.submarine.SubmarineState

class ProperSubmarineCommandConsumer : SubmarineCommandConsumer {
    override fun onForward(value: Long, submarineState: SubmarineState) = with(submarineState) {
        SubmarineState(
            horizontalPosition = horizontalPosition + value,
            depth = depth + aim*value,
            aim = aim
        )
    }

    override fun onDown(value: Long, submarineState: SubmarineState) = with(submarineState) {
        SubmarineState(
            horizontalPosition = horizontalPosition,
            depth = depth,
            aim = aim + value
        )
    }

    override fun onUp(value: Long, submarineState: SubmarineState)= with(submarineState) {
        SubmarineState(
            horizontalPosition = horizontalPosition,
            depth = depth,
            aim = aim - value
        )
    }
}