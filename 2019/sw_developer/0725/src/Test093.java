/*
오버라이딩 할 떄 throws Exception 같은 거 붙여서는 못한다. (조상에서 선언된 대로만 재 정의해야함)
 */

class CustomThreaded implements Runnable{
    public void run(){
        for (int i=0;i<100;i++){
            System.out.println("HelloWorld!"+i);
        }
    }
}

public class Test093 {
    public static void main(String[] args){
        Runnable rb = new CustomThreaded();
        rb.run();   // 단순호출

        /*
        new Thread() 하면 가상의 CPU를 OS에서 할당받는다.(분신 만들기!)
        할당받은 CPU는 생성자에 넘겨진 포인터를 물고 간다.
        start() 호출시에 준비과정을 거쳐 새로운 가상 CPU가 rb.run()을 호출한다.

         1. Ruunnable 상소받은 클래스 선언.
         2. new Thread 하면서 1의 인스턴스의 포인터를 넘긴다.
         3. Thread의 start()를 호출하면 가상의 CPU(스레드)가 run()을 호출한다
         */

        Thread th = new Thread(rb);
        th.start();
    }
}
