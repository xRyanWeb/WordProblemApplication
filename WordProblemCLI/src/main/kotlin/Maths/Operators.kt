package Maths

import kotlin.random.Random

public class Operators {

    fun operators(): String {

        val listOp = listOf<String>("+", "-", "*");

        val ops = Random.Default.nextInt(listOp.count())

        return listOp[ops];
    }
}