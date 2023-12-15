package Tasks.List;

import java.util.*;

/**
 * This class demonstrates basic operations with ArrayList in Java.
 * It includes the creation of ArrayLists, adding elements, initializing one list with another,
 * inserting elements into the middle of a list, sorting in descending order, and removing every second element.
 * Additionally, it utilizes ListIterator for removing elements during iteration.
 */
public class ArrayListTask {

    /**
     * The main method that executes the ArrayList operations.
     *
     * @param args The command-line arguments (not used in this context).
     */
    public static void main(String[] args) {
        // a. Create an ArrayList<String> (list1)
        java.util.ArrayList<String> list1 = new java.util.ArrayList<>();
        System.out.println("list1: " + list1);

        // b. Create a string array. Add all elements from the array to the list (in one method call)
        String[] array = {"apple", "banana", "orange", "grape"};
        list1.addAll(Arrays.asList(array));
        System.out.println("list1 after adding array: " + list1);

        // c. Create a new ArrayList<String> (list2) and initialize it with the previous list (list1)
        java.util.ArrayList<String> list2 = new java.util.ArrayList<>(list1);
        System.out.println("list2 after initializing with list1: " + list2);

        // d. Create a list (list3) using Arrays.asList(...)
        List<String> list3 = Arrays.asList("kiwi", "pineapple", "melon");
        System.out.println("list3: " + list3);

        // e. Insert list3 into the middle of list2
        int middleIndex = list2.size() / 2;
        list2.addAll(middleIndex, list3);
        System.out.println("list2 after inserting list3 in the middle: " + list2);

        // f. Sort the list in descending order
        Collections.sort(list2, Collections.reverseOrder());
        System.out.println("list2 after sorting in descending order: " + list2);

        // g. *Remove every second element using ListIterator
        ListIterator<String> iterator = list2.listIterator();
        while (iterator.hasNext()) {
            iterator.next(); // skip one element
            if (iterator.hasNext()) {
                iterator.next();
                iterator.remove(); // remove the next element
            }
        }
        System.out.println("list2 after removing every second element: " + list2);

        // Output the final result
        System.out.println("Final List: " + list2);
    }
}

