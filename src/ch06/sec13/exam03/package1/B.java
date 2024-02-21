package ch06.sec13.exam03.package1;

public class B {

    //객체를 생성해서사용하기 위해 만든 메소드
    public void method() {
        A a = new A();

        //다른 클래스 내에 이는 필드에 접근하기

        a.field1 = 1;
        a.field2 = 1;
        // a.field3 = 1; private 필드이기때문에 접근불가능.

        //다른 클래스 내에 있는 메소드에 접근하기

        a.method1();
        a.method2();
        // a.method3(); private 메소드이기 때문에 접근불가능.
    }
}
