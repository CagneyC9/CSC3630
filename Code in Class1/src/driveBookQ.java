import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

//    What would be the output of the following code?

public class driveBookQ {
    public static void main(String[] args) {
        Queue<Books> myBooks = new LinkedList<>();
        myBooks.add( new Books("War and Peace", 1200 ));
        myBooks.add( new Books("Old Yeller", 128 ));
        myBooks.add( new Books("Wizard of Oz", 122 ));
        myBooks.add( new Books("Dune", 412 ));
        Books b = myBooks.peek();
        Books b2 = myBooks.peek();
        Books b3 = myBooks.remove();
        System.out.printf("\nB:%s", b3.getTitle());
    }
}