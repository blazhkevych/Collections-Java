package Tasks.Map;

import java.util.*;

/**
 * This class demonstrates various operations with Java maps, including the usage of LinkedHashMap and HashMap.
 * It performs tasks such as adding months to a LinkedHashMap, modifying specific entries,
 * copying values between maps, and creating a map with information about students' contacts.
 */
public class MapTask {
    private static final String VACATION = "ОТПУСК";

    /**
     * The main method that executes the map-related tasks.
     *
     * @param args The command-line arguments (not used in this context).
     */
    public static void main(String[] args) {
        // a. Create a LinkedHashMap<Integer, String> (map1)
        Map<Integer, String> map1 = new LinkedHashMap<>();
        System.out.println("map1: " + map1);

        // b. Add month values to map1 (month number : month name)
        for (int i = 0; i < 12; i++) {
            map1.put(i, getMonthName(i));
        }
        System.out.println("map1 after adding months: " + map1);

        // c. Display the first and last month of the year (0 and 11)
        System.out.println("First month: " + map1.get(0));
        System.out.println("Last month: " + map1.get(11));

        // d. Replace the 6th month with the word 'ОТПУСК' and display the result
        map1.put(6, VACATION);
        System.out.println("map1 after inserting 'ОТПУСК' in the 6th month: " + map1);

        // e. Create a HashMap<Integer, String> (map2)
        Map<Integer, String> map2 = new HashMap<>();
        System.out.println("map2: " + map2);

        // f. Copy all values from map1 to map2
        map2.putAll(map1);
        System.out.println("map2 after copying values from map1: " + map2);

        // g. *Create a method to print all entries of a map to the console (EntrySet< Integer, String >)
        printMapEntries(map1, "map1");
        printMapEntries(map2, "map2");

        // h. *Create a map3 (key – student name (String), value - student contacts:
        // mobile number, email, skype (Set<String>))
        Map<String, Set<String>> map3 = new HashMap<>();
        map3.put("John", new HashSet<>(Arrays.asList("123456789", "john@example.com", "john_skype")));
        map3.put("Alice", new HashSet<>(Arrays.asList("987654321", "alice@example.com", "alice_skype")));
        System.out.println("map3: " + map3);
    }

    /**
     * A helper method to print all entries of a map to the console.
     *
     * @param map     The map to be printed.
     * @param mapName The name of the map (used for identification in the output).
     */
    private static void printMapEntries(Map<Integer, String> map, String mapName) {
        System.out.println(mapName + " entries:");
        for (Map.Entry<Integer, String> entry : map.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }

    /**
     * A helper method to get the name of a month based on its number.
     *
     * @param month The number of the month (0 to 11).
     * @return The name of the month.
     */
    private static String getMonthName(int month) {
        return switch (month) {
            case 0 -> "January";
            case 1 -> "February";
            case 2 -> "March";
            case 3 -> "April";
            case 4 -> "May";
            case 5 -> "June";
            case 6 -> "July";
            case 7 -> "August";
            case 8 -> "September";
            case 9 -> "October";
            case 10 -> "November";
            case 11 -> "December";
            default -> "Invalid month";
        };
    }
}
