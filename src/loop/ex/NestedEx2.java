package loop.ex;

public class NestedEx2 {
    public static void main(String[] args) {

        int rows = 5;

        // 1*1 1*2
        // 2*1 2*2

//        for (int i = 1; i <= rows; i++) {
//            for (int j = 1; j <= rows; j++) {
//                if (i >= j) {
//                    System.out.print("*");
//                }
//            }
//            System.out.println();
//        }

        for (int i = 1; i <= rows; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
