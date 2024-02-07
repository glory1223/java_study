package ch02.sec06;

public class StringExample {
    public static void main(String[] args) {
//        char var1 = "A"; 에러발생! char타입은 작은따옴표써야함
//        char var2 = "홍길동"; 에러발생! char타입은 문자한개만 저장가능
        String var2 = "홍길동"; //문자열을 저장하고싶으면 String타입을 사용한다.

        String name = "홍길동";
        String job = "프로그래머";

        System.out.println(name + "은" + job + "입니다.");

        String str = "나는 \"자바\"를 배웁니다";
        System.out.println(str);

        str = "번호\t이름\t직업";  //탭만큼 띄어쓰기
        System.out.println(str);

        System.out.println("나는\n자바를\n배웁니다."); //줄바꿈
    }
}
