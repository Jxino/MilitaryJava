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

    public String getName() {
        return this.name;
    }

    public String getNationality() {
        return this.nationality;
    }

    public String getRank() {
        return this.rank;
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

    public static Rosters getInstance() {
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

    public void printRoster(Fighter[] roster) {
        for (Fighter fighter : roster) {
            System.out.println(fighter);
        }
        System.out.println();
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
        originalRoster[5] = new Fighter("Dustin Poirier", "USA", "#5");

        for (int i = 0; i < copiedRoster.length; i++) {
            copiedRoster[i] = new Fighter(originalRoster[i]);
        }

        rosters.setRoster(originalRoster, copiedRoster);

        rosters.printRoster(originalRoster);
        rosters.printRoster(copiedRoster);

        rosters.getOriginalRoster()[0] = new Fighter("Conor McGregor", "Ireland", "#c");
        // originalRoster[0] = new Fighter("Cornor McGregor", "Ireland", "#c");

        rosters.printRoster(originalRoster);
        rosters.printRoster(copiedRoster);
    }
}