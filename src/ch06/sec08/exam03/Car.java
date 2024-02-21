package ch06.sec08.exam03;

public class Car {
    //필드
    int gas; //기름의양

    //메소드
    //1. 기름주유
    void setGas(int gas) {
        this.gas = gas;
    }
    //2. 기름양이 얼마나 남았는지 출력

    boolean isLeftGas() {
        if (gas == 0) {
            System.out.println("기름이 없습니다");
            return false;
        } else {
            System.out.println("기름이 있습니다.");
            return true;
         }
    }
    //3. 자동차가 달리면서 기름을 소진하는 메소드

    void run() {
        while(true) {
            if (gas > 0) {
                System.out.println("달립니다. (gas잔량: " + gas + ")");
                //차가 달릴때 마다 기름을 1씩 소진시킴
                gas -= 1;
            } else { // 기름이 없으면
                System.out.println("멈춥니다. (gas잔량" + gas + ")");
                System.out.println("기름을 주유해라");
                return; // void메소드를 종료시키고 싶을때 return 쓴다 (void메소드는 return할 값이 없을때 쓰는 타입)
            }
        }
    }
}
