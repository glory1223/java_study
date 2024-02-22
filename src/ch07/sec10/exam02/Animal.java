package ch07.sec10.exam02;

public abstract class Animal {
    //일반 메소드 구형
    public void breathe() {
        System.out.println("숨을 쉽니다.");
    }

    //추상(abstract) 메소드 구현 -> 선언부만존재.
    // 언제쓰이냐면 오버라이드 용으로 사용한다.
    public abstract void sound();
}
