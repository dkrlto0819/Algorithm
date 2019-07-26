class Toilet1{
    public void bigWork(String by){
        synchronized (this) { //자신에 대한 참조형 변수
            System.out.println("STEP 1." + by);
            System.out.println("STEP 2." + by);
            System.out.println("STEP 3." + by);
            System.out.println("STEP 4." + by);
            System.out.println("STEP 5." + by);
        }
    }

    public synchronized void sleepWork(String by){
        System.out.println("Sleep STEP 1." + by);
        System.out.println("Sleep STEP 2." + by);
        System.out.println("Sleep STEP 3." + by);
    }
}

class A2 implements Runnable{

    private Toilet1 toilet = null;

    public A2 (Toilet1 t){
        toilet = t;
    }

    public void run(){
        for (int i = 0; i < 100; i++) {


            int time= (int)(Math.random()*1000);
            if(time%2 ==0 ) {
                toilet.bigWork("Apple");

            }else {
                toilet.sleepWork("Apple");
            }

            try {
                Thread.sleep(time);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

class B2 implements Runnable{
    private Toilet1 toilet = null;

    public  B2(Toilet1 t){
        toilet = t;
    }
    public void run() {
        for (int i = 0; i < 100; i++) {

            int time= (int)(Math.random()*1000);
            if(time%2 ==0 ) {
                toilet.bigWork("Banana");

            }else {
                toilet.sleepWork("Banana");
            }


            try {
                Thread.sleep(time);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
class Test096 {
    public static void main(String[] args){
        Toilet1 t = new Toilet1(); // 하나의 토일렛 공유

        new Thread(new A2(t)).start();
        new Thread(new B2(t)).start();

    }
}