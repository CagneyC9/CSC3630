public class InClass_12_8_GreedyTask implements Comparable<InClass_12_8_GreedyTask> {
    private String tName;
    private int time;

    public String gettName() {
        return tName;
    }

    public void settName(String tName) {
        this.tName = tName;
    }

    public int getTime() {
        return time;
    }

    public void setTime(int time) {
        this.time = time;
    }

    public InClass_12_8_GreedyTask(String tName, int time) {
        this.tName = tName;
        this.time = time;
    }

    @Override
    public int compareTo(InClass_12_8_GreedyTask t) {
        if (this.time < t.time) {
            return -1;
        } else if (this.time < t.time) {
            return 1;
        } else return 0;
    }
}
