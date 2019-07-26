import Temp.PrintStars;

import java.lang.annotation.Annotation;
import java.lang.reflect.Method;

public class Test067 {
    public static void main(String[] args) throws Exception {
        Class<?> cls = Class.forName("Temp.Test067"); // 이거 찾아야하니까 -classpath 줘야함
        Object obj = cls.newInstance();

        Method mtd = cls.getMethod("print");
        System.out.println( mtd );

        // PrintStars import 필요
        Annotation anot = mtd.getAnnotation( PrintStars.class );
        Object r = mtd.invoke(obj);
        if(anot!=null) System.out.print("**"); // PrintStarts 라는 annotation 이 있으면!
        System.out.println(((Integer)r).intValue());

        System.out.println( mtd.invoke(obj) );
    }

}
