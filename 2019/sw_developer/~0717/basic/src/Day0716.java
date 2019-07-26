public class Day0716 {
    public static void main(String[] args) {
        double r;
        r = bokri(100.0, 100, 0.066);
        System.out.println(r);
        return;
    }

    private static double bokri(double money, int repeat, double mul) {
        for(int i=1;i<=repeat;i++) money += money*mul;
        return money;
    }
}
