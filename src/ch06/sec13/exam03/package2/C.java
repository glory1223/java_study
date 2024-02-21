package ch06.sec13.exam03.package2;

import ch06.sec13.exam03.package1.A;

public class C {
    public void method() {
        A a = new A();

        //다른 클래스 내에 이는 필드에 접근하기

        a.field1 = 1;
        //a.field2 = 1; //dafult 접근제한자 필드
        // a.field3 = 1; private 필드이기때문에 접근불가능.

        //다른 패키지 내에 있는 메소드에 접근하기

        a.method1();
        //a.method2(); // dufault 접근제한자 메소드
        // a.method3(); private 메소드이기 때문에 접근불가능.
    }
}
