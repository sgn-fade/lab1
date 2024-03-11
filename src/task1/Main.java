package task1;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        System.out.println("enter path: ");

        Scanner in = new Scanner(System.in);

        ClassAnalyzator.analyze("null");

        Student student = new Student();
        Class studentClass = student.getClass();

        ClassAnalyzator.analyze(studentClass);
    }
}
