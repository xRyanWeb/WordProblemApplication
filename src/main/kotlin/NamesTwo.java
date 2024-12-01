import kotlin.random.Random;
import java.util.ArrayList;
import java.util.List;

public class NamesTwo {

    public static int randomNumbers(int a) {

        return Random.Default.nextInt(a);

    }

    public static String NameTwo() {

        List<String> s = new ArrayList<>();
        s.add("Jake");
        s.add("Mike");
        s.add("Jack");
        s.add("Peter");
        s.add("Chris");

        return s.get(randomNumbers(s.size()));



    }

    public static String NameTwos() {

        List<String> s = new ArrayList<>();
        s.add("Jake's");
        s.add("Mike's");
        s.add("Jack's");
        s.add("Peter's");
        s.add("Chris's");

        return s.get(randomNumbers(s.size()));


    }
}