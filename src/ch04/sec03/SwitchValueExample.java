package ch04.sec03;

public class SwitchValueExample {
    public static void main(String[] args) {
        //java 11 이전 switch 문법

        int score1 = 0;
        String grade = "B";

        switch (grade) {
            case "A" :
                score1 = 100;
                break;
            case "B":
                int result = 100 - 20;
                score1 = result;
                break;
            default :
                score1 = 60;
        }

        // java 13 부터 가능한 yeild (변수에 값 저장)
        int score2 = switch (grade) {
            case "A" -> 100; //단일 값 저장시
            case "B" -> {
                int result = 100 - 20;
                yield result; // 연산식이나 다른 코드 실행 후 값을 저장해야 할시 yield를 사용
            }
            default -> 60;
        }; //세미클론을 찍어줘야한다.
        System.out.println("score2 :" + score2);
    }
}
