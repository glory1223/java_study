package ch04.sec03;

public class SwitchExpression {
    public static void main(String[] args) {
        char grade = 'B' ;

        switch (grade) {
            /*Java 12 이후부터 사용하는 switch Expressions
            *break문을 없애고 화살표(->) 와 중괄호({ })를 사용해 가독성을 높임
             * 한줄이면 중괄호역시 생략 가능.
             */
            case 'A', 'a' -> {
                System.out.println("우수 회원입니다");
            }
            case 'B', 'b' -> {
                System.out.println("일반 회원입니다,");
            }
            default -> {
                System.out.println("손님입니다.");
            }
        }
    }
}
