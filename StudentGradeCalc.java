package javaDSA;
import java.util.Scanner;
public class StudentGradeCalc {
    public static void main(String[] args) {

        Scanner kb=new Scanner(System.in);
        System.out.println("enter no of subjects:");
        int sub=kb.nextInt();

        int [] marks = new int[sub];
        while(true) {

            for (int i = 0; i < sub; i++) {
                System.out.println("enter marks of subject" + (i + 1) + "(out of 100):");
                marks[i] = kb.nextInt();
            }
            int total_marks = 0;
            for (int i = 0; i < sub; i++) {
                total_marks = total_marks + marks[i];
            }
            double avg_per = total_marks / (double) sub;

            String grade;
            if (avg_per >= 90) {
                grade = "A";
            } else if (avg_per >= 80) {
                grade = "B";
            } else if (avg_per >= 70) {
                grade = "C";
            } else if (avg_per >= 60) {
                grade = "D";
            } else {
                grade = "F";
            }


            System.out.println("total marks: " + total_marks);
            System.out.println("average percentage: " + avg_per + "%");
            System.out.println("grade: "+grade);
            System.out.println("............................................................");

        }
    }
}
