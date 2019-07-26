


class Node{
    int data=0;
    Node next = null;

    Node(int i, Node n){
        this.data = i;
        this.next = n;
    }
}

public class test0171 {
    public static void main(String[] args){
        Node head = new Node(11, null);
        Node tail = head;
        //참조형 변수의 대입은 오른쪽이 가리키고 있는 대상을 가리킨다.곧 head가 가리키는 거랑 똑같은 거임. head 가리키는 거 아님

        tail.next = new Node(10, null);
        tail = tail.next;

        tail.next = new Node(20, null);
        tail = tail.next;


        for(Node t = head;t!=null;t=t.next)
            System.out.println(t.data);

        //tail.next가 가리키는 노드를 이제 tail이 그 노드를 가리킨다.
    }
}

/*
    모든 참조형 변수에는 null이라는 값이 대입 가능; -> 가리키는 인스턴스가 없다.
*/