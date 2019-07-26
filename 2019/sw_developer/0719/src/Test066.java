import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class Test066 {
    public static void main(String[] args) throws ClassNotFoundException, IllegalAccessException, InstantiationException, NoSuchMethodException, InvocationTargetException {
        Class<?> cls = Class.forName("Test063"); // 클래스 강제 로딩
       Object obj = cls.newInstance();

//        System.out.println(obj.getClass().getName());
//        ((Temp.Test063)obj).print();

        Method[] mmtds = cls.getMethods();
        for(int i=0;i<mmtds.length;i++)
            System.out.println(mmtds[i]);



        /*
        getMethos() : 클래스 안에서 선언된 함수에 대한 포인터를 출력한다.
         */

        Method mtd = cls.getMethod("print");
        System.out.println(mtd);;

        mtd = cls.getMethod("print2", int.class);
        System.out.println(mtd);

//        mtd = cls.getMethod("print3", int.class);
//        System.out.println(mtd);

        Object r = mtd.invoke(obj, 20);
        System.out.println(((Integer)r).intValue());
        /*
        Method는 C의 함수포인터의 역할을 한다.
        cls.getMethods() : 모든 멤버함수의 포인터를 넘긴다.
        cls.getMethod(....) : 단 하나의 멤버함ㅁ수의 포인터를 넘긴다.
         ... 에는 함수이름, 매개변수의 형태를 명시한다.
~~~> java reflection
         */
    }
}

/*
Class : 로딩된 클랫으ㅢ 관리자 역할을 한다.
cls.newInstance() : cls가 관리하는 temp.Test063 의 인스턴스를 생성

obj.getClass().getName() : obj가 가리키는 인스턴스를 생성시킨 클래스 명
 */

/*
javac Test067.java
java -classpath C:\A\; Test067.java ==> Temp 패키지에 있는 것을 쓰겠다
 */