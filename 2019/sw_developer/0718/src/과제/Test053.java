package 과제;

class Node<T extends Object> {
    T data = null;
    Node next = null;

    Node(T i, Node n) {
        this.data = i;
        this.next = n;
    }
}

class LinkedList<X extends Object>{
    Node<String> head= null;
    Node<String> tail = null;
    LinkedList(){
        head = new Node<String>(null, null);
        tail = head;
    }

    void add(String data){
        tail.next = new Node<String>(data, null);
        tail = tail.next;
    }

    void print(){
        for(Node<String> n = head.next; n!=null;n=n.next)
            System.out.println(n.data);
    }
}

public class Test053 {
    public static void main(String[] args){
        LinkedList l = new LinkedList();

        l.add("apple");
        l.add("banana");
        l.add("kiwi");

        l.print();

    }
}

