package loop.ex;

public class WhileEx2 {
    public static void main(String[] args) {

        int num = 2;
//        int i = 1;
//
//        // 2=2*1 4=2*2 6=2*3 8 10 12 14 16 18 20
//
//        while (i <= 10) {
//            System.out.println(num*i);
//            i++;
//        }

        int count = 1;
        while (count <= 10) {
            System.out.println(num);
            num += 2;
            count++;
        }
    }
}
