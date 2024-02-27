package ch08.sec09;

public class ExtendsExample {
    public static void main(String[] args) {
        InterfaceImpl impl = new InterfaceImpl();

        InterfaceA ia = impl; //자동타입변환
        ia.methodA();
        //ia.methodB();
        //ia.methodC();

        InterfaceB ib = impl;
        //ib.methodA();
        ib.methodB();
        //ib.methodC();

        InterfaceC ic = impl;
        ic.methodA(); //InterfaceC는 extends로 A와 B 상속
        ic.methodB();
        ic.methodC();

    }
}
