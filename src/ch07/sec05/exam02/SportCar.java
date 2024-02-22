package ch07.sec05.exam02;

public class SportCar extends car{
    @Override
    public void speedUp() {
        speed += 10;
    }

/*
       @Override // final 메소드는 오버라이드 불가
        public void stop() {
        System.out.println("차를 멈춤");
        speed = 0;
    }
 */
}
