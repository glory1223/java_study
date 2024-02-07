package ch02.sec02;

public class IntergerLiteralExample {
    public static void main(String[] args) {
        // 1011(2) =>0b를 붙여서 십진수
        int var1 = 0b1011;
        System.out.println(var1);

        //8진수: 0~7사이의 숫자로 작성되는 수 206(8) => 0을붙여서 십진수
        int var2 = 0206;
        System.out.println(var2);

        //16진수: 0~9사이의 숫자, A~F 까지의 문자로 작성되는 수 B3(16) => 0x를 붙여서 십진수
        int var3 = 0xB3;
        System.out.println(var3);
    }
}
