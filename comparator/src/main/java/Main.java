import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Person p1=new Person("Abraham", "Wilson", 29);
        Person p2=new Person("David", "Melton", 30);
        Person p3=new Person("Abraham", "Melton", 42);
        Person p4=new Person("Emory", "Stokes", 10);

        List<Person> list=new ArrayList<>();

        list.add(p1);
        list.add(p2);
        list.add(p3);
        list.add(p4);

        // Print the unsorted list
        System.out.println("Unsorted list");
        for (Person p:list) {
            System.out.println(p.toString());
        }

        // Sort by the last name AND the first name
        Collections.sort(list);
        System.out.println("\nSorted by the last name and the first name");
        for (Person p:list) {
            System.out.println(p);
        }

        // Sorted by the first name only
        Collections.shuffle(list);
        Collections.sort(list, new PersonFirstNameComparator());
        System.out.println("\nSorted by the first name only");
        for (Person p:list) {
            System.out.println(p);
        }

        // Sorted by the last name only
        Collections.shuffle(list);
        Collections.sort(list, new PersonLastNameComparator());
        System.out.println("\nSorted by the last name only");
        for (Person p:list) {
            System.out.println(p);
        }

        // Sorted by the age
        Collections.shuffle(list);
        Collections.sort(list, new PersonAgeComparator());
        System.out.println("\nSorted by the age");
        for (Person p:list) {
            System.out.println(p);
        }
    }

}
