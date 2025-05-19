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
    private Fighter[] originalRoster;
    private Fighter[] copiedRoster;

    private Rosters() {}

    static public Rosters getInstance() {
        return instance;
    }

    public void setRoster(Fighter[] originalRoster, Fighter[] copiedRoster) {
        this.originalRoster = originalRoster;
        this.copiedRoster = copiedRoster;
    }

    public Fighter[] getOriginalRoster() {
        return this.originalRoster;
    }

    public Fighter[] getRoster2() {
        return this.copiedRoster;
    }

    public void printOriginalRoster() {
        for (Fighter fighter : this.originalRoster) {
            System.out.println(fighter);
        }
        System.out.println("\n");
    }

    public void printCopiedRoster() {
        for (Fighter fighter : this.copiedRoster) {
            System.out.println(fighter);
        }
        System.out.println("\n");
    }
}

public class FighterTest {
    public static void main(String[] args) {
        final int ROSTER_SIZE = 6;
        Fighter[] roster1 = new Fighter[ROSTER_SIZE];
        Fighter[] roster2 = new Fighter[ROSTER_SIZE];
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

        rosters.printOriginalRoster();
        rosters.printCopiedRoster();

        rosters.getOriginalRoster()[0] = new Fighter("Cornor McGregor", "Ireland", "#c");
        // roster1[0] = new Fighter("Cornor McGregor", "Ireland", "#c");

        rosters.printOriginalRoster();
        rosters.printCopiedRoster();        
    }
}