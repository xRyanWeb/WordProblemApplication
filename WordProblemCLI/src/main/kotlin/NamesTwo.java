import kotlin.random.Random;
import java.util.ArrayList;
import java.util.List;

public class NamesTwo {

    public static int randomNumbers(int a) {

        return Random.Default.nextInt(a);

    }

    public static int NameTwo() {

        List<String> s = new ArrayList<>();
        s.add("Jake");
        s.add("Mike");
        s.add("Jack");
        s.add("Peter");
        s.add("Chris");

        return randomNumbers(s.size());


    }

    public static int NameTwos() {

        List<String> s = new ArrayList<>();
        s.add("Jake's");
        s.add("Mike's");
        s.add("Jack's");
        s.add("Peter's");
        s.add("Chris's");

        return randomNumbers(s.size());


    }
}