package ch03.sec04;

public class Accuracy2 {
    public static void main(String[] args) {
        // Accuracy1 사과문제의 개선
        int apple = 1;
        int totalPieces = apple * 10;
        int number = 7;

        double result = totalPieces - number;

        System.out.println("10 조각일때 남은 양: " + result);
        System.out.println("1조각 일때 남은 양 " + result/10);
        // 따라서 정확한 실수의 값을 얻고싶으면 정수로 먼저 계산 후 실수로 변경

    }
}
