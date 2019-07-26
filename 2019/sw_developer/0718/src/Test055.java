public class Test055 {
    public static void main(String[] args){
        Integer i = 100;
        Object p = 200;
        System.out.println(i.getClass().getName());
        System.out.println(p.getClass().getName());

        int j=i; // => int j=i.intValue(); 로 자동으로 동작
        System.out.println(j);

        int k= (Integer) p;
    }
}

/*
Integer i =100;은 컴파일러가 자동으로 Integer i = new Integer(100); 으로 바꿔버림
값을 wrapper클래스에 대입하는 코드는 자동으로 인스턴스 생성해서 값을 갑싸준다.
=> auto boxing

Object p=200; Object형 변수에 대해서도 Autoboxing은 동작한다.

 int j=i는 j=i.intValue()로 자동 변환하여 준다. = unboxing

 int k=p;는 안된다. Object 타입으로 오토박싱된 인스턴스는 언박싱이 안됨
 t.intValue(0 불가
 */