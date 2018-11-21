package greenfoxinheritance;

public class Student extends Person implements Cloneable {
  String previousOrganization;
  int skippedDays;

  public Student() {
    super();
    this.previousOrganization = "The School of Life";
    this.skippedDays = 0;
  }

  public Student(String name, int age, String gender, String previousOrganization) {
    this.name = name;
    this.age = age;
    this.gender = gender;
    this.previousOrganization = previousOrganization;
    this.skippedDays = 0;
  }

  public void getGoal() {
    System.out.println("My goal is: Be a junior software developer.");
  }

  public void introduce() {
    super.introduce();
    System.out.println("from " + this.previousOrganization
        + " who skipped " + this.skippedDays + " from the course already.");
  }

  public void skipDays(int numberOfDays) {
    this.skippedDays += numberOfDays;
  }

  public Student clone() {
    Student outputStudent = new Student();
    outputStudent.name = this.name.toLowerCase().substring(0, this.name.indexOf(' ')) + "TheClone";
    outputStudent.age = this.age;
    outputStudent.skippedDays = this.skippedDays;
    return outputStudent;
  }
}
