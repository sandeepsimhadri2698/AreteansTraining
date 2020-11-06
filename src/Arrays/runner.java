package Arrays;

import java.util.ArrayList;
import java.util.List;

public class runner {
    public static void main(String[] args) {
        ArrayList personList = new ArrayList<>();
        personList.add("Sandeep");
        personList.add(24);
        personList.add(10000.0f);
        Person user = new Person(personList);
        System.out.println(personList);
    }
}
