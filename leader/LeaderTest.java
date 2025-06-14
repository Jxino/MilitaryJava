package leader;

public class LeaderTest {
    public static void main(String[] args) {
        Queue leader = new SquadLeader();
        leader.enqueue("Robert Plant");
        leader.enqueue("Freddie Mercury");
        leader.enqueue("Steven Tylor");

        System.out.println(leader.dequeue());
        System.out.println(leader.dequeue());
        System.out.println(leader.dequeue());
    }
}