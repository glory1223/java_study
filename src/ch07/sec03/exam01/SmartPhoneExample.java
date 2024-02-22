package ch07.sec03.exam01;

public class SmartPhoneExample {
    public static void main(String[] args) {
        SmartPhone myPhone = new SmartPhone ("아이폰11pro","잭블랙"); // 객체가 생성될때는 무조건 생성자가 실행된다.

        System.out.println("모델: " + myPhone.model);
        System.out.println("색상: " + myPhone.color);
    }
}
