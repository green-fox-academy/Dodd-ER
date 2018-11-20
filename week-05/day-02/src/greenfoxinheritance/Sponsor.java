package greenfoxinheritance;

public class Sponsor extends Person{
  String company;
  int hiredStudents;

  public Sponsor() {
    super();
    this.company = "Google";
    this.hiredStudents = 0;
  }
  public Sponsor(String name, int age, String gender, String company) {
    this.name = name;
    this.age = age;
    this.gender = gender;
    this.company = company;
    this.hiredStudents = 0;
  }

  public void getGoal() {
    System.out.println("My goal is: Hire brilliant junior software developers.");
  }

  public void introduce() {
    super.introduce();
    System.out.println("who represents " + this.company
        + " and hired " + this.hiredStudents + " students so far.");
  }

  public void hire() {
    this.hiredStudents++;
  }
}
