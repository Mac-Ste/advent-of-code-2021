package com.macste.adventofcode.puzzle_02.submarine

import com.macste.adventofcode.puzzle_02.submarine.command.consumers.SubmarineCommandConsumer
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.BeforeEach
import org.junit.jupiter.api.Test
import org.mockito.ArgumentMatchers.anyLong
import org.mockito.ArgumentMatchers.eq
import org.mockito.Mockito.mock
import org.mockito.Mockito.times
import org.mockito.kotlin.any
import org.mockito.kotlin.verify
import org.mockito.kotlin.verifyNoInteractions
import org.mockito.kotlin.whenever


internal class SubmarinePositionCalculatorTest {
    private lateinit var mockSubmarineCommandConsumer: SubmarineCommandConsumer
    private lateinit var submarinePositionCalculator: SubmarinePositionCalculator
    private val FOWARD_RESULT = SubmarineState(1, 0, 0)
    private val DOWN_RESULT = SubmarineState(0, 1, 0)
    private val UP_RESULT = SubmarineState(0, 0, 1)
    private val INITIAL_RESULT = SubmarineState(0, 0, 0)


    @BeforeEach
    fun setup() {
        mockSubmarineCommandConsumer = mock(SubmarineCommandConsumer::class.java)
        whenever(mockSubmarineCommandConsumer.onForward(anyLong(), any())).thenReturn(FOWARD_RESULT)
        whenever(mockSubmarineCommandConsumer.onDown(anyLong(), any())).thenReturn(DOWN_RESULT)
        whenever(mockSubmarineCommandConsumer.onUp(anyLong(), any())).thenReturn(UP_RESULT)
    }

    @Test
    fun `calculateWith should execute correct commands via specified consumer`() {
        submarinePositionCalculator = SubmarinePositionCalculator(
            listOf(
                "forward 3",
                "forward 3",
                "down 2",
                "up 1",
                "up 1",
                "up 1",
            )
        )

        submarinePositionCalculator.calculateWith(mockSubmarineCommandConsumer)

        verify(mockSubmarineCommandConsumer, times(2)).onForward(eq(3L), any())
        verify(mockSubmarineCommandConsumer, times(1)).onDown(eq(2L), any())
        verify(mockSubmarineCommandConsumer, times(3)).onUp(eq(1L), any())
    }

    @Test
    fun `calculateWith should return correct result from consumer`() {
        submarinePositionCalculator = SubmarinePositionCalculator(listOf("forward 3"))

        var result = submarinePositionCalculator.calculateWith(mockSubmarineCommandConsumer)

        verify(mockSubmarineCommandConsumer).onForward(eq(3L), any())
        assertThat(result).isEqualTo(FOWARD_RESULT)

        submarinePositionCalculator = SubmarinePositionCalculator(listOf("down 3"))

        result = submarinePositionCalculator.calculateWith(mockSubmarineCommandConsumer)

        verify(mockSubmarineCommandConsumer).onDown(eq(3L), any())
        assertThat(result).isEqualTo(DOWN_RESULT)

        submarinePositionCalculator = SubmarinePositionCalculator(listOf("up 3"))

        result = submarinePositionCalculator.calculateWith(mockSubmarineCommandConsumer)

        verify(mockSubmarineCommandConsumer).onUp(eq(3L), any())
        assertThat(result).isEqualTo(UP_RESULT)
    }

    @Test
    fun `calculateWith should do nothing if list is empty`() {
        submarinePositionCalculator = SubmarinePositionCalculator(emptyList())

        val result = submarinePositionCalculator.calculateWith(mockSubmarineCommandConsumer)

        verifyNoInteractions(mockSubmarineCommandConsumer)
        assertThat(result).isEqualTo(INITIAL_RESULT)
    }

}