import java.util.Scanner;

public class Demo {
  public static void main(String[] args) {

    Department cseDept = new Department("CSE", "KC"); // new department created 
    cseDept.addStudent(12, "Asikul Ali", 9.5d, 2024); // student added, now capacity=3, currentStudent=1
    cseDept.addStudent(99, "Sumit Gupta", 9.1d, 2024); // student added, now capacity=3, currentStudent=2
    cseDept.addStudent(22, "Susmita Barua", 10.0d, 2025); // student added, now capacity=3, currentStudent=3
    // now you can not add any student to cseDept
    // because, the current status is, capacity=3, currentStudent=3
    // if you want to add more students update capacity variable present in Department class

    Department itDept = new Department("IT", "ABC");
    itDept.addStudent(3, "Foo", 8.9d, 2023);
    itDept.addStudent(4, "Bar", 7.3d, 2024);
    itDept.addStudent(5, "Demo Name", 9.5d, 2025);

    Department ctDept = new Department("CT", "XYZ");
    ctDept.addStudent(75, "Nikhil", 7.9d, 2024);
    ctDept.addStudent(41, "Rahul", 9.3d, 2023);
    ctDept.addStudent(55, "Nancy", 9.0d, 2023);

    Department[] dp = new Department[3]; // new array created to store Department
    dp[0] = cseDept; // assignment cseDept at index 0 to the array
    dp[1] = itDept;
    dp[2] = ctDept;

    Scanner sc = new Scanner(System.in);

    System.out.print("Enter roll: ");
    int roll = sc.nextInt();
    sc.nextLine();
    
    for(Department d: dp) {
      d.searchRoll(roll);
    };
    System.out.println();
    System.out.print("Enter department: ");
    String dept = sc.nextLine();
    System.out.println("--------------------");
    for(Department d: dp) {
      if (d.getDept().equalsIgnoreCase(dept)) {
        d.printStudents();
      };
    };
    sc.close();
  }
}
