import java.util.ArrayList;
import java.util.List;

public class FruitNameTwo {

    public static String FruitNameTwo() {

        List<String> one = new ArrayList<String>();
        one.add("Mango");
        one.add("Strawberry");
        one.add("Kiwi");
        one.add("Blueberry");
        one.add("Plum");
        one.add("Wildberry");

        return one.get(NamesOne.randomNumbers(one.size()));


    }

    public String FruitNameTwos() {

        List<String> one = new ArrayList<String>();
        one.add("Mango's");
        one.add("Strawberry's");
        one.add("Kiwi's");
        one.add("Blueberry's");
        one.add("Plum's");
        one.add("Wildberry's");

        return one.get(NamesOne.randomNumbers(one.size()));


    }
}
