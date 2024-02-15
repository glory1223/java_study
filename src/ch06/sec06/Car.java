package ch06.sec06;

public class Car {

    //<클래스의 구성> 객체의 속성과 기능은 설계도에 해당하는 class에 미리 작성해 준다.

      //1.필드 (객체의 속성)
      String company = "현대"; //제조사
       int maxSpeed = 350; //최대속도
       String model = "gv90"; // 자동차 모델
       boolean start = true; // 시동여부
       int speed ; // 현재속도
       String color = "black";

      //2.생성자
      //3.메소드 (객체의 기능)
       public void run() {
           System.out.println("차가 달립니다");
       }
       public void stop() {
           System.out.println("차가 멈춥니다.");
       }

}
