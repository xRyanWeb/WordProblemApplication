import java.util.ArrayList;
import java.util.List;

public class FruitNameOne {

    public static String FruitNameOne() {

        List<String> one = new ArrayList<String>();
        one.add("Apple");
        one.add("Grape");
        one.add("Banana");
        one.add("Lemon");
        one.add("Pear");
        one.add("Peach");

        return one.get(NamesOne.randomNumbers(one.size()));


    }

    public String FruitNameOnes() {

        List<String> one = new ArrayList<String>();
        one.add("Apple's");
        one.add("Grape's");
        one.add("Banana's");
        one.add("Lemon's");
        one.add("Pear's");
        one.add("Peach's");

        return one.get(NamesOne.randomNumbers(one.size()));


    }
}
