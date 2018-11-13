package animal;

public class Main {
    public static void main(String[] args){
        Animal dog = new Animal();
        Animal cat = new Animal();

        dog.eat();
        dog.eat();
        System.out.println("Dog hunger after Eating (2 times): "+ dog.hunger);
        dog.play();
        System.out.println("Dog hunger after Playing: "+ dog.hunger);
        System.out.println("Cat hunger after Playing: "+ cat.hunger);
    }
}
