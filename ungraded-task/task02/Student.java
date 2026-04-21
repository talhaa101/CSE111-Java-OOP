public class Student {

   // Static variable (সব student এর জন্য common)
   private static int total = 0;
   private static int cseCount = 0;
   private static int otherCount = 0;

   // Instance variable
   private int id;
   private String name;
   private double cgpa;
   private String dept;

   // Constructor 1: name + cgpa (default CSE)
   public Student(String name, double cgpa) {
       this.name = name;
       this.cgpa = cgpa;
       this.dept = "CSE";

       // ID assign
       total++;
       this.id = total;

       // count update
       cseCount++;
   }

   // Constructor 2: name + cgpa + dept
   public Student(String name, double cgpa, String dept) {
       this.name = name;
       this.cgpa = cgpa;
       this.dept = dept;

       total++;
       this.id = total;

       // dept check
       if (dept.equals("CSE")) {
           cseCount++;
       } else {
           otherCount++;
       }
   }

   // static factory method (object create করবে)
   public static Student createStudent(String name, double cgpa) {
       return new Student(name, cgpa); // default CSE
   }

   // individual detail print
   public void individualDetail() {
       System.out.println("ID: " + id);
       System.out.println("Name: " + name);
       System.out.println("CGPA: " + cgpa);
       System.out.println("Department: " + dept);
   }

   // static method: সব student info
   public static void printDetails() {
       System.out.println("Total Student(s): " + total);
       System.out.println("CSE Student(s): " + cseCount);
       System.out.println("Other Department Student(s): " + otherCount);
   }
}
