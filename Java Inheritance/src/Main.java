public class Main extends Object {
    public static void main(String[] args) {
//        Car car = new Car();
//        System.out.println("Car Name: " + car.getMake());
//        System.out.println("Car Model: " + car.getModel());
//        car.describeCar();

//        Account acc = new Account("12345", 1000000, "Ashwin", "test@gmail.com", "1234567890");

//        Account acc = new Account("Ashwin", "test@gmail.com", "13452345235");
//
//        System.out.println(acc.getName());
//        System.out.println(acc.getEmail());
//        System.out.println(acc.getAccountNumber());
//
//        acc.withdrawlFunds(100);
//        acc.depositFunds(2000);
//        acc.withdrawlFunds(500);

        Animal animal = new Animal("Generic Animal", "Huge", 400);
        doAnimalStuff(animal, "slow");

        Dog dog = new Dog();
        doAnimalStuff(dog, "fast");
    }

    public static void doAnimalStuff(Animal animal, String speed) {
        animal.makeNoise();
        animal.move(speed);

        System.out.println(animal);
        System.out.println("----------------");
    }
}
