package task1;
import javax.swing.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Window flt = new Window();
        flt.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        flt.setVisible(true);
        ClassAnalyzator.analyze(java.lang.String.class);
        System.out.println(ClassAnalyzator.getDataField());
        //ClassAnalyzator.analyze("task1.Student");
    }
}
