package com.macste.adventofcode.puzzle_02.submarine.command.consumers

import com.macste.adventofcode.puzzle_02.submarine.SubmarineState
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test


internal class NaiveSubmarineCommandConsumerTest {
    private val TEST_STATE = SubmarineState(5, 10, 3)
    private val ZERO_STATE = SubmarineState(0, 0, 0)

    @Test
    fun `onForward should calculate correct value from zero state`() {
        val naiveSubmarineCommandConsumer = NaiveSubmarineCommandConsumer()

        val result = naiveSubmarineCommandConsumer.onForward(13, ZERO_STATE)

        assertThat(result).isEqualTo(
            SubmarineState(13, 0, 0)
        )
    }

    @Test
    fun `onDown should calculate correct value from zero state`() {
        val naiveSubmarineCommandConsumer = NaiveSubmarineCommandConsumer()

        val result = naiveSubmarineCommandConsumer.onDown(9, ZERO_STATE)

        assertThat(result).isEqualTo(
            SubmarineState(0, 9, 0)
        )
    }

    @Test
    fun `onUp should calculate correct value from zero state `() {
        val naiveSubmarineCommandConsumer = NaiveSubmarineCommandConsumer()

        val result = naiveSubmarineCommandConsumer.onUp(18, ZERO_STATE)

        assertThat(result).isEqualTo(
            SubmarineState(0, -18, 0)
        )
    }

    @Test
    fun `onForward should calculate correct value from non-zero state`() {
        val naiveSubmarineCommandConsumer = NaiveSubmarineCommandConsumer()

        val result = naiveSubmarineCommandConsumer.onForward(13, TEST_STATE)

        assertThat(result).isEqualTo(
            SubmarineState(18, 10, 3)
        )
    }

    @Test
    fun `onDown should calculate correct value from non-zero state`() {
        val naiveSubmarineCommandConsumer = NaiveSubmarineCommandConsumer()

        val result = naiveSubmarineCommandConsumer.onDown(3, TEST_STATE)

        assertThat(result).isEqualTo(
            SubmarineState(5, 13, 3)
        )
    }

    @Test
    fun `onUp should calculate correct value from non-zero state `() {
        val naiveSubmarineCommandConsumer = NaiveSubmarineCommandConsumer()

        val result = naiveSubmarineCommandConsumer.onUp(9, TEST_STATE)

        assertThat(result).isEqualTo(
            SubmarineState(5, 1, 3)
        )
    }

}