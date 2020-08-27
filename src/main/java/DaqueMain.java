import java.util.ArrayDeque;
import java.util.Deque;
public class DaqueMain {

    public static void main(String[] args) {
        DequeClass objDeque = new DequeClass();
        DequeInput deuqueInput = new DequeInput();

        int dequeSize = deuqueInput.getSize();
        int size = deuqueInput.getSubsetSize();

        Deque<Integer> deque = deuqueInput.getDeque();
        System.out.println("-----------------Output---------------------");
        int output = objDeque.dequeProcess((ArrayDeque<Integer>) deque, size);
        System.out.println(output);
        System.out.println("--------------------------------------------");
    }
}