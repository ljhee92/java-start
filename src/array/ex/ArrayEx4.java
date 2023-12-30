package array.ex;

import java.util.Scanner;

public class ArrayEx4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("5개의 정수를 입력하세요: ");

        int[] integers = new int[5];
        int total = 0;
        double average = 0;

        for (int i = 0; i < integers.length; i++) {
            integers[i] = scanner.nextInt();
            total += integers[i];
        }
        average = (double) total / integers.length;

        System.out.println("입력한 정수의 합계: " + total);
        System.out.println("입력한 정수의 평균: " + average);
    }
}
