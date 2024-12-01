import java.util.Random;
import java.util.ArrayList;
import java.util.List;

public class NamesOne {

    public static int randomNumbers(int a) {

        Random r = new Random();
        return r.nextInt(a);

    }

    public static int NameOne() {
    
        List<String> s = new ArrayList<>();
        s.add("James");
        s.add("Joey");
        s.add("John");
        s.add("Luke");
        s.add("Matt");

        return randomNumbers(s.size());



    }

    public static int NameOnes() {

        List<String> s = new ArrayList<>();
        s.add("James's");
        s.add("Joey's");
        s.add("John's");
        s.add("Luke's");
        s.add("Matt's");

        return randomNumbers(s.size());



    }

}