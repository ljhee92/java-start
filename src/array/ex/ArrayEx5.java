package array.ex;

import java.util.Scanner;

public class ArrayEx5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int total = 0;
        double average = 0;

        System.out.print("입력받을 숫자의 개수를 입력하세요: ");
        int input = scanner.nextInt();
        int[] integers = new int[input];

        System.out.println(input + "개의 정수를 입력하세요: ");

        for (int i = 0; i < input; i++) {
            integers[i] = scanner.nextInt();
            total += integers[i];
        }
        average = (double) total / input;

        System.out.println("입력한 정수의 합계: " + total);
        System.out.println("입력한 정수의 평균: " + average);
    }
}
