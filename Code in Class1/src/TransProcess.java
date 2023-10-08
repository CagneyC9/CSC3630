import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.TreeMap;

public class TransProcess {
    public static void main(String[] args) {
//        TreeMap<Integer, ArrayList<Node>>
        int n = 30;
        ArrayList<Node> Problem = new ArrayList<>();
        MakeArray(Problem);
        sortTheseByPriority( Problem);


    }

    private static void MakeArray(ArrayList<Node> problem) {
        ArrayList<Node> ImAnArray = new ArrayList<Node>();
        Node newNode = new Node(100, 5, 1);
        Node newNode1 = new Node(100, 5, 1);
        Node newNode2 = new Node(100, 5, 1);
        Node newNode3 = new Node(100, 5, 1);
        Node newNode4 = new Node(100, 5, 1);
        for (int i=0;i<ImAnArray.size()-1;i++){
//            System.out.printf("This node:%s", ImAnArray[i]);
        }
    }

    private static void sortTheseByPriority(ArrayList<Node> problem) {
    }

    public static class Node{
        private  int ID;
        private  int Time;
        private  int Priority;

        @Override
        public String toString() {
            return "Node{" +
                    "ID=" + ID +
                    ", Time=" + Time +
                    ", Priority=" + Priority +
                    '}';
        }

        public int getID() {
            return ID;
        }

        public void setID(int ID) {
            this.ID = ID;
        }

        public int getTime() {
            return Time;
        }

        public void setTime(int time) {
            Time = time;
        }

        public int getPriority() {
            return Priority;
        }

        public void setPriority(int priority) {
            Priority = priority;
        }

        public Node(int ID, int Time, int Priority) {
            this.ID = ID;
            this.Time = Time;
            this.Priority = Priority;
        }
    }
}
