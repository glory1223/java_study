package ch03.sec08;

public class BitLogic {
    public static void main(String[] args) {
        System.out.println(45 & 25);
        System.out.println(45 | 25);
        System.out.println(45 ^ 25);
        System.out.println(~45);

        //온도측정기에서 받은데이터
        byte receiveData = -120; //온도측정기에서 받은 데이터(실제로는 136이지만 JAVA에서는 음수부호때문에 10진수 변환시 아래처럼 보임)

        int unsignInt1 = receiveData & 255; //비트 논리곱 연산으로 데이터 복원
        System.out.println(unsignInt1);

        //그래서 JAVA에서 이런 기능을 아예 제공해주는 메소드가 존재
        int unsignInt2 = Byte.toUnsignedInt(receiveData);
        System.out.println(unsignInt2);
    }
}
