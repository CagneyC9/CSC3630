public class BaseBallHW {
    public static void main(String[] args) {
//ToDo
//        Generate a random number
//        Add the totals for the inning
//
        BaseballLinkedList bb = new BaseballLinkedList();
        bb.addBaseballNode(1, "Ted Williams", .344, .0687);
        bb.addBaseballNode(2, "Roger Hornsby", .359, .0375);
        bb.addBaseballNode(3, "Mark McGuire", .265, .095);
        bb.addBaseballNode(4, "Babe Ruth", .340, .085);
//        System.out.printf("Show the list of batters:");
//        bb.printNodes();
        bb.PlayInning();



    }
}


