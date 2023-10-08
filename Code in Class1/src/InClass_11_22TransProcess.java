import java.util.ArrayList;
import java.util.Collections;

public class InClass_11_22TransProcess {
    public static void main(String[] args) {
        ArrayList<Item> myWork = new ArrayList<>();
        myWork.add(new Item(200, 2, 3));
        myWork.add(new Item(100, 5, 1));
        myWork.add(new Item(300, 10, 2));
        myWork.add(new Item(250, 20, 3));
        myWork.add(new Item(400, 7, 1));

        Collections.sort(myWork);

        int TimeSum = 0;
        for (Item item : myWork) {
            int breaktime = 13;
            if (TimeSum < breaktime) {
                TimeSum += item.trans_time;
                System.out.printf("\n ID:%s, prior:%s, Time:%s", item.id, item.priority, item.trans_time);
                System.out.printf("\n Total time:%s", TimeSum);
            } else {
                System.out.printf("The time allowed is finished, time allotted:%s," +
                        " time needed to finish next order:%s", breaktime, TimeSum);
                break;
            }
        }

    }

    public static class Item implements Comparable<Item> {
        public int id;
        public int trans_time;
        public int priority;

        public Item(int id, int trans_time, int priority) {
            this.id = id;
            this.trans_time = trans_time;
            this.priority = priority;
        }

        @Override
        public int compareTo(Item o) {
            if (o.priority < this.priority) {
                return 1;
            } else if (o.priority > this.priority) {
                return -1;
            } else {
                return 0;
            }
        }
    }
}

