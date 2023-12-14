import java.util.HashMap;
import java.util.Scanner;

/**
 * Project
 */
class Student {
     public String name;
    public int rollno;
    public int age;
    public int marks;
    public Student(String name, int rollno, int age, int marks){
        this.name = name;
        this.rollno = rollno;
        this.age = age;
        this.marks = marks;
    }
    public void viewStudent(){
        System.out.println("Name : "+ name);
        System.out.println("rollno : "+ rollno);
        System.out.println("age : "+ age);
        System.out.println("Marks : "+ marks);

    }
}
public class Project {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        HashMap<Integer, Student> map = new HashMap<>();
        while (true) {
            
            System.out.println("1. Add Student ");
            System.out.println("2. View Student ");
            System.out.println("3. Search Student  ");
            System.out.println("4. Calculate Average Marks ");
            System.out.println("5. Exit ");
            System.out.print("Enter ur choice : ");
            int choice = sc.nextInt();
            sc.nextLine();
            switch (choice) {
                case 1: System.out.print("Enter ur name: ");
                        String name =sc.nextLine();
                        System.out.print("Enter ur rollno: ");
                        int rollno = sc.nextInt();
                        System.out.print("Enter yr age: ");
                        int aage = sc.nextInt();
                        System.out.print("Enter yr marks: ");
                        int marks = sc.nextInt();
                        Student std = new Student(name, rollno, aage, marks);
                        map.put(rollno, std);
                        System.out.println("Student added successsfuly");
                    break;
                case 2: System.out.println("List of student: ");
                        for(Student e : map.values()){
                            e.viewStudent();
                        }
                    break;
                case 3: System.out.print("Enter yr rollno: 👉");
                        int roll = sc.nextInt();
                        Student data = map.get(roll);
                        if (data!=null) {
                            data.viewStudent();
                        } else {
                        System.out.println("Student is not found 👹 ");
                    }
                        System.out.println("--------(...)----|||||||||");
                    break;
                case 4: 
                        int tstd = map.size();
                        int tmarks = 0 ; 
                        for (Student j : map.values()) {
                            tmarks += j.marks;
                        }
                        double avg = (double)tmarks/tstd;   
                        System.out.println("Average marks : "+ avg);
                    break;
                case 5: System.exit(0); 
                    break;
                default: System.out.println("Invalid choice");
                    break;

        }
    }

}}