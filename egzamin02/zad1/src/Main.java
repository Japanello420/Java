abstract class Animal{
     abstract void makeSound();
}

    class Pies extends Animal{

    void makeSound(){
        System.out.println("Bark");
    }
}

    class Kot extends Animal{
    void makeSound(){
        System.out.println("Meow");
    }
}

    class Krowa extends Animal{
    void makeSound(){
        System.out.println("MUU");
    }
}

public class Main {
    public static void main(String[] args) {
    Animal[] animals=new Animal[3];
    animals[0]= new Pies();
    animals[1]= new Kot();
    animals[2]= new Krowa();
    for(Animal animal : animals){
        animal.makeSound();
    }
    }
}