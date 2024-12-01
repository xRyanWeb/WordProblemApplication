import Numbers.Numbers
import SubNumbers;
import Operators


fun main() {


    val message = GetInfoAwait()


    val Names1 = NamesOne.NameOne();
    val Names2 = NamesTwo.NameTwo();

    val num1 = Numbers();
    val num2 = Numbers()

    val op = Operators().operators();

    val a = AddNumbers(num1, num2)
    val s = SubNumbers(num1, num2);
    val m = MultiplyNumbers(num1, num2)


    val resultName = when(num1 < 3) {
        true -> NamesOne.NameOne();
        false -> NamesOne.NameOnes();
    }

    val resultTwo = when(num1 < 3) {
        true -> NamesTwo.NameTwo()
        false -> NamesTwo.NameTwos()
    }

    println("$resultName had ")


    println("Enter Answer: ")
    val number = readLine()

    if (op.equals("+")) {

        println("Correct That: $num1 + $num2 = ${a.add(num1, num2)}")
    }

    else if (op == "+") {

        println("Correct Answer: $num1 + $num2 = ${a.add(num1, num2)}")
    }

    if (op.equals("-")) {

        println("Correct That: $num1 - $num2 = ${s.subtract(num1, num2)}")
    }

    else if (op == "-") {

        println("Correct Answer: $num1 - $num2 = ${s.subtract(num1, num2)}")
    }


    if (op.equals("*")) {

        println("Correct That: $num1 * $num2 = ${m}")
    }

    else if (op == "*") {

        println("Correct Answer: $num1 * $num2 = ${m}")
    }


}
