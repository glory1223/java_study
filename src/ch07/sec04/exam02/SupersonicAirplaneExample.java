package ch07.sec04.exam02;

public class SupersonicAirplaneExample {
    public static void main(String[] args) {
        SupersonicAirplane sa = new SupersonicAirplane();
        sa.takeOff();
        sa.fly();
        sa.flyMode = SupersonicAirplane.SUPERSONIC; //정적필드에 객체생성없이 접근가능.
        sa.fly(); //오버라이드된 fly 실행

        sa.flyMode = SupersonicAirplane.NORMAL;
        sa.fly();
    }
}
