package Maths

import kotlin.math.abs

class SubNumbers(num1: Int, num2: Int) {

    suspend fun Subtract(a:Int, b:Int):Int {
        return abs(a - b)
    }
}