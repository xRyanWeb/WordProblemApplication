package ListNames

import kotlin.random.Random

class NamesList1 {

    suspend fun NamesList(): String {
        val nameOne = listOf<String>()


        nameOne.toMutableList().add("James");
        nameOne.toMutableList().add("John");
        nameOne.toMutableList().add("Joey");

        val randomName1 = Random.nextInt(nameOne.count());

        return nameOne[randomName1];

    }
}