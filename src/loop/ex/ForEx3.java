package loop.ex;

public class ForEx3 {
    public static void main(String[] args) {

        // 1, 1+2=3, 1+2+3=6, 1+2+3+4+5=11, ...

        int max = 100;
        int sum = 0;

        for (int i = 1; i <= max; i++) {
            sum = sum + i;
        }
        System.out.println(sum);
    }
}
