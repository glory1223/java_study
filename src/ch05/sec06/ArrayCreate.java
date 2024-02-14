package ch05.sec06;

public class ArrayCreate {
    public static void main(String[] args) {
        // 배열의 선언 (첫번재 형식)
        int[] intArray = {1, 2, 3}; // 배열의 값에 int값만 올수 있음. 값의허용범위 낮은 리터럴들 자동타입변환 가능.
        // int[] intArray = new int[] {1, 2, 3} 이런식으도 선언과 값할당 가능.
        double[] doubleArray = {0.1, 0.2, 3, 4 }; // 배열의 값에 double 값만 올수있음 정수값을 넣어도 자동타입변환되서 괜찮음.
        String[] season = {"봄", "여름", "가을", "겨울"}; //배열의 값에 문자열값만 올수 있음.

        //데이터 5개를 저장할수 있는 배열을 선언( 값을 할당하진 않음)
        int[] intArray3 = new int[5];

        //배열의 선언 (두번째 형식)
        int intArray2[];
        double doubleArray2[];
        String season2[];

        //배열의 값 읽기
        System.out.println(season[0]);
        System.out.println(season[1]);
        System.out.println(season[2]);
        System.out.println(season[3]);

        //배열의 값 수정
        season[1] = "summer";
        System.out.println("바꾼 값: " + season[1]);


        //총합, 평균 구하기
        int[] scores = {83, 90, 87};

        int sum = 0;

        for(int i = 0; i < scores.length; i++) { //배열.length ->배열의 길이
            sum += scores[i]; //합계
        }
        double avg = (double) sum / scores.length; //평균 // 정수 연산은 정수기떄문에 sum을 double타입으로 변환시켜서 연산한것.
        System.out.println("총합: " + sum + " 평균: " + avg);


        //배열의 선언 후 값 할당 하는법

        String[] season3; //선언만함
        season3 = new String[] {"봄", "여름"}; //값 할당

        int[] arr;
        arr = new int[] {1, 3}; //값 할당

    }
}
