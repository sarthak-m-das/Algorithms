class Node {
    int d;
    Node l;
    
    Node(int data) {
        d = data;
        l = null;
    }
}

public class LinkedList {
    Node head;
    
    LinkedList(Node h) {
        head = h;
    }
    
    public void printList() {
        Node n = head;
        
        while (n!=null){
            System.out.println(n.d);
            n = n.l;
        }
    }
    
    public static void main(String args[]) {
      Node h = new Node(1);
      Node n2 = new Node(2);
      Node n3 = new Node(3);
      
      h.l = n2;
      n2.l = n3;
      
      LinkedList ll = new LinkedList(h);
      
      ll.printList();
    }
}