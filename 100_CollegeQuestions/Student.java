public class Student {
    int ID;
    String name;
    int marks;
    Student(int id,String name,int marks) {
      this.ID = id;
      this.name = name;
      this.marks = marks;
    }

  public void displayStudent() {
    
    System.out.println(ID);
    System.out.println(name);
    System.out.print(marks);
  }
  public static void main(String[] args) {
    Student s1 = new Student(1,"Tekraj",90);
    s1.displayStudent();
  }
}
