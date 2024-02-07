package ch02.plus.scanner;

import java.util.Scanner;

public class ScannerExamplePlus {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("nextLine()입력: ");
        String inputNextLine = scanner.nextLine();
        System.out.println(inputNextLine);

        System.out.print("next()입력: ");
        String inputNext = scanner.next();
        System.out.println(inputNext);

        System.out.print("int형 입력: ");
        int inputInt =scanner.nextInt(); //int타입으로 값을 입력받음(scanner메소드에서 타입별로 값을가져오는법. https://docs.oracle.com/en/java/javase/17/docs/api/java.base/java/util/Scanner.html#method-summary
        System.out.println(inputInt);

        System.out.print("double형 입력: ");
        double inputDouble =scanner.nextDouble();
        System.out.println(inputDouble);

        System.out.println("int + double=" + (inputInt + inputDouble));

        System.out.print("boolean형 입력: ");
        boolean inputBoolean = scanner.nextBoolean(); // boolean 타입으로 입력받음
        System.out.println(inputBoolean);
    }
}
