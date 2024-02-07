package ch03.sec01;

public class SignOperatorExample {
    public static void main(String[] args) {
        int x = -100;
        x = -x;
        System.out.println("x: " + x);

        byte b = 100;
        int y = -b; // java에서는 부호를 붙이는것도 연산으로 취급하여 자동타입변환이 발생한다.(정수타입끼리의 연산은 int타입으로 자동변환)
        System.out.println("y: " + y);

    }
}
