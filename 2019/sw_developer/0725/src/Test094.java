/*
Program : exeutable file . 실행가능한 파일
Process : a running program
Thread : a light-weighted process : 독자 행동을 하지만 프로세스와는 조금 다름)
: 스레드는 프로세스 안에서만 존재가 가능하다.
: 스레드간 메모리를 공유할 수 있다.
  프로세스간은 메모리 전달(가장 대표 수단 = socket)은 가능해도 공유는 불가능하다.
  '프로세스간의 메모리 전달의 대표적 수단이 소켓이다.'
  (복사&붙이기도 전달로 볼 수 있지만 이건 윈도우에서 국한된 개념)

: 프로세스 종료 == 프로세스가 가진 모든 쓰레드의 종료
(인간을 생각하면 이해 쉬움.. : 사람 - 프로세스 / 스레드 - 뇌 위장 척추 ...)
 */

class A implements Runnable{
    public void run(){
        for (int i = 0; i < 100; i++) {
            System.out.println("Apple");

            int time= (int)(Math.random()*1000);
            try {
                Thread.sleep(time);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

class B implements Runnable{
    public void run() {
        for (int i = 0; i < 100; i++) {
            System.out.println("Banana");

            int time= (int)(Math.random()*1000);
            try {
                Thread.sleep(time);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

public class Test094 {
    public static void main(String[] args){

        new Thread(new A()).start();
        new Thread(new B()).start();

    }
}

// 왜 이렇게 된다? 스레드 때문에!
