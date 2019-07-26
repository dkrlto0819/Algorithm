interface ICalc{
    public int execute(int i);
}


interface PrintStars{}
// 이게 annotation. 붙었으면 맞게 처리 쓰임 당하는 쪽에서 어떤 식으로 쓰였음 좋겠다 생각해 의사표시를 하면 거기에 맞게 돌려줘야지 할때 빈 인터페이스가 쓰인다.

class AddCalc implements ICalc{
    private int data = 0;

    AddCalc(int j){
        this.data = j;
    }

    @Override
    public int execute(int i) {
        return i + data;
    }
}

class Minus implements ICalc, PrintStars{
    private  int data = 0;

    Minus(int j){
        this.data = j;
    }

    @Override
    public int execute(int i) {
        return i-data;
    }
}

public class Test056 {
    public static void main(String[] args){
        ICalc i =new AddCalc(3);
        ICalc j = new Minus(100);

        int r = 5;
        r=i.execute(r);

        System.out.println(r);

        ICalc[] ls = new ICalc[5];
        ls[0]=new AddCalc(2);
        ls[1]=new Minus(6);
        ls[2]=new AddCalc(3);
        ls[3]=new AddCalc(7);
        ls[4]=new Minus(5);

        int sum=0;
        for(int k=0;k<ls.length;k++) {
            sum = ls[k].execute(sum);

            if(ls[k] instanceof PrintStars){
                System.out.println("**" + sum);
            }

        }
        System.out.println(sum);



    }
}
/*
일반적으로 자료값은 변수로, 동작은 함수로 만든다

동작을 하나의 인스턴스로 수행하게 하는 경우가 있다.
- 이런 설계 기법을 Command Pattern이라고 한다.

왜 이렇게 복잡하게 쓰여? 그런데 많이 쓰이는 기법이래!


빼기를 할 떄는 **를 붙여서 프린트를 하라고 시키고 싶다
일시적으로 시키고 싶은 경우가 있더라.
==>옛날 프로그래머들은 빈 인터페이스를 이럴 때 사용함 => interface PrintStars{}



 */
