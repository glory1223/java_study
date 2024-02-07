package ch02.sec07;

public class PromotionExample {
    public static void main(String[] args) {

        //자동타입 변환
        byte byteValue = 10;
        int intValue = byteValue; //자동타입 변환 -> 10은 int 타입 값으로 저장된다.
        System.out.println("intValue: " + intValue);

        intValue = 50; // int타입
        long longValue = intValue; //자동타입변환 -> int타입 값이었던 50은 long타입 값으로 저장된다.

        short shortValue = 10;
        int intValue2 = shortValue; // 자동타입변환 -> short타입이었던 10은 int타입으로 저장된다.


        //★정수보다 실수의 허용범위가 더 큼 -> 정수에서 실수로 자동타입변환이 일어난다.
        long longValue2 = 100;
        float floatValue = longValue2;
        double doubleValue = longValue2;

        System.out.println("floatValue: " + floatValue);
        System.out.println("doubleValue: " + doubleValue);

        //실수끼리의 자동타입 변환
        float floatValue2 = 100.5F;
        double doubleValue2 = floatValue2;
        System.out.println("doubleValue2: " + doubleValue2);

        //char -> int타입 변환: char타입의 값들이 유니코드이기 때문에 정수로 표현할수있다.
        char charValue = '가';
        int intValue3 = charValue; // 자동타입변환. 더이상 유니코드가아닌 그냥 정수타입의숫자.
        System.out.println("intValue3: " + intValue3);

    }
}
