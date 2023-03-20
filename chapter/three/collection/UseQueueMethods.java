package OCP.chapter.three.collection;

import java.util.ArrayDeque;
import java.util.Queue;

public class UseQueueMethods {

    public static void main( String[] args ) {

        Queue<Integer> queue = new ArrayDeque<>();
        System.out.println( queue.offer(10) );
        System.out.println( queue.offer(4));
        System.out.println(queue.element());
        System.out.println(queue.peek());
        System.out.println(queue.poll());
        System.out.println(queue.poll());
        System.out.println(queue.peek());


        System.out.println("-----------------------Stack Functionality-------------");
        //using ArrayDeque as a stack
        ArrayDeque<Integer> stack = new ArrayDeque<>();
        stack.push(10);
        stack.push(4);
        System.out.println(stack.peek());
        System.out.println(stack.poll());
        System.out.println(stack.poll());
        System.out.println(stack.peek());

    }
}
