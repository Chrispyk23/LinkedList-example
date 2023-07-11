package linkedlistexample;
import java.util.LinkedList;
import java.util.ListIterator;

public class LinkedListExample {

   
    public static void main(String[] args) {
        LinkedList states = new LinkedList();//List of states
        states.add("Alaska");
        states.add("Arizona");
        states.add("Arkansas");
        states.add("Pennsylvania");
        states.add("California");
        states.add("Colorado");
        states.add("Connecticut");
        
        states.addFirst("Alabama");
        System.out.println(states);
        System.out.println("last state in my list: "+states.getLast());//Returns Connecticut because it's the last in the list
        
        ListIterator iterator = states.listIterator(states.size());
        while(iterator.hasPrevious()) {
            System.out.println(iterator.previous());// prints it bakc starting after Connecticut
    }
    }
}
