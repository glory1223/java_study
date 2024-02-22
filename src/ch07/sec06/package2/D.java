package ch07.sec06.package2;

import ch07.sec06.package1.A;

public class D extends A {

    private A a;

    public D () {
        super(); //부모클래스의생성자를 호출 // A클래스의 생성자호출(부모클래스의 생성자에 매개변수가 있으면 생략불가능)
    }

    public void methoed1() {
        //상속관계일때 proected 부모클래스의 필드와 메소드를 사용할 수 있음.
        this.field = "value";
        this.method();
    }
    public void methoed2() {
        /* ★직접 객체를 생성해서 사용할수는 없음
        a = new A();
        a.field = "value";
        a.method();
         */
    }
}
