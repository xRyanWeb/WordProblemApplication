import kotlinx.coroutines.delay

class GetInfoAwait {

    suspend fun all(num1: Int, op:String, num2: Int):String {
        delay(1000L);

        return "What is: $num1 $op $num2"
    }

}
