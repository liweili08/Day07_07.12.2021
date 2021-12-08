package Polymorphism;

class Main {
    public static void main(String[] args) {
        //Objekt erzeugen
        Animal myAnimal = new Animal();
        Animal myDog = new Dog();
        myAnimal.animalSound();//"animal sound"
        myDog.animalSound();//"woof!"
    }
}
