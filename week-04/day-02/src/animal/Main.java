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

        Farm firstFarm = new Farm();
        firstFarm.breed();
        firstFarm.breed();
        firstFarm.listOfAnimal.add(new Animal(40,30));
        firstFarm.listOfAnimal.add(new Animal(30,40));
        firstFarm.slaughter();
        for (int i = 0; i < firstFarm.listOfAnimal.size(); i++) {
            System.out.println(i + " " + firstFarm.listOfAnimal.get(i).hunger);
        }

    }
}
