package scanner.ex2;

import java.util.Scanner;

public class ScannerWhileEx3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
//
//        int sum = 0;
//        double average = 0;
//        int cnt = 0;
//
//        System.out.println("숫자를 입력하세요. 입력을 중단하려면 -1을 입력하세요: ");
//        while (true) {
//            int num = scanner.nextInt();
//            cnt++;
//            sum = sum + num;
//            average = (double) (sum+1) / (cnt-1);
//
//            if (num == -1) {
//                sum = sum +1;
//                System.out.println("입력한 숫자들의 합계: " + sum);
//                System.out.println("입력한 숫자들의 평균: " + average);
//                break;
//            }
//        }

        int input = 0;이
        int sum = 0;
        int cnt = 0;

        System.out.println("숫자를 입력하세요. 입력을 중단하려면 -1을 입력하세요: ");

        while (true) {
            input = scanner.nextInt();
            if (input == -1) {
                break;
            }
            sum += input;
            cnt++;
        }

            double average = (double) sum / cnt;
            System.out.println("입력한 숫자들의 합계: " + sum);
            System.out.println("입력한 숫자들의 평균: " + average);

    }
}
