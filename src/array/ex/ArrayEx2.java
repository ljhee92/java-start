package array.ex;

import java.util.Scanner;

public class ArrayEx2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("5개의 정수를 입력하세요:");
        int[] integers = new int[5];

        for (int i = 0; i < integers.length; i++) {
            integers[i] = scanner.nextInt();
        }

        System.out.println("출력");
        for (int i = 0; i < integers.length; i++) {
            System.out.print(integers[i]);
            if (i < integers.length - 1) {
                System.out.print(", ");
            }
        }
    }
}
