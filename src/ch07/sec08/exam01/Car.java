package ch07.sec08.exam01;

public class Car {
    //필드로 다형성 구현 ( 오버라이드 + 자동타입변환 )
    //필드에서 자동타입 변환이 발생되도록 한다.


    public Tire tire;

    public void run() {
        tire.roll();
    }
}
