package array.ex;

import java.util.Scanner;

public class ArrayEx6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("입력받을 숫자의 개수를 입력하세요: ");
        int input = scanner.nextInt();

        System.out.println(input + "개의 정수를 입력하세요: ");
        int[] integers = new int[input];
        for (int i = 0; i < input; i++) {
            integers[i] = scanner.nextInt();
        }

        int min = integers[0], max = integers[0];

        for (int i = 0; i < input; i++) {
            if (integers[i] < min) {
                min = integers[i];
            } else if (integers[i] > max) {
                max = integers[i];
            }
        }

        System.out.println("가장 작은 정수: " + min);
        System.out.println("가장 큰 정수: " + max);
    }
}
