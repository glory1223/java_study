package ch07.sec07.exam02;

public class ChildExample {
    public static void main(String[] args) {
    Child child = new Child();

        //자동타입변환 (부모클래스에있는 필드와 메소드만 사용가능.
        // 단, 오버라이드된 메소드는 예외적으로 자식클래스에 있는것을 사용.
        Parent parent = child;

        //메소드 호출
        parent.method1();
        parent.method2(); //자식클래스에서 오버라이드되어 자식클래스의 메소드 사용
        //parent.method3(); //Parent에서 method3() 가 없음

        parent.field1 =2;
         //parent.field2 =2;
    }
}
