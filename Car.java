public class Car {
    private String make;
    private String model;

     Car(String make, String model) {
        this.make = make;
        this.model = model;
    }

    // Method to return a Car object
     Car getCarDetails() {
        Car car = new Car("Toyota", "Camry");
        return car; // Return the 'car' object
    }

    public static void main(String[]args) {
        Car myCar = new Car("Honda", "Civic");
        Car newCar = myCar.getCarDetails(); // Get the returned Car object
        System.out.println(newCar.make + " " + newCar.model); // Output: Toyota Camry
       
    }
}
