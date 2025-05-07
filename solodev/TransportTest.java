package solodev;

interface Takeable {
    void take();
    int getRevenue();
}

class Passenger {
    String name;
    int assets;

    Passenger(String name, int assets) {
        this.name = name;
        this.assets = assets;
    }

    public <T extends Takeable> void takeTransport(T transport) {
        transport.take();
        this.assets -= transport.getRevenue();
    }

    public String toString() {
        return this.name + " : " + this.assets + "$";
    }
}

class Bus implements Takeable {
    String busId;
    int passengerCount;
    int revenue;
    static final int fare = 400;

    Bus(String busId) {
        this.busId = busId;
    }
    
    public void take() {
        revenue += fare;
        passengerCount++;
    }

    public int getRevenue() {
        return revenue;
    }

    public String toString() {
        return this.busId + " " + this.passengerCount + " " + this.revenue + "$";
    }
}

class Metro implements Takeable {
    String metroId;
    int passengerCount;
    int revenue;
    static final int fare = 50;

    Metro(String metroId) {
        this.metroId = metroId;
    }
    
    public void take() {
        revenue += fare;
        passengerCount++;
    }

    public int getRevenue() {
        return revenue;
    }

    public String toString() {
        return this.metroId + " " + this.passengerCount + " " + this.revenue + "$";
    }
}

public class TransportTest {
    public static void main(String[] args) {
        Passenger p1 = new Passenger("Chales", 20000);
        Bus b1 = new Bus("Montreux");
        Metro m1 = new Metro("London");

        p1.takeTransport(b1);
        p1.takeTransport(m1);

        System.out.println(p1);
        System.out.println(b1);
        System.out.println(m1);
    }
}