public class FirstOneOne {
    public static void main(String[] args) {
//        System.out.printf("\n Hello World!!!");
//        int fruitCount = 0;
//        String fruit = "Apples";
//        double price = 2.99;
//        System.out.printf("\n Fruit:%s Ct:%s price:%s",
//                fruit, fruitCount, price);
//        Integer fCount = 0;
//        Double p = 7.7;
        int[] scores = {-275, 85, 195};
        int large = getLargest(scores);
        System.out.printf("\n Smallest=%s", large);

//        int[] scores2 = new int[10];
//        int max = scores[0];
//        for (int i = 1; i <scores.length; i++);
//        if (scores[i] > large);
//        max = scores[i];
    }

    private static int getLargest(int[] scores) {
        int smallest = Integer.MAX_VALUE;
        for (int score : scores) {
            if (score < smallest) {
                smallest = score;
            }
        }
        return smallest;
//        for (int i = 1; i < scores.length; i++);
//        if (scores[i] > largest);
//        largest = scores[i]


    }

}

