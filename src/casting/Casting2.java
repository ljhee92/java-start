package casting;

public class Casting2 {
    public static void main(String[] args) {
        double doubleValue = 1.5;
        int intValue = 0;

        //intValue = doubleValue; // 컴파일 오류 발생, 오버플로우

        intValue = (int) doubleValue;   // 형변환
        System.out.println(intValue);
        System.out.println("doubleValue = " + doubleValue);     // 형변환을 하더라도 그 값 자체는 변하지 않음
    }
}
