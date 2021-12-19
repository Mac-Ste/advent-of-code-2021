package com.macste.adventofcode.puzzle.two.submarine.command.consumers

import com.macste.adventofcode.puzzle.two.submarine.SubmarineState

class NaiveSubmarineCommandConsumer : SubmarineCommandConsumer {
    override fun onForward(value: Long, submarineState: SubmarineState) = with(submarineState) {
        SubmarineState(
            horizontalPosition = horizontalPosition + value,
            depth = depth,
            aim = aim
        )
    }

    override fun onDown(value: Long, submarineState: SubmarineState) = with(submarineState) {
        SubmarineState(
            horizontalPosition = horizontalPosition,
            depth = depth + value,
            aim = aim
        )
    }

    override fun onUp(value: Long, submarineState: SubmarineState) = with(submarineState) {
        SubmarineState(
            horizontalPosition = horizontalPosition,
            depth = depth - value,
            aim = aim
        )
    }
}