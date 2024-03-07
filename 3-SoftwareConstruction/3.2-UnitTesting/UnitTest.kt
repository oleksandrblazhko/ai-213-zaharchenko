package com.example.safeco.unitTest

import com.example.safeco.HealthActivity
import junit.framework.TestCase.assertEquals
import org.junit.Test

class QuestionParamsTest {
    @Test
    fun testCase1_1() {
        val tcResult = HealthActivity.setQuestionParams(checkTime = 1, minQuestion = 0.75f)
        assertEquals(1, tcResult)
    }

    @Test
    fun testCase1_2() {
        val tcResult = HealthActivity.setQuestionParams(checkTime = -1, minQuestion = 0.5f)
        assertEquals(-1, tcResult)
    }

    @Test
    fun testCase1_3() {
        val tcResult = HealthActivity.setQuestionParams(checkTime = 1, minQuestion = -2f)
        assertEquals(-2, tcResult)
    }
}
