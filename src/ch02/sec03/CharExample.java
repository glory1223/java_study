package ch02.sec03;

public class CharExample {
    public static void main(String[] args) {
        char c1 = 'A'; //문자 1개만 쓸수있다. 작은따옴표로 표현.
        char c2 = 65; //유니코드 값에 해당하는 문자 A
        char c3 = '가';
        char c4 = 44032; //유니코드 값

        //빈문자(공백)를 표현하고 싶을때 -> 공백도 해당하는 유니코드 값을 가지고있음
        char c5 = ' ';

        System.out.println(c1);
        System.out.println(c2);
        System.out.println(c3);
        System.out.println(c4);
        System.out.println(c5);
    }
}
