package ch08.sec02;

public interface RemoteControl {

    //인터페이스는 필드에서 상수만 받을수있음.

    int MAX_VOLUME = 10; // public static final 생략됨. (static: 객체를 생성하지 않고 클래스명.속성메소드 으로 사용)
    int MIN_VOLUME = 0;

    public void turnOn(); // abstract가 생략됨

}
