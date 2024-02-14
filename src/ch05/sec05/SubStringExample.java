package ch05.sec05;

public class SubStringExample {
    public static void main(String[] args) {
        //문자열 잘라내는 메소드 substring()
        String ssn = "880815-1234567";

        String firstNum = ssn.substring(0 , 6); //앞자리 출력 (시작인덱스번호,  끝인덱스번호)
        System.out.println(firstNum);

        String secondNum = ssn.substring(7); //(이인덱스에서 시작, 끝까지)
        System.out.println(secondNum);
    }
}
