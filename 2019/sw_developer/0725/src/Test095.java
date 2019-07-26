class Toilet{
    public void bigWork(String by){
        System.out.println("STEP 1." + by);
        System.out.println("STEP 2." + by);
        System.out.println("STEP 3." + by);
        System.out.println("STEP 4." + by);
        System.out.println("STEP 5." + by);
    }
}

class A1 implements Runnable{

    private Toilet toilet = null;

    public A1 (Toilet t){
        toilet = t;
    }

    public void run(){
        for (int i = 0; i < 100; i++) {
            toilet.bigWork("Apple");

            int time= (int)(Math.random()*1000);
            try {
                Thread.sleep(time);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

class B1 implements Runnable{
    private Toilet toilet = null;

    public  B1(Toilet t){
        toilet = t;
    }
    public void run() {
        for (int i = 0; i < 100; i++) {
            toilet.bigWork("Banana");

            int time= (int)(Math.random()*1000);
            try {
                Thread.sleep(time);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
public class Test095 {
    public static void main(String[] args){

        Toilet t = new Toilet(); // 하나의 토일렛 공유

        new Thread(new A1(t)).start();
        new Thread(new B1(t)).start();

    }
}
    //Apple 위로 Banana 되는 사태 발생.. .대 참사.. (ㅅㅂ)
    //스레드는 독자적으로 이루어지는 프로그램이 얼마든지 이럴 수 있다.
// 문을 잠가서 문제를 해결하자. (=> 화장실을 잠가야 하는 것) :: synchroization = 동기화

/*
스레드 프로그름에서는 잠금이 중요한데 그것을 동기화(synchronization)이라고 한다.
 */