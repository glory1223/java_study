package ch08.sec02;

public class RemoteControlExample {
    public static void main(String[] args) {
        RemoteControl rc = new Television(); // 자동타입변환 ->항상 메소드를 실행하면 오버라이드된 자식메소드 실행
        rc.turnOn();

        RemoteControl rc2 = new Audio();
        rc2. turnOn();

        System.out.println("리모콘 최대 볼륨: " + RemoteControl.MAX_VOLUME);
        System.out.println("리모콘 최소 볼륨: " + RemoteControl.MIN_VOLUME);
    }
}
