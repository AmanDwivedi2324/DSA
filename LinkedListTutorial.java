public class LinkedListTutorial {

    Node head;
    private int size;

    LinkedListTutorial(){
        this.size = 0;
    }
    class Node{
       
        String data;
        Node next;

        Node(String data){
            this.data = data;
            this.next = null;
            size++;
        }
    }

    //add first 

    public void addFirst(String data){
        
        Node newNode = new Node(data);
        if(head == null){
            head = newNode;
            return;
        }

        newNode.next = head;
        head = newNode;
    }


    //add last 

    public void addLast(String data){
        Node newNode = new Node(data);
        if(head == null){
            // newNode.next = head;
            head = newNode;
            return;
        }
        Node currNode = head;
        while(currNode.next != null){
            currNode = currNode.next;
        }
        currNode.next = newNode;
    }

    
    // Print list

    public void printList(){
        Node currNode = head;

        if(head == null){
            System.out.println("List is empty..");
            return;
        }

        while(currNode != null){
            System.out.print(currNode.data + " --> ");
            currNode = currNode.next;
        }
        System.out.println("NULL");
    }


    //delete first

    public void deleteFirst(){
        if(head == null){
            System.out.print("List is empty");
            return;
        }
        size--;
        head = head.next;
    }


    //delete last

    public void deleteLast(){
        if(head == null){
            System.out.print("List is empty");
            return;
        }
        
        size--;
        if(head.next == null){      //when list has only one node
            head = null;
            return;
        }

        Node secondLast = head;
        Node lastNode = head.next;
        if(lastNode != null){
            lastNode = lastNode.next;
            secondLast = secondLast.next;
        }

        secondLast.next = null;

    }


    //size 

    public int getSize(){
        return size;
    }


    public static void main(String[] args) {
        LinkedListTutorial list = new LinkedListTutorial();
        list.addFirst("a");
        list.addFirst("is");
        list.printList();

        list.addLast("list");
        list.printList();

        list.addFirst("This");
        list.printList();

        list.deleteFirst();
        list.printList();

        list.deleteLast();
        list.printList();
        
        System.out.println(list.getSize());
        }
}
