package solodev;

interface Takeable {
    void take();
    int getRevenue();
}

abstract class Transport implements Takeable {
    String transId;
    int passengerCount;
    int revenue;
    
    public abstract void take();

    public int getRevenue() {
        return revenue;
    }

    public String toString() {
        return String.format("%s has %d passengers and %d$", transId, passengerCount, revenue);
    }
}

class Bus extends Transport {
    static final int fare = 400;
    
    Bus(String busid) {
        this.transId = busid;
    }

    public void take() {
        revenue += fare;
        passengerCount++;
    }
}

class Metro extends Transport {
    static final int fare = 50;

    Metro(String metroId) {
        this.transId = metroId;
    }
    
    public void take() {
        revenue += fare;
        passengerCount++;
    }
}

class Passenger {
    String name;
    int assets;

    Passenger(String name, int assets) {
        this.name = name;
        this.assets = assets;
    }

    public <T extends Transport> void takeTransport(T transport) {
        transport.take();
        this.assets -= transport.getRevenue();
    }

    public String toString() {
        return this.name + " : " + this.assets + "$";
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