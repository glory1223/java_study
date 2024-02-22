package ch07.sec08.exam01;

public class CarExample {
    public static void main(String[] args) {
           Car myCar = new Car();

           //Car 클래스의 필드를 이용해 자동 타입변환이 일어난다.
        myCar.tire = new HankookTire(); // = Tire tire = new HankookTire()
        myCar.run(); // tire.roll() -> 오버라이드 된 메소드가 있으면 자식클래스에 있는 메소드 사용.

        myCar.tire = new KumhoTire(); // Tire tire = KumhoTire()
        myCar.run(); // tire.roll() -> 오버라이드된  자식클래스 메소드 실행

        myCar.tire = new Tire(); //Tire tire = new Tire()
        myCar.run();

    }
}
