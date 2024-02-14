package ch05.sec05;

public class RepalceExample {
    public static void main(String[] args) {
        //문자열 바꾸는 메소드 replace()
        String oldStr = "자바 문자열은 불변. 자바 문자열은 String";
        String newStr = oldStr.replace("자바", "JAVA");

        System.out.println(oldStr);
        System.out.println(newStr);
    }
}
