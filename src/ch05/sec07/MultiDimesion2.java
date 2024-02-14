package ch05.sec07;

public class MultiDimesion2 {
    public static void main(String[] args) {

        int[][] mathScores = new int[2][3]; // 값을 할당하진 않음. (2행 3열의 데이터가 만들어짐.)

        /*{
               {0,0,0},
               {0,0,0}
            }
        */

        //2차원 배열에 값을 할당하지 않을 경우 디폴트 값 출력
        for (int i = 0 ; i < mathScores.length; i++) {
            for (int j = 0; j < mathScores[i].length; j++) {
                System.out.println("mathScores["+ i +"][" + j + "]:" + mathScores[i][j]);
            }
        }
    }
}
