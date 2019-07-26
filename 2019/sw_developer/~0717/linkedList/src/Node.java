public class Node {
    int data;
    Node pre = null;
    Node next = null;
    Node(int data, Node pre, Node next){
        this.data = data;
        this.pre = pre;
        this.next = next;
    }
}
