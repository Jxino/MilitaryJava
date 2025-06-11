package solodev;

class Warrior {
    private Ranking ranking;

    Warrior() {
        this.ranking = new UnRanker();
    }

    public void updateRanking(Ranking ranking) {
        this.ranking = ranking;
    }

    public Ranking getRanking() {
        return ranking;
    }

    public void start(int number) {
        System.out.println(String.format("-----UFC %d-----", number));
        ranking.fight();
    }
}

abstract class Ranking {
    abstract void matchMake();
    abstract void win();
    abstract void callOut();

    final public void fight() {
        matchMake();
        win();
        callOut();
        System.out.println();
    }
}

class UnRanker extends Ranking {
    public void matchMake() {
        System.out.println("Fight with a top 15 contender");
    }

    public void win() {
        System.out.println("Win by split decision");
    }

    public void callOut() {
        System.out.println("\"I will smash you, Colby\"");
    }
}

class TopRanker extends Ranking {
    public void matchMake() {
        System.out.println("Fight with a top 5 contender");
    }

    public void win() {
        System.out.println("Win by 3 round TKO");
    }

    public void callOut() {
        System.out.println("\"I want Kamaru Usman\"");
    }
}

class Champion extends Ranking {
    public void matchMake() {
        System.out.println("Fight with a interim champion");
    }

    public void win() {
        System.out.println("Win by 2 round KO");
    }

    public void callOut() {
        System.out.println("\"I will defend my welterweight title at least for 5 times, and challenge to be a double champ\"");
    }
}

public class WarriorTest {
    public static void main(String[] args) {
        Warrior StunGun = new Warrior();
        StunGun.start(315);

        TopRanker topRanker = new TopRanker();
        StunGun.updateRanking(topRanker);
        StunGun.start(323);

        Champion champion = new Champion();
        StunGun.updateRanking(champion);
        StunGun.start(331);
    }
}