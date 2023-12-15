package Tasks.WorkingWithYourClass;

import java.util.*;

/**
 * The User class represents a user with attributes such as name, age, and phone number.
 * It includes a constructor, getters, setters, and overrides of equals, hashCode, and toString methods.
 */
class User {
    private String name;
    private int age;
    private String phone;

    /**
     * Constructs a new User with the specified name, age, and phone number.
     *
     * @param name  The name of the user.
     * @param age   The age of the user.
     * @param phone The phone number of the user.
     */
    public User(String name, int age, String phone) {
        this.name = name;
        this.age = age;
        this.phone = phone;
    }

    /**
     * Gets the name of the user.
     *
     * @return The name of the user.
     */
    public String getName() {
        return name;
    }

    /**
     * Sets the name of the user.
     *
     * @param name The new name of the user.
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Gets the age of the user.
     *
     * @return The age of the user.
     */
    public int getAge() {
        return age;
    }

    /**
     * Sets the age of the user.
     *
     * @param age The new age of the user.
     */
    public void setAge(int age) {
        this.age = age;
    }

    /**
     * Gets the phone number of the user.
     *
     * @return The phone number of the user.
     */
    public String getPhone() {
        return phone;
    }

    /**
     * Sets the phone number of the user.
     *
     * @param phone The new phone number of the user.
     */
    public void setPhone(String phone) {
        this.phone = phone;
    }

    /**
     * Overrides the equals method to compare users based on name, age, and phone number.
     *
     * @param o The object to compare with.
     * @return True if the objects are equal, false otherwise.
     */
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        User user = (User) o;
        return age == user.age && name.equals(user.name) && Objects.equals(phone, user.phone);
    }

    /**
     * Overrides the hashCode method to generate a hash code based on name, age, and phone number.
     *
     * @return The hash code of the user.
     */
    @Override
    public int hashCode() {
        return Objects.hash(name, age, phone);
    }

    /**
     * Overrides the toString method to provide a string representation of the user.
     *
     * @return A string representation of the user.
     */
    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", phone='" + phone + '\'' +
                '}';
    }
}
