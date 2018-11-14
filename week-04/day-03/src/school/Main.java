package school;

public class Main {
//    Create Student and Teacher classes
//            Student:
//    learn()
//    question(teacher) -> calls the teachers answer method
//            Teacher:
//    teach(student) -> calls the students learn method
//    answer()

    public static void main(String[] args){
        Student student1 = new Student();
        student1.name = "Béla";
        Teacher teacher1 = new Teacher();
        teacher1.name = "Pista";
//      ---Kontroll team---
        Student student2 = new Student();
        Teacher teacher2 = new Teacher();

        student1.question(teacher1);
        System.out.println("Pista tanárúr megválaszolta Béla kérdését? :" + teacher1.isAnswered);
        teacher1.teach(student1);
        System.out.println("Béla megtanulta a leckét? :" + student1.isLearnt);
        System.out.println("Másik tanuló megtanulta a leckét? :" + student2.isLearnt);
        System.out.println("Másik tanár megválaszolta a kérdést? :" + teacher2.isAnswered);
    }
}
