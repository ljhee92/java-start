package loop.ex;

public class ForEx2 {
    public static void main(String[] args) {

        int num = 2;

//        for (int i = 1; i <= 10; i++) {
//            System.out.println(num * i);
//        }

        for (int count = 1; count <= 10; count++) {
            System.out.println(num);
            num += 2;
        }
    }
}
