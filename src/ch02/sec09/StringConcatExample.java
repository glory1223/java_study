package ch02.sec09;

public class StringConcatExample {
    public static void main(String[] args) {

        //문자열과 연산을 할 경우 나머지 피연산자도 문자열로 인식합니다.
        String result2 = 10 + 2 + "8";
        System.out.println("resutl2: " + result2);

        String result3 = 10 + "2" + 8;
        System.out.println("resutl3: " + result3);

        String result4 = "10" + 2 + 8;
        System.out.println("resutl4: " + result4);

        String result5 = "10" + (2 + 8);
        System.out.println("result5: " + result5);
    }
}
