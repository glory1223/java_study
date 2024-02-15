package ch05.sec04;

public class NullPointer {
    public static void main(String[] args) {
        int[] intArray = null;
        String str = null;

        // intArray[0] = 10; Nullpointer오류
        System.out.println(str.length()); //Nullpointer

    }
}
