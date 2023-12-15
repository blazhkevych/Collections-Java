package Tasks.WorkingWithYourClass;

import java.util.HashSet;
import java.util.Set;

/**
 * The UserClassTask class demonstrates the usage of the User class and HashSet<User>.
 * It creates instances of the User class, adds them to a HashSet, and performs operations such as modifying
 * the user's name, resetting the HashSet, and displaying the users on the console.
 */
public class UserClassTask {

    /**
     * The main method that executes the tasks related to the User class and HashSet<User>.
     *
     * @param args The command-line arguments (not used in this context).
     */
    public static void main(String[] args) {
        // a. Create a User class with fields name, age, and phone
        // b. Create a userSet (HashSet<User>)
        Set<User> userSet = new HashSet<>();
        System.out.println("userSet: " + userSet);

        // c. Create 2 instances of the User class with the same fields and 1 instance with a different age
        User user1 = new User("John", 25, "123456789");
        User user2 = new User("John", 25, "123456789");
        User user3 = new User("John", 30, "123456789");

        // d. Add users to userSet
        userSet.add(user1);
        userSet.add(user2);
        userSet.add(user3);

        // e. Display users on the console
        System.out.println("userSet after adding users: " + userSet);

        // f. Override the hashCode method in the User class, specifying only the processing of the name field
        user1.setName("NewJohn");
        System.out.println("userSet after changing name in user1: " + userSet);

        // g. Display users on the console
        System.out.println("userSet after changing name in user1: " + userSet);

        // h. Override the hashCode method in the User class, specifying all fields
        userSet.clear();
        userSet.add(user1);
        userSet.add(user2);
        userSet.add(user3);

        // i. Display users on the console
        System.out.println("userSet after resetting and adding users: " + userSet);
    }
}
