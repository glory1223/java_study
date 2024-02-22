package ch07.sec03.exam01;

public class SmartPhone extends Phone {
    public SmartPhone(String model, String color) {

        super(model, color); //부모 객체의 생성자를 실행해준다 부모 생성자의 매개변수가 없다면 생략가능( 컴파일러가 자동으로 추가를 해준다.) 객체가 생성되면 부모객체생성자가 먼저 실행되야한다.
                      // 부모생성자의 매개변수가 있다면 생략이 불가능하다.

//        this.model = model;
//        this.color = color;

        System.out.println("SmartPhone(String model, String color) 생성자 실행");
    }
}
