public class Car {
//    int year = 2022;
//    String make;
//    String model;
    int speed;
    void displaySpeed() {
        System.out.println("current speed: " + speed);
    }

    Car() {
        this(0);
    }

    Car(int _speed) {
        this.speed = _speed;
    }
}
