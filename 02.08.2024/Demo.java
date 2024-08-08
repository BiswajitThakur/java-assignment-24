import java.util.Scanner;

public class Demo {
  public static void main(String[] args) {

    Department cseDept = new Department("CSE", "KC");
    cseDept.addStudent(12, "Asikul Ali", 9.5d, 2024);
    cseDept.addStudent(99, "Sumit Gupta", 9.1d, 2024);
    cseDept.addStudent(22, "Susmita Barua", 10.0d, 2025);
    

    Department itDept = new Department("IT", "ABC");
    itDept.addStudent(3, "Foo", 8.9d, 2023);
    itDept.addStudent(4, "Bar", 7.3d, 2024);
    itDept.addStudent(5, "Demo Name", 9.5d, 2025);

    Department ctDept = new Department("CT", "XYZ");
    ctDept.addStudent(75, "Nikhil", 7.9d, 2024);
    ctDept.addStudent(41, "Rahul", 9.3d, 2023);
    ctDept.addStudent(55, "Nancy", 9.0d, 2023);

    Department[] dp = new Department[3];
    dp[0] = cseDept;
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
