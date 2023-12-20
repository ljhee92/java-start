package scope;

public class Scope3_1 {
    public static void main(String[] args) {
        int m = 10;
        int temp = 0;       // temp는 if 코드 블럭 안에서만 사용하는데 main에서 선언한다면 메모리를 비효율적으로 사용함.
        if (m > 0) {
            temp = m * 2;
            System.out.println("temp = " + temp);
        }
        System.out.println("m = " + m);
    }
}
