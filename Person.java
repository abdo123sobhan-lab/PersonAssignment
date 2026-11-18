public class Person {
    // Instance variables
    String name;
    int age;
    String city;
    double height; // in meters

    // Static variable
    static int totalPeople = 0;

    // Constructor: assigns values and increments the counter
    public Person(String name, int age, String city, double height) {
        this.name = name;
        this.age = age;
        this.city = city;
        this.height = height;
        totalPeople++;
    }

    // Prints all information with labels
    public void displayInfo() {
        System.out.println("Name:   " + name);
        System.out.println("Age:    " + age);
        System.out.println("City:   " + city);
        System.out.println("Height: " + height + " m");
        System.out.println("--------------------");
    }

    // Sets a new height and prints old -> new
    public void setHeight(double h) {
        double oldHeight = height; // local variable
        height = h;
        System.out.println(name + "'s height changed: " + oldHeight + " -> " + height);
    }

    // Increases age by 1 and prints a birthday message
    public void haveBirthday() {
        age++;
        System.out.println("Happy Birthday, " + name + "! You are now " + age + " years old.");
    }

    // Static method: shows total number of people created
    public static void showTotalPeople() {
        System.out.println("Total people created: " + totalPeople);
    }
}