package ch04.sec04;

public class FloatCount {
    public static void main(String[] args) {
      /* 이처럼 자바에서 부동소수점은 연산이 정확하게 되지 않음.
        *반복문의 초기화식 타입에 실수형을 사용하지 않는다. */
        for(float x = 0.1f; x <= 1.0f; x += 0.1f ) {
            System.out.println(x);
        }
    }
}
