package leader;
import java.util.ArrayList;

public class Leader {
    protected ArrayList<String> leaders;

    public Leader() {
        this.leaders = new ArrayList<String>();
    }

    public ArrayList<String> getLeaders() {
        return this.leaders;
    }

    public int getCount() {
        return leaders.size();
    }
}