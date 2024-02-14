package ch05.sec05;

public class EqualsExample {
    public static void main(String[] args) {
        String strVar1 = "홍길동"; //문자열 객체 (홍길동이라는 데이터를 가지고있음)
        String strVar2 = "홍길동";
        String strVar3 = new String("홍길동");
        String strVar4 = new String("홍길동");


        //객체를 비교하는것은 주소를 비교하는 것이다.
      if (strVar1 == strVar2) { //String에서는 값(리터럴)이 동일하다면 같은 객체를 공유합니다(메모리의 효율떄문에). 즉, 주소가 같다.
          System.out.println("strVar1과 strVar2의 참조가 같음");
      } else {
          System.out.println("strVar1과 strVar2의 참조가 다름");
      }

      //String 객체의 리터럴을 비교하고싶으면 equals()
        if(strVar1.equals(strVar2)) {
            System.out.println("strVar1과 strVar2의 문자열이 같음");
        }

      if (strVar3 == strVar4) { //new String을 사용한다면 저장되어있는 데이터(값)이 같더라도 다른 객체를 사용합니다. 즉, 주소가 다름.
          System.out.println("strVar3과 strVar4의 참조가 같음");
      } else {
          System.out.println("strvar3과 strVar4의 참조가 다름");
      }

        //String 객체의 리터럴을 비교하고싶으면 equals()
        if(strVar3.equals(strVar4)) {
            System.out.println("strVar3과 strVar4의 문자열이 같음");
        }

        if (strVar1 == strVar3) { //new String을 사용한다면 저장되어있는 데이터(값)이 같더라도 다른 객체를 사용합니다. 즉, 주소가 다름.
            System.out.println("strVar1과 strVar3의 참조가 같음");
        } else {
            System.out.println("strVar1과 strVar3의 참조가 다름");
        }

        //String 객체의 리터럴을 비교하고싶으면 equals()
        if(strVar1.equals(strVar3)) {
            System.out.println("strVar1과 strVar3의 문자열이 같음");
        }
    }
}
