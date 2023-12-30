package array.ex;

import java.util.Scanner;

public class ArrayEx3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] integers = new int[5];
        System.out.println("5개의 정수를 입력하세요: ");

        for (int i = 0; i < integers.length; i++) {
            integers[i] = scanner.nextInt();
        }

        System.out.println("입력한 정수를 역순으로 출력: ");
        for (int i = 0; i < integers.length; i++) {
            System.out.print(integers[4-i]);
            if (i < integers.length - 1) {
                System.out.print(", ");
            }
        }
    }
}
