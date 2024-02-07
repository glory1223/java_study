package ch02.sec09;

public class OperatorExample {
    public static void main(String[] args) {
        byte result1 = 10 + 20 ; //컴파일단계에서 연산을 수행하므로 byte result1 = 30와 같다.
        System.out.println("result1: " + result1);

        byte v1 = 10;
        byte v2 = 20;
        int result2 = v1 + v2; // v1, v2가 각각 int 타입으로 변환이되고 연산이됨
        byte result3 = (byte) (v1 + v2); // int타입 값을 강제타입변환을 시킴 (예외적으로 long타입은 int보다 허용범위가 더크므로 long타입으로 변환됩니다)
        System.out.println("result2: " + result2);

        byte v3 = 10;
        int v4 = 100;
        long v5 = 1000L;
        long result4 = v3 + v4 + v5; // 각각의 변수의 값이 long타입으로 변환후 연산됨. ->★값의 허용범위가 큰 타입으로 변환되어 연산한다.

        System.out.println("result4: " + result4);

        float f1 = 1.2f;
        double d1 = 3.4; //실수타입끼리 연산에서 허용범위가 큰 double타입으로 변환되어 연산되어집니다.
        double result5 = f1 +d1;

        System.out.println("result5: " + result5);

        // 실수와 정수의 연산
        int v9 = 10;
        double result6 = v9  / 4.0; // double타입(실수)으로  변환 후 연산됨
        float result7 = v9  / 4.0f; // 실수리터럴은 기본적으로 double타입으로 인식함. 따라서 float타입의 값은 f를 붙여야한다.
        System.out.println("result6: " + result6);

        //char의 연산
        char v6 = 'A'; //65
        char v7 = 1;
        int result8 = v6 + v7; //int타입으로 변환후 연산
        System.out.println("result8: " + result8);
        System.out.println("result8: " + (char)result8);

        int x = 1;
        int y = 2;
        double result = x / y ; // ★정수 연산의 결과는 항상 정수. 그렇기떄문에 0.5가아닌 double타입변수에 저장된 0.0이 출력
        System.out.println("result: " + result);

        //그렇다면 0.5값을 얻으려면 둘중하나 또는 둘다를 실수타입의 변수값으로 바꿔주면됨.
        double result9 = (double) x / (double) y;
        System.out.println("result9: " + result9);
    }
}
