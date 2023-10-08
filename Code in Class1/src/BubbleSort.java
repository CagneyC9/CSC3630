public class BubbleSort {
    public static void main(String[] args) {

        int arr[] = { 64, 55, 12, 66, 66, 91, 21, 121, 32, 33};
        int sLis[] = bubbleSort( arr );
        System.out.printf("\n Results are .... ");
        for ( int item : sLis) {
            System.out.printf("\n Item:%s", item);
        }
    }

    private static int[] bubbleSort(int[] arr) {
//        Arr = { 5, 2, 9, 1}
//        n = 4     i = 0    j = 0
//        if arr[0] > arr[0+1] aka (5 > 2)
//        int temp = arr[j];
//        arr[j] = arr[j+1];
//        arr[j+1] = temp;
//        Classic way to switch values
//        Array after iteration 1, { 2, 5, 9, 1}
//        Inner loop j = 1
//        is (5 > 9)? no
//        Inner loop j = 2
//        is (9 > 1) yes
//        switch values, Array { 2, 5, 1, 9}
//         Inner loop j = 3 (Loop doesn't work - Done)
//        Outer loop i = 1
//        is i < 3? yes
//        Inner loop j = 0
//        is (2 > 5?) no
//        Inner loop j = 1
//        is (5 > 1?) yes
//        Array { 2, 1, 5, 9}
//        Inner loop j = 2 (loop is done)
//        Outer loop i = 2
//        Inner loop j = 0
//        is (2 > 1?) yes
//        Array now { 1, 2, 5, 9}
//        Innter loop j = 1
//        Loop is done
//        outer loop I = 3. Outer loop is done.
//        Return array


        int n = arr.length;
        for (int i=0; i<n-1; i++ ){
            // grab the left most item and move compare it.
            for (int j=0; j<n-i-1; j++ ){
                if ( arr[j] > arr[j+1]) {
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
        return arr;
    }
}
