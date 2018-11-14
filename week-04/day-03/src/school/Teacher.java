package school;

public class Teacher {
    String name;
    boolean isAnswered = false;

    public Teacher(){
        this.name = "";
    }

    public boolean answer(){
        return this.isAnswered = true;
    }
    public void teach(Student student){
     student.learn();
    }
}
