package Tasks.Set;

import java.util.*;

/**
 * This class demonstrates basic operations with Java sets, including the usage of HashSet and LinkedHashSet.
 * It performs tasks such as adding arbitrary strings to a HashSet, inserting elements from lists into sets,
 * creating a LinkedHashSet, and displaying the values of the sets on the console.
 */
public class SetTask {

    /**
     * The main method that executes the set-related tasks.
     *
     * @param args The command-line arguments (not used in this context).
     */
    public static void main(String[] args) {
        // a. Create a HashSet<String> (set1)
        Set<String> set1 = new HashSet<>();
        System.out.println("set1: " + set1);

        // b. Add two arbitrary strings to set1
        set1.add("apple");
        set1.add("banana");
        System.out.println("set1 after adding two arbitrary strings: " + set1);

        // c. Add all elements from list1 and list2 to set1
        List<String> list1 = Arrays.asList("orange", "grape");
        List<String> list2 = Arrays.asList("kiwi", "pineapple", "melon");
        set1.addAll(list1);
        set1.addAll(list2);
        System.out.println("set1 after adding elements from list1 and list2: " + set1);

        // d. Display the values of set1
        System.out.println("Values of set1: " + set1);

        // e. Create a LinkedHashSet<String> (set2)
        Set<String> set2 = new LinkedHashSet<>();
        System.out.println("set2: " + set2);

        // f. Add all elements from list2 and a duplicate entry from list3 to set2
        set2.addAll(list2);
        set2.addAll(Arrays.asList("kiwi", "pineapple", "melon"));
        System.out.println("set2 after adding elements from list2 and list3: " + set2);

        // g. Display the values of set2
        System.out.println("Values of set2: " + set2);
    }
}

