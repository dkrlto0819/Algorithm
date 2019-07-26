abstract class Bank{
    abstract public double calc(double money, int years, double rate);
    public void print(){
        double r = calc(100, 100, 0.066);
        System.out.println(r);
    }
}

class bokriBank extends Bank{
    public double calc(double money, int years, double rate) {
        return 59665;
    }
}

class danriBank extends Bank{
    public double calc(double money, int years, double rate) {
        return 3000;
    }
}

public class Test026 {
    public static void main(String[] args){
        Bank bokri = new bokriBank();
        Bank danri = new danriBank();

        bokri.print();
        danri.print();
    }
}
