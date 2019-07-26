import temp.IGreet;

public class Test044 {
    public static void main(String[] args) throws ClassNotFoundException {
        Class<?> cls = Class.forName("temp.HelloGreet");
        IGreet ig = null;
        try {
            ig = (IGreet)cls.newInstance(); //IGreet만 상속 받으면 바로 상속받은 애면 다 쓸 수 있지 않을까?
                                            //굳이 먼저 HelloGreet 만들 필요 없음
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        }
        System.out.println(ig.greet());
    }
}
