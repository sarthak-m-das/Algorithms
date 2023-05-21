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
    
    void printList() {
        Node n = head;
        
        System.out.println();
        while (n!=null){
            System.out.print(n.d + " ");
            n = n.l;
        }
    }
    
    void push(int data) {
        Node n = new Node(data);
        Node x = head;
        
        while (x.l != null){
            x = x.l;
        }
        x.l = n;
    }
    
    void pushFront(int data) {
        Node n = new Node(data);
        
        n.l = head;
        head = n;
    }
    
    void insertAfter(int key, int value) {
        Node x = head;
        
        while(x.d != key) {
            x = x.l;
        }
        
        Node n = new Node(value);
        n.l = x.l;
        x.l = n;
    }
    
    void delete(int key) {
        Node x = head;
        Node p = null;
        
        while(x.d != key) {
            p = x;
            x = x.l;
        }
        
        if (x == head) {
            head = x.l;
        } else {
            p.l = x.l;
        }
        x = null;
    }
    
    public static void main(String args[]) {
      Node h = new Node(1);
      LinkedList ll = new LinkedList(h);
      
      ll.push(2);
      ll.push(3);
      ll.push(4);
      
      ll.insertAfter(2,5);
      ll.pushFront(20);
      
      ll.printList();
      
      ll.delete(20);
      ll.printList();
      
      ll.delete(5);
      ll.printList();
      
    }
}