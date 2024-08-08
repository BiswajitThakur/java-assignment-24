class Department {
  private String departmentName;
  private String hodName;
  private int capacity = 3;
  private int currentStudent = 0;
  private Student[] students = new Student[capacity];

  public Department(String dName, String hodName) {
    this.departmentName = dName;
    this.hodName = hodName;
  }

  public void addStudent(int roll, String name, double dgpa, int passYear) {
    if (this.currentStudent >= this.capacity) {
      System.out.println("Faild to add student. Maximum student added.");
      return;
    };
    this.students[currentStudent] = new Student(roll, name, dgpa, passYear);
    this.currentStudent++;
  }

  public String getDept() {
    return this.departmentName;
  }

  public void printStudents() {
    for(int i=0; i<this.currentStudent; i++) {
      students[i].show();
      System.out.println("--------------------");
    }
  }

  class Student {
    private int roll;
    private String name;
    private double dgpa;
    private int passYear;

    public Student(int roll, String name, double dgpa, int passYear) {
      this.roll = roll;
      this.name = name;
      this.passYear = passYear;
    }

    public int getRoll() {
      return this.roll;
    }

    public void show() {
      System.out.println("Name: " + name);
      System.out.println("Roll: " + roll);
      System.out.println("Pass Year: " + passYear);
    }
  }

  public void searchRoll(int roll) {
    for(Student student: students) {
      if (roll == student.getRoll()) {
        student.show();
        System.out.println("Department: "+ departmentName + "\n");
        return;
      };
    }
    // System.out.println("Student with roll '"+ roll +"' not found...");
  }

}

