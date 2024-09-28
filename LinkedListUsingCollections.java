import java.util.*;

public class LinkedListUsingCollections {

    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<>();
        
        list.addFirst("a");
        list.addFirst("is");
        System.out.println(list);   //[is, a]

        list.addLast("list");
        System.out.println(list);   //[is, a, list]

        list.addFirst("This");
        System.out.println(list);   //[This, is, a, list]

        list.add("brother");
        System.out.println(list);   //[This, is, a, list, brother]
        
        System.out.println(list.size());    //5

        for(int i=0;i<list.size();i++){
            System.out.print(list.get(i)+ " --> ");
        }
        System.out.println("null");        //This --> is --> a --> list --> brother --> null

        list.removeFirst();
        System.out.println(list);     //[is, a, list, brother]

        list.removeLast();
        System.out.println(list);     //[is, a, list]

        list.remove("a");
        System.out.println(list);     //[is, list]

        list.remove(1);
        System.out.println(list);     //[is]
}
}
