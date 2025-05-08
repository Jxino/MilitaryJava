package solodev;

class Soldier {
    private static int militarySerial = 72001376;
    private int militaryID;
    private int militaryCard;

    Soldier() {
        this.militaryID = militarySerial++;
        this.militaryCard = this.militaryID + 100;
    }

    public String toString() {
        String newline = System.lineSeparator();
        // return String.format("this.militaryID: %d%nthis.militaryCard: %d", militaryID, militaryCard); 
        return this.militaryID + newline + this.militaryCard;
    }
}

public class SoldierTest {
    public static void main(String[] args) {
        Soldier s1 = new Soldier();
        Soldier s2 = new Soldier();
        System.out.println(s1);
        System.out.println(s2);
    }   
}