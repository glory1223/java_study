package ch06.sec13.exam02.package2;

import ch06.sec13.exam02.package1.A;

public class C {
    A a1 = new A(true);
    // A a2 = new A(1); A클래스에서 접근제한자로 초기화시켰기때문에 다른클래스에서 접근불가능.
    //A a3 = new A("문자열");   A클래스에서 private생성자로 초기화 시켰기때문에 다른클래스에서 접근 불가능.
}

