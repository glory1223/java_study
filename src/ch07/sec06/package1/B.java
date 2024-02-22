package ch07.sec06.package1;

public class B {
    public void method() {
        //protected접근제한자 같은 패키에있는 클래스에서 사용가능
        A a = new A();
        a.field = "value";
        a.method();
    }
}
