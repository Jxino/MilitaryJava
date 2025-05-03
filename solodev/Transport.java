package solodev;

class Passenger {
    String name;
    int assets;

    Passenger(String name, int assets) {
        this.name = name;
        this.assets = assets;
    }

    public <T> void takeBus(T transport) {

    }

    public String toString() {
        return this.name + " : " + this.assets + "$";
    }
}

class Bus {
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

    public String toString() {
        return this.busId + " " + this.passengerCount + " " + this.revenue + "$";
    }
}

class Metro {
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

    public String toString() {
        return this.metroId + " " + this.passengerCount + " " + this.revenue + "$";
    }
}

public class Transport {
    
}