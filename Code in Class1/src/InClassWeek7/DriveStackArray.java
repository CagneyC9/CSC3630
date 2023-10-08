package InClassWeek7;

public class DriveStackArray {
    public static void main(String[] args) throws IllegalAccessException {
        StackArray sa = new StackArray();
        sa.push(12);
        sa.push(22);
        sa.push(32);
        sa.push(42);


        System.out.printf("\n Size:%s", sa.getSize());
        System.out.printf("\n Peek:%s", sa.peek());
        System.out.printf("\n Popped:%s", sa.pop());
        System.out.printf("\n Peek:%s", sa.peek());
    }
}
