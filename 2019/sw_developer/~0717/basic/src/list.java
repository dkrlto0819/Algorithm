
//class LinkedList{
//    NewNode head = null;
//    NewNode tail = null;
//
//    LinkedList(){
//        this.head = new NewNode(0, null);
//        this.tail = this.head;
//    }
//
//    void add(int i){
//        tail.next = new NewNode(i, null);
//        tail = tail.next;
//    }
//
//    void print(){
//        for(NewNode t = this.head.next;t!=null;t=t.next)
//            System.out.println(t.data);
//    }
//}

class LinkedList{
    NewNode head;
    NewNode tail;

    LinkedList(){
        this.head = new NewNode(0, null);
        this.tail = this.head;
    }

    void add(int i){
        tail.next = new NewNode(i, null);
        tail = tail.next;
    }

    void print(){
        for(NewNode n=this.head.next;n!=null;n=n.next)
            System.out.println(n.data);
    }
}

class NewNode{
    int data=0;
    NewNode next = null;

    NewNode(int i, NewNode n){
        this.data = i;
        this.next = n;
    }
}

public class list {
    public static void main(String[] args){
        LinkedList l = new LinkedList();
        l.add(10);
        l.add(20);
        l.print();


    }
}

/*
    모든 참조형 변수에는 null이라는 값이 대입 가능; -> 가리키는 인스턴스가 없다.
*/
