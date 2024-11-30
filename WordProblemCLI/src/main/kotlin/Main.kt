suspend fun main() {

    val message = GetInfoAwait()

    val num1 = Maths.NumbersList().getNumbers(5, 9);
    val num2 = Maths.NumbersList().getNumbers(2, 10);
    val op = Maths.Operators().operators();
    println(message.all(num1, op, num2));

    val a = Maths.AddNumbers(num1, num2)
    val s = Maths.SubNumbers(num1, num2);
    val m = Maths.MultiplyNumbers().Multiply(num1, num2);


    println("Enter Answer: ")
    val number = readLine()
    if (op.equals("+")) {

        println("Correct That: $num1 + $num2 = ${a.add(num1, num2)}")
    }

    if (op.equals("-")) {

        println("Correct That: $num1 - $num2 = ${s.Subtract(num1, num2)}")
    }


    if (op.equals("*")) {

        println("Correct That: $num1 * $num2 = ${m}")
    }



}
