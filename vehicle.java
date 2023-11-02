class Vehicle {

    int no_of_seats;
    int no_of_wheels;

    Vehicle() {
        no_of_seats = 4;
        no_of_wheels = 4;
    }

    Vehicle(int no_of_seats, int no_of_wheels) {
        this.no_of_seats = no_of_seats;
        this.no_of_wheels = no_of_wheels;
    }

    void showVehicle() {
        System.out.println("Number of seats: " + no_of_seats);
        System.out.println("Number of wheels: " + no_of_wheels);
    }
}

class Motorcycle extends Vehicle {

    Motorcycle() {
        super(2, 2);
    }
}

class Car extends Vehicle {

    Car() {
        super(4, 4);
    }
}

public class Main {

    public static void main(String[] args) {

        Vehicle motorcycle = new Motorcycle();
        Vehicle car = new Car();

        motorcycle.showVehicle();
        System.out.println("");
        car.showVehicle();
    }
}
