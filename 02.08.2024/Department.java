class Department {
  private String departmentName;
  private String hodName;
  private int capacity = 3; // this is student capacity, total number of students;
  private int currentStudent = 0; 
  private Student[] students = new Student[capacity]; // new empty Student array create with capacity 3

  // Department constructor
  public Department(String dName, String hodName) {
    this.departmentName = dName;
    this.hodName = hodName;
  }

  // this method add new student
  // to students[] array, this array can hold max student 3
  public void addStudent(int roll, String name, double dgpa, int passYear) {
    // check total number of current student is greater than or equal to the capacity.
    // if about line is true, print following msg and return nothing.
    if (this.currentStudent >= this.capacity) {
      System.out.println("Faild to add student. Maximum student added.");
      return;
    };
    // creating new student and assign to the students array
    this.students[currentStudent] = new Student(roll, name, dgpa, passYear);
    // after adding student, increase currentStudent by 1
    this.currentStudent++;
  }

  // return department name
  public String getDept() {
    return this.departmentName;
  }

  // print all the students 
  public void printStudents() {
    for(int i=0; i<this.currentStudent; i++) {
      students[i].show();
      System.out.println("--------------------");
    }
  }

  // inner class named Student created
  // ***student class begin***
  class Student {
    private int roll;
    private String name;
    private double dgpa;
    private int passYear;

    // constructor for Student class
    public Student(int roll, String name, double dgpa, int passYear) {
      this.roll = roll;
      this.name = name;
      this.passYear = passYear;
    }

    // get roll of student class
    public int getRoll() {
      return this.roll;
    }

    // print student details
    public void show() {
      System.out.println("Name: " + name);
      System.out.println("Roll: " + roll);
      System.out.println("Pass Year: " + passYear);
    }
  }
// ***student class end***
  
  // this method is for Department class
  // it take roll (int) as a argument, and print student details
  public void searchRoll(int roll) {
    // following line is same as-> for(int i=0;i<students.length;i++){
    for(Student student: students) {
      // same as, if(roll==students[i].getRoll(){
      if (roll == student.getRoll()) {
        student.show();
        System.out.println("Department: "+ departmentName + "\n");
        return;
      };
    }
    // System.out.println("Student with roll '"+ roll +"' not found...");
  }

}

