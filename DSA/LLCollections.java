package DSA;
import java.util.*;
public class LLCollections {
    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<String>();
        list.addFirst("a");
        list.addFirst("is");
        list.addLast("List");
        list.addFirst("This");
        for(int i = 0; i<list.size(); i++) {
            System.out.print(list.get(i) + " --> ");
        }
        System.out.println("null");
        
        list.remove(2);
        System.out.println(list);

    }
}
