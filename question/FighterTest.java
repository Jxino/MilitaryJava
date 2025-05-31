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

    public Fighter(Fighter original) {
        this.name = original.name;
        this.nationality = original.nationality;
        this.rank = original.rank;
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

    public Fighter[] getCopiedRoster() {
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
        Fighter[] originalRoster = new Fighter[ROSTER_SIZE];
        Fighter[] copiedRoster = new Fighter[ROSTER_SIZE];
        Rosters rosters = Rosters.getInstance();

        originalRoster[0] = new Fighter("Islam Makhachev", "Russia", "#c");
        originalRoster[1] = new Fighter("Arman Tsarukyan", "Armenia", "#1");
        originalRoster[2] = new Fighter("Charles Oliveira", "Brazil", "#2");
        originalRoster[3] = new Fighter("Justin Gaethje", "USA", "#3");
        originalRoster[4] = new Fighter("Max Holloway", "USA", "#4");
        originalRoster[5] = new Fighter("Dustin Poirier", "Brazil", "#5");

        for (int i = 0; i < copiedRoster.length; i++) {
            copiedRoster[i] = new Fighter();
        }

        for (int i = 0; i < copiedRoster.length; i++) {
            copiedRoster[i].setName(originalRoster[i].getName());
            copiedRoster[i].setNationality(originalRoster[i].getNationality());
            copiedRoster[i].setRank(originalRoster[i].getRank());
        }

        rosters.setRoster(originalRoster, copiedRoster);

        rosters.printOriginalRoster();
        rosters.printCopiedRoster();

        rosters.getOriginalRoster()[0] = new Fighter("Cornor McGregor", "Ireland", "#c");
        // originalRoster[0] = new Fighter("Cornor McGregor", "Ireland", "#c");

        rosters.printOriginalRoster();
        rosters.printCopiedRoster();        
    }
}