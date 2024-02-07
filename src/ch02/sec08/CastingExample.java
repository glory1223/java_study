package ch02.sec08;

public class CastingExample {
    public static void main(String[] args) {

        //강제타입 변환(int -> byte)
        int var1 = 103029778;
        byte var2 = (byte) var1; //int타입의 값이 byte의 값의 허용범위 이내일 경우 데이터손실이 없음.
        System.out.println("var2: " + var2);

        //강제타입 변환(long -> int)
        long var3 = 300;
        int var4 = (int) var3;
        System.out.println("var4: " + var4);

        //강제타입 변환(int -> char)
        int var5 = 65;
        char var6 = (char)var5; // int타입값이 char타입의 유니코드값으로 강제 변환
        System.out.println("var6: " + var6);

        //강제타입 변환(실수 -> 정수)
        double var7 = 3.14;
        int var8 = (int)var7; // 강제타입 변환 되면서 소수점 이하는 짤림.
        System.out.println("var8: " + var8);
    }
}
