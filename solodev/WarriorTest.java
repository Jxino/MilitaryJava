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
    public abstract void matchMake();
    public abstract void win();
    public abstract void callOut();

    final public void fight() {
        matchMake();
        win();
        callOut();
        System.out.println();
    }
}

class UnRanker extends Ranking {
    @Override
    public void matchMake() {
        System.out.println("Fight with a top 15 contender");
    }

    @Override
    public void win() {
        System.out.println("Win by split decision");
    }

    @Override
    public void callOut() {
        System.out.println("\"I will smash you, Colby\"");
    }
}

class TopRanker extends Ranking {
    @Override
    public void matchMake() {
        System.out.println("Fight with a top 5 contender");
    }

    @Override
    public void win() {
        System.out.println("Win by 3 round TKO");
    }

    @Override
    public void callOut() {
        System.out.println("\"I want Kamaru Usman\"");
    }
}

class Champion extends Ranking {
    @Override
    public void matchMake() {
        System.out.println("Fight with a interim champion");
    }

    @Override
    public void win() {
        System.out.println("Win by 2 round KO");
    }

    @Override
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