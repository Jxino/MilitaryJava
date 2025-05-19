package question;

class Fighter {
    private String name;
    private String nationality;
    private String rank;

    public Fighter(String name, String nationality, String rank) {
        this.name = name;
        this.nationality = nationality;
        this.rank = rank;
    }

    public Fighter() {}

    public String getName() {
        return this.name;
    }

    public String getNationality() {
        return this.nationality;
    }

    public String getRank() {
        return this.rank;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setNationality(String nationality) {
        this.nationality = nationality;
    }

    public void setRank(String rank) {
        this.rank = rank;
    }

    @Override
    public String toString() {
        return String.format("%s | %s | %s", this.name, this.nationality, this.rank);
    }
}

class Rosters {
    private static Rosters instance = new Rosters();
    private Fighter[] roster1;
    private Fighter[] roster2;

    private Rosters() {}

    static public Rosters getInstance() {
        return instance;
    }

    public void setRoster(Fighter[] roster1, Fighter[] roster2) {
        this.roster1 = roster1;
        this.roster2 = roster2;
    }

    public Fighter[] getRoster1() {
        return this.roster1;
    }

    public Fighter[] getRoster2() {
        return this.roster2;
    }

    public void printRoster1() {
        for (Fighter fighter : this.roster1) {
            System.out.println(fighter);
        }
        System.out.println("\n");
    }

    public void printRoster2() {
        for (Fighter fighter : this.roster2) {
            System.out.println(fighter);
        }
        System.out.println("\n");
    }
}

public class FighterTest {
    public static void main(String[] args) {
        Fighter[] roster1 = new Fighter[6];
        Fighter[] roster2 = new Fighter[6];
        Rosters rosters = Rosters.getInstance();

        roster1[0] = new Fighter("Islam Makhachev", "Russia", "#c");
        roster1[1] = new Fighter("Arman Tsarukyan", "Armenia", "#1");
        roster1[2] = new Fighter("Charles Oliveira", "Brazil", "#2");
        roster1[3] = new Fighter("Justin Gaethje", "USA", "#3");
        roster1[4] = new Fighter("Max Holloway", "USA", "#4");
        roster1[5] = new Fighter("Dustin Poirier", "Brazil", "#5");

        for (int i = 0; i < roster2.length; i++) {
            roster2[i] = new Fighter();
        }

        for (int i = 0; i < roster2.length; i++) {
            roster2[i].setName(roster1[i].getName());
            roster2[i].setNationality(roster1[i].getNationality());
            roster2[i].setRank(roster1[i].getRank());
        }

        rosters.setRoster(roster1, roster2);

        rosters.printRoster1();
        rosters.printRoster2();

        rosters.getRoster1()[0] = new Fighter("Cornor McGregor", "Ireland", "#c");
        // roster1[0] = new Fighter("Cornor McGregor", "Ireland", "#c");

        rosters.printRoster1();
        rosters.printRoster2();        
    }
}