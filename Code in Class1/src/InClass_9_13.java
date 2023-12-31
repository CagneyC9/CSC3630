public class InClass_9_13 {
    public static void main(String[] args) {
        int n=5;
        System.out.printf("Sum1: %s", getSum(n));
        System.out.printf("\nSum Recur: %s", getSumRecur(n));
    }


    private static int getSum(int n) {
        int sum = 0;
        for ( int i=n; i>0; i--){
            sum += i;
        }
        return sum;
    }
    static int getSumRecur(int n) {
        if (n < 1) return n;
        if (n==1){
            return 1;
        } else {
            return n+getSumRecur(n-1);
        }
    }
}
