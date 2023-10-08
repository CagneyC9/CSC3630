import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;

public class InClass_12_8_TheGreedyTask {
    public static void main(String[] args) {
        ArrayList<InClass_12_8_GreedyTask> myList = new ArrayList<>();
        myList.add(new InClass_12_8_GreedyTask("Paint Bedroom", 2));
        myList.add(new InClass_12_8_GreedyTask("Paint LivingRoom", 5));
        myList.add(new InClass_12_8_GreedyTask("Sweep Patio", 2));
        myList.add(new InClass_12_8_GreedyTask("Paint Basement", 1));
        myList.add(new InClass_12_8_GreedyTask("Paint Kitchen", 4));
        Collections.sort(myList);
        int time = 8;
        showTheList(myList);
        System.out.printf("\n------------------------------");
        ArrayList<InClass_12_8_GreedyTask> toDoList = maxTasks(myList, 8);
        showTheList(toDoList);

    }

    private static ArrayList<InClass_12_8_GreedyTask> maxTasks(ArrayList<InClass_12_8_GreedyTask> myList, int time) {
        int currentTime = 0;
        int numberOfTasks =0;
        ArrayList<InClass_12_8_GreedyTask> toDoList = new ArrayList<>();
        for(InClass_12_8_GreedyTask t: toDoList){
            currentTime += t.getTime();
            if (currentTime > time){
                break;
            }
            numberOfTasks ++;
        }
        return toDoList;
    }

    private static void showTheList(ArrayList<InClass_12_8_GreedyTask> myList) {
        for (InClass_12_8_GreedyTask t : myList){

        System.out.printf("\n Name:%s T:%s", t.gettName(), t.getTime());
        }
    }
}
