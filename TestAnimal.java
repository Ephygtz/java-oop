public class TestAnimal {
    public static void main(String[] args) {
        //Animal reference object
        Animal animal = new Animal();
        //run the method in the Animal class
        animal.move();

        //Animal reference but of the object Cat
        Animal cat = new Cat();
        //Run the method in class Cat
        cat.move();
    }
}
