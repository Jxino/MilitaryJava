package leader;

public class SquadLeader extends Leader implements Queue {
    @Override
    public void enqueue(String leader) {
        leaders.add(leader);
    }
    @Override
    public String dequeue() {
        return leaders.remove(0);
    }
    @Override
    public int getSize() {
        return getCount();
    }
}