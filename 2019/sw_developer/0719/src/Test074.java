
class FuelException extends Exception{
    public void solve() {
    }
}

/*
java에서 각종 에러는 class로 구현된다.

코드 수행 시 에러가 발생되면 해당 예외 클래스의 인스턴스를 throw 한다.
발생된 예외를 적절하게 처리하지 못하면 프로그램은 종료한다.

"예외는 함수 수행시에 발생되고, 함수에 그 사실을 명시한다."
 */

public class Test074 {
    public void carDrive(int fuel) throws FuelException {
        if(fuel==0){
            throw new FuelException(); //RuntimeException 일 때 가능

            /*
            Exception이 좀더 깐깐하게 굶
             */

        }
        System.out.println("GOGO");
    }

    public static void main(String[] args) {
        Test074 t = new Test074();
        try {
            t.carDrive(0);
        } catch (FuelException e) { //참조형 변수  e가 FuelException 을 가리킨다면...
            e.solve();
            System.out.println("견인차를 불러라");
            /*
            thorws Fuel Exception으로 선언된 함수를 호출할 때는 반드시 에러가 발생할 수 있는 영역을 
            try{..}로 감싸주어야 한다.
            try는 반드시 1개 이상의 catch가 있어야 한다.
            에러가 발생되며 에러 인스턴스를 throw 한다.
            
            catch(FuelException e) 에 있는 e 변수가 발생된 에러 인스턴스를 가리킬 수 있으면
            catch에 딸린 {...} 영역이 동작한다.
            ...에는 에러를 수습할 수 있는 코드가 들어가는 것이 바람직하다.
            
            catch(Exception e)를 써도 되는가? OK
             */
        }
    }
}
