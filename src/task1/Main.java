package task1;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){

        //ClassAnalyzator.analyze("null");

        Student student = new Student();
        Class<?> studentClass = student.getClass();

        ClassAnalyzator.analyze(java.lang.String.class);
    }
}
