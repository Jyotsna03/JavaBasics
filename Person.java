public class Person {
    private String name;
    private int age;
    // Constructor to initialize the Person object with name and age
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }
    // Getter method for name
    public String getName() {
        return name;
    }

    // Getter method for age
    public int getAge() {
        return age;
    }
    public static void main(String[] args) {
        // Create two Person objects
        Person person1 = new Person("Alice", 25);
        Person person2 = new Person("Bob", 30);

        // Print information about person1
        System.out.println("Person 1 - Name: " + person1.getName() + ", Age: " + person1.getAge());
     // Print information about person2
        System.out.println("Person 2 - Name: " + person2.getName() + ", Age: " + person2.getAge());;}
    }