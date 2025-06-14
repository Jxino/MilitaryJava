package leader;

public interface Queue {
    void enqueue(String leader);
    String dequeue();
    int getSize();
}