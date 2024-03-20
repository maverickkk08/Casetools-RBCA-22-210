package Question12;
public class Shapemain {
    public static void main(String[] args) {
      
        Circle circle = new Circle(5);
        Triangle triangle = new Triangle(3, 4, 5);

   
        System.out.println("Circle:");
        System.out.println("Area: " + circle.calculateArea());
        System.out.println("Perimeter: " + circle.calculatePerimeter());

        System.out.println("\nTriangle:");
        System.out.println("Area: " + triangle.calculateArea());
        System.out.println("Perimeter: " + triangle.calculatePerimeter());
    }
}
