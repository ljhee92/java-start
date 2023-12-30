package array.ex;

public class ArrayEx1 {
    public static void main(String[] args) {

        int[] students = {90, 80, 70, 60, 50};

        int total = 0;
        for (int student : students) {
            total += student;
        }
        // int total = students[0] + students[1] + students[2] + students[3] + students[4];

        double average = (double) total / students.length;
        System.out.println("점수 총합: " + total);
        System.out.println("점수 평균: " + average); }
}
