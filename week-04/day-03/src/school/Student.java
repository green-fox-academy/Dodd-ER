package school;

public class Student {
    String name;
    boolean isLearnt = false;

    public Student(){
        this.name = "";
    }

    public boolean learn(){
        return this.isLearnt = true;
    }
    public void question(Teacher teacher){
        teacher.answer();
    }
}
