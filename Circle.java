public class Circle {
    // Radius attribute
    private double radius;

    // Constructor to initialize the Circle object with a radius
    public Circle(double radius) {
        this.radius = radius;
    }

    // Getter method for radius
    public double getRadius() {
        return radius;
    }

    // Setter method for radius
    public void setRadius(double radius) {
        this.radius = radius;
    }

    // Method to calculate the area of the circle
    public double calculateArea() {
        return Math.PI * radius * radius;
    }

    // Method to calculate the circumference of the circle
    public double calculateCircumference() {
        return 2 * Math.PI * radius;
    }

    public static void main(String[] args) {
        // Create a Circle object with a radius of 5.0
        Circle circle = new Circle(5.0);

        // Access and modify the radius
        System.out.println("Radius: " + circle.getRadius());

        // Calculate and print the area of the circle
        double area = circle.calculateArea();
        System.out.println("Area: " + area);

        // Calculate and print the circumference of the circle
        double circumference = circle.calculateCircumference();
        System.out.println("Circumference: " + circumference);

        // Modify the radius and calculate the area and circumference again
        circle.setRadius(7.5);
        System.out.println("Updated Radius: " + circle.getRadius());
        area = circle.calculateArea();
        System.out.println("Updated Area: " + area);
        circumference = circle.calculateCircumference();
        System.out.println("Updated Circumference: " + circumference);}
}
