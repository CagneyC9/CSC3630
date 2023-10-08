import java.text.DecimalFormat;
import java.util.Random;
//My class for the linked list
public class BaseballLinkedList {
//    Creating the linked list nodes with all their information
    class BaseballNode {
        Integer BattingOrder;

        String PlayerName;

        Double BattingAverage;

        Double HomeRunPercentage;
        BaseballNode previous;
        BaseballNode next;

        public BaseballNode(Integer Order, String Name, Double Hit, Double Run) {
            this.next = null;
            this.previous = null;
            this.BattingOrder = Order;
            this.PlayerName = Name;
            this.BattingAverage = Hit;
            this.HomeRunPercentage = Run;

        }
    }

    BaseballNode head, tail = null;
//This add method adds nodes by first checking if there are any nodes at all then making the first node the head and the tail
//    If the list has a first node then it adds a tail and points to the tail and to the previous node from the tail
//    These two conditions create the double linked list
    public void addBaseballNode(Integer Order, String Name, Double Hit, Double Run) {
        BaseballNode newNode = new BaseballNode(Order, Name, Hit, Run);
        if (head == null) {
            head = newNode;
            tail = newNode;
            head.next = null;
            tail.previous = null;
//                It's the first node
        } else {
            tail.next = newNode;
            newNode.previous = tail;
            tail = newNode;
        }
    }
// This print function allowed me to see all the baseball player nodes in my linked list
//    It showed me all their information and was a base for how I could do the inning method
    public void printNodes() {
        BaseballLinkedList.BaseballNode CurrentPlayer = head;
        System.out.printf("\n ---- Showing the Batters ---");
        int ct = 0;
        while (CurrentPlayer != null) {
            System.out.printf("\nBatter:%s %s BA:%s",
                    CurrentPlayer.BattingOrder, CurrentPlayer.PlayerName, CurrentPlayer.BattingAverage);
            CurrentPlayer = CurrentPlayer.next;
        }
    }
// This methods plays the inning
    public void PlayInning() {
        BaseballLinkedList.BaseballNode CurrentPlayer = head;
        int ct = 1;
        int hitcount = 0;
        int Outs = 0;
        int Runs = 0;
        int OnBase = 0;
        int hitTotal = 0;
        int RunsTotal = 0;
        int BattingOrder = 1;
        boolean RunConditions = true;

//        Until the run conditions of the innings being greater or equal to 4 and having a least one run scored, more innings
//        will be played
        while (RunConditions) {
            System.out.printf("\n ---- Inning:%s ---", ct);
//            This detects when there are 3 outs and the game is over
            while (Outs < 3) {
//                This is a while loop to go through the list and when it is done then it points to the head(start)
                while (CurrentPlayer != null) {
                    Random rand = new Random();
                    float float_rand = rand.nextFloat();
                    DecimalFormat df = new DecimalFormat("#.000");
                    float Throw = Float.valueOf(df.format(float_rand));
//                    Checks for a hit
                    if (CurrentPlayer.BattingAverage >= Throw) {
                        hitcount += 1;
                        OnBase += 1;
                        if (OnBase == 4) {
                            Runs += 1;
                            OnBase -= 1;
                        }
                        if (CurrentPlayer.HomeRunPercentage >= Throw) {
//                            if it is a hit, then this checks for a homerun
                            OnBase -= 1;
                            Runs += OnBase + 1;
                            OnBase = 0;
                            System.out.printf("\nBatter:%s -%s: -> BA:%s Throw:%s HOMERUN %s",
                                    BattingOrder, CurrentPlayer.PlayerName, CurrentPlayer.BattingAverage, Throw, Runs);
//                            System.out.printf("\nHits:%s OnBase:%s Runs:%s Outs:%s", hitcount, OnBase, Runs, Outs);
                            BattingOrder++;
                        } else {
//                        If it is a hit and not a homerun then it is a hit
                            System.out.printf("\nBatter:%s -%s: -> BA:%s Throw:%s HIT %s",
                                    BattingOrder, CurrentPlayer.PlayerName, CurrentPlayer.BattingAverage, Throw, hitcount);
//                            System.out.printf("\nHits:%s OnBase:%s Runs:%s Outs:%s", hitcount, OnBase, Runs, Outs);
                            BattingOrder++;
                        }
                    } else if (CurrentPlayer.BattingAverage < Throw) {
//                        If it is not a hit then it is a an out
                        Outs += 1;
                        System.out.printf("\nBatter:%s -%s: -> BA:%s Throw:%s OUT %s",
                                BattingOrder, CurrentPlayer.PlayerName, CurrentPlayer.BattingAverage, Throw, Outs);
//                        System.out.printf("\nHits:%s OnBase:%s Runs:%s Outs:%s", hitcount, OnBase, Runs, Outs);
                        BattingOrder++;
// If there are 3 outs then it breaks and goes to the while loop which indicates the end of the inning
                        if (Outs == 3) {
                            break;
                        }
                    } else {
                        System.out.printf("\nThis should never be reached");
                    }
// This line points to the next player in the list
                    CurrentPlayer = CurrentPlayer.next;
                }
//                If the batting order reaches the end, then order starts again
                if (CurrentPlayer == null) {
                    CurrentPlayer = head;
                }
            }
//            This changes the last batter of the first inning to be the one after for the next inning
            CurrentPlayer = CurrentPlayer.next;
            System.out.printf("\nInning %s Results: Hits: %s Runs: %s Outs: %s", ct, hitcount, Runs, Outs);
            OnBase = 0;
            Outs = 0;
            hitTotal += hitcount;
            hitcount = 0;
            RunsTotal += Runs;
            Runs = 0;
            ct++;
            BattingOrder = 1;
//            The run conditions
            if (ct > 4 && RunsTotal >= 1) {
                RunConditions = false;
            }

        }
//        This prints when the whole game is done
        System.out.printf("\nGame Over TotalHits: %s and TotalRuns: %s", hitTotal, RunsTotal);
    }

}


