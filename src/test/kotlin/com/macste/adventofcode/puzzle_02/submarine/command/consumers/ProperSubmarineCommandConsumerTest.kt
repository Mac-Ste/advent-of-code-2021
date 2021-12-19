package com.macste.adventofcode.puzzle_02.submarine.command.consumers

import com.macste.adventofcode.puzzle_02.submarine.SubmarineState
import org.assertj.core.api.Assertions
import org.junit.jupiter.api.Test

internal class ProperSubmarineCommandConsumerTest {
    private val TEST_STATE = SubmarineState(5, 10, 3)
    private val ZERO_STATE = SubmarineState(0, 0, 0)

    @Test
    fun `onForward should calculate correct value from zero state`() {
        val properSubmarineCommandConsumer = ProperSubmarineCommandConsumer()

        val result = properSubmarineCommandConsumer.onForward(13, ZERO_STATE)

        Assertions.assertThat(result).isEqualTo(
            SubmarineState(13, 0, 0)
        )
    }

    @Test
    fun `onDown should calculate correct value from zero state`() {
        val properSubmarineCommandConsumer = ProperSubmarineCommandConsumer()

        val result = properSubmarineCommandConsumer.onDown(9, ZERO_STATE)

        Assertions.assertThat(result).isEqualTo(
            SubmarineState(0, 0, 9)
        )
    }

    @Test
    fun `onUp should calculate correct value from zero state `() {
        val properSubmarineCommandConsumer = ProperSubmarineCommandConsumer()

        val result = properSubmarineCommandConsumer.onUp(18, ZERO_STATE)

        Assertions.assertThat(result).isEqualTo(
            SubmarineState(0, 0, -18)
        )
    }

    @Test
    fun `onForward should calculate correct value from non-zero state`() {
        val properSubmarineCommandConsumer = ProperSubmarineCommandConsumer()

        val result = properSubmarineCommandConsumer.onForward(13, TEST_STATE)

        Assertions.assertThat(result).isEqualTo(
            SubmarineState(18, 49, 3)
        )
    }

    @Test
    fun `onDown should calculate correct value from non-zero state`() {
        val properSubmarineCommandConsumer = ProperSubmarineCommandConsumer()

        val result = properSubmarineCommandConsumer.onDown(3, TEST_STATE)

        Assertions.assertThat(result).isEqualTo(
            SubmarineState(5, 10, 6)
        )
    }

    @Test
    fun `onUp should calculate correct value from non-zero state `() {
        val properSubmarineCommandConsumer = ProperSubmarineCommandConsumer()

        val result = properSubmarineCommandConsumer.onUp(9, TEST_STATE)

        Assertions.assertThat(result).isEqualTo(
            SubmarineState(5, 10, -6)
        )
    }

}