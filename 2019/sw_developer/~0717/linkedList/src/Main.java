public class Main {
    public static void main(String[] args){
        LinkedList stack = new LinkedList();
        LinkedList queue = new LinkedList();

        stack.add(10);
        stack.add(20);

        queue.add(15);
        queue.add(25);

        stack.stackPrint();
        queue.queuePrint();

        stack.stackDelete();
        queue.queueDelete();

        stack.stackPrint();
        queue.queuePrint();
    }
}
