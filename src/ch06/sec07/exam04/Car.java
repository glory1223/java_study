package ch06.sec07.exam04;

public class Car {

    //필드 생성
    String company = "현대자동차";
    String model;
    String color;
    int maxSpeed;

    //생성자 선언 ( 오버로딩을 하고자 한다면 매개변수의 갯수가 같을경우는 타입과 순서가 각각 한개씩은 달라야함)
    Car() {}
    Car(String model) {
        this(model, "은색", 250);
    }
    Car(String model, String color) {
     this(model, color, 250);
    }
    Car(String model, String color, int maxSpeed) {
        this.model = model;
        this.color = color;
        this.maxSpeed = maxSpeed;
    }

    /*
    Car() {}
    Car(String model) {
        this.model = model;
    }
    Car(String model, String color) {
        this.model = model;
        this.color = color;
    }
    Car(String model, String color, int maxSpeed) {
        this.model = model;
        this.color = color;
        this.maxSpeed = maxSpeed;
    }
     */

    //메소드 생성
}