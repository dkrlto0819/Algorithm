interface IGreet{
    public String greet();
}

class MerciGreet implements IGreet{
    @Override
    public String greet() {
        return "Merci";
    }
}

class HelloGreet implements IGreet{

    @Override
    public String greet() {
        return "Hello";
    }
}

abstract class GreetDeco implements IGreet{
    protected IGreet ig = null;

    GreetDeco(IGreet ig){
        this.ig = ig;
    }
}

class SharpDeco extends GreetDeco{
    SharpDeco(IGreet ig){
        super(ig); //매개변수가 있는 생성자를 호출 하고 있다 => 조상이 먼저 호출되고 자식이 호출되니까!
    }
    @Override
    public String greet() {
        return "#" + ig.greet() + "#";
    }
}

class StarDeco extends GreetDeco{
    StarDeco(IGreet ig){
        super(ig); //매개변수가 있는 생성자를 호출 하고 있다 => 조상이 먼저 호출되고 자식이 호출되니까!
    }
    @Override
    public String greet() {
        return "*" + ig.greet() + "*";
    }
}

public class last0717 {
    public static void main(String[] args){
//        IGreet person = new MerciGreet();
//        IGreet person2 = new HelloGreet();
//
//        System.out.println(person.greet());
//        System.out.println(person2.greet());

        IGreet ig = new StarDeco(new MerciGreet());
        IGreet ig2 = new SharpDeco(new StarDeco(new StarDeco(new MerciGreet())));
        System.out.println(ig2.greet());
    }
}
