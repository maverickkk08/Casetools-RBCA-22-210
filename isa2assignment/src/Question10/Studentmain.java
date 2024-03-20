package Question10;
public class Studentmain {
    public static void main(String[] args) {
        // Creating objects of Student class
        Student student1 = new Student();
        Student student2 = new Student();
        Student student3 = new Student();

        
        student1.setInfo("Alice", 20);
        student2.setInfo("Bob", 22, "123 Main St");
        student3.setInfo("Charlie", 25, "456 Elm St");

       
        System.out.println("Student 1:");
        student1.printInfo();
        System.out.println();

        System.out.println("Student 2:");
        student2.printInfo();
        System.out.println();

        System.out.println("Student 3:");
        student3.printInfo();
    }
}
