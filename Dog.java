public class Dog {
    private String name;
    private String breed;

    public Dog(String name, String breed) {
        this.name = name;
        this.breed = breed;
    }

    public void printDogDetails(Dog dog) { // Method that takes a Dog object as a parameter
        System.out.println("Name: " + dog.name + ", Breed: " + dog.breed);
    }

    public static void main(String[]args) {
        Dog myDog = new Dog("Buddy", "Golden Retriever");
        myDog.printDogDetails(myDog); // Pass the 'myDog' object to the method
    }
}
