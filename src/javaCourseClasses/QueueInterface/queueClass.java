package javaCourseClasses.QueueInterface;

import javaCourseClasses.Utility;

import java.util.LinkedList;
import java.util.Queue;

public class queueClass {
    public static void main(String[] args) {
        Queue<Integer> queue = new LinkedList<>();
        queue.add(78);
        queue.add(87);
        //System.out.println(queue.peek());//only seen purpose
        Utility.Print(queue);
        System.out.println("peek method: "+queue.peek());
        System.out.println("element method: "+queue.element());
        System.out.println("remove method: "+queue.remove());
        Utility.Print(queue);
        System.out.println("poll method: "+queue.poll());
        Utility.Print(queue);
        System.out.println("poll method: "+queue.poll());

        //System.out.println(queue.remove());
    }
}
