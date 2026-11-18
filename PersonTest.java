public class PersonTest {
    public static void main(String[] args) {
        // 1. Create three Person objects
        Person p1 = new Person("Alice", 20, "Kigali", 1.65);
        Person p2 = new Person("Bob", 22, "Musanze", 1.78);
        Person p3 = new Person("Carol", 19, "Huye", 1.60);

        p1.displayInfo();
        p2.displayInfo();
        p3.displayInfo();

        // 2. Test setHeight() on at least two objects
        p1.setHeight(1.68);
        p2.setHeight(1.80);

        // 3. Test haveBirthday()
        p3.haveBirthday();

        // 4. Loop: create 5 additional Person objects
        for (int i = 1; i <= 5; i++) {
            Person p = new Person("Person" + i, 18 + i, "City" + i, 1.50 + i * 0.05);
            p.displayInfo();
        }

        // 5. Display total people (should be 8)
        Person.showTotalPeople();
    }
}