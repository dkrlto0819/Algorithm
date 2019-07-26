class A3 implements Runnable{
    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println("A running");
        }
    }
}

class B3 implements Runnable{
    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println("B running");
        }
    }
}

class C3 implements Runnable{
    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println("C running");
        }
    }
}

public class Test098 {
    public static void main(String[] args){
        Thread[] threads = new Thread[3];

        threads[0] = new Thread(new A3());
        threads[1] = new Thread(new B3());
        threads[2] = new Thread(new C3());


        threads[0].start();
        threads[1].start();
        threads[2].start();

        try {
            threads[0].join(); /// ㅇㅎ 이 스레드(=A3) 가 끝나기 전까지는 안 내려옴.
            threads[1].join();
            threads[2].join();  //몽땅 다 끝나기 전까지는 안 내려간다.
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("finish");
    }

    public static void main_old(String[] args){
        new Thread(new A3()).start();
        new Thread(new B3()).start();
        new Thread(new C3()).start();

        System.out.println("finish");
    }
}
