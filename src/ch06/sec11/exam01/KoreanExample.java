package ch06.sec11.exam01;

import ch06.sec11.exam01.Korean;

public class KoreanExample {
    public static void main(String[] args) {
        Korean k1 = new Korean("123456-1234567", "김자바");

        System.out.println(k1.nation);
        System.out.println(k1.ssn);
        System.out.println(k1.name);

        //상수필드(final)는 값을 변경할수 없다.
        //k1.nation = "USA";
        //k1.ssn = "123-33-3333";
    }
}
