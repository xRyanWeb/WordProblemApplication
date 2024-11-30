package Maths

import kotlin.random.Random

class NumbersList {

    fun getNumbers(a: Int, b:Int) :Int {
        val numbers = Random.Default.nextInt(a, b + 1)
        return numbers
    }
}