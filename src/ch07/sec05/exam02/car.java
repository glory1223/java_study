package ch07.sec05.exam02;

public class car {
    public int speed;

    public void speedUp() {
        speed ++;
    }

    public final void stop() { //final 메소드는 오버라이드 할수없다.
        System.out.println("차를 멈춤");
        speed = 0;
    }
}
