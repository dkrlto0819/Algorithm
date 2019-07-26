public class LinkedList {
    Node head;
    Node tail;

    LinkedList(){
        head = new Node(0, null, null);
        tail = head;
    }

    void add(int data){
        tail.next = new Node(data, tail, null);
        tail = tail.next;
    }

    void stackDelete(){
        tail = tail.pre;
        tail.next = null;
    }

    void queueDelete(){
        head = head.next;
        head.pre = null;
    }


    void stackPrint(){
        System.out.println("this is stack print");
        for(Node n=tail; n!=head; n=n.pre)
            System.out.println(n.data);

    }

    void queuePrint(){
        System.out.println("this is queue print");
        for(Node n=head.next; n!=null; n=n.next)
            System.out.println(n.data);
    }
}
