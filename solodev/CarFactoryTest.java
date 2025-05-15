package solodev;

class CarFactory {
    private static CarFactory instance = new CarFactory();
    private CarFactory() {}

    public static CarFactory getInstance() {
        if (instance == null) {
            instance = new CarFactory();
        }
        return instance;
    }

    public Car createCar() {
        return new Car();
    }
}

class Car {
    private static int carSerial = 10001;
    private int carNumber;

    Car() {
        this.carNumber = carSerial++;
    }

    public int getCarNumber() {
        return this.carNumber;
    }
}

public class CarFactoryTest {
    public static void main(String[] args) {
        CarFactory factory = CarFactory.getInstance();
        Car mySonata = factory.createCar();
        Car yourSonata = factory.createCar();
        System.out.println(mySonata.getCarNumber());
        System.out.println(yourSonata.getCarNumber());
    }
}