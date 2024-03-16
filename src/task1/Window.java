package task1;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import static java.lang.System.exit;

public class Window extends JFrame {
    JTextField textField = new JTextField(20);
    JTextArea textArea = new JTextArea();

    public Window() {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(100, 100, 800, 600);
        add(textField);
        add(textArea);
        textArea.setEditable(false);
        setLayout(new BorderLayout());

        JButton Analyse = new JButton("Аналіз");
        JButton Clear = new JButton("Очистити");
        JButton Shutdown = new JButton("Завершити");
        Analyse.addActionListener(e -> {
            ClassAnalyzator.analyze(textField.getText());
            textArea.append(ClassAnalyzator.getDataField());
        });

        Clear.addActionListener(e -> {
            textField.setText("");
            textArea.setText("");
        });
        Shutdown.addActionListener(e -> {
            exit(0);
        });
        JPanel southPanel = new JPanel();

        southPanel.setLayout(new FlowLayout());
        southPanel.add(Analyse);
        southPanel.add(Clear);
        southPanel.add(Shutdown);
        add(southPanel, BorderLayout.SOUTH);
        add(textField, BorderLayout.NORTH);
        add(new JScrollPane(textArea), BorderLayout.CENTER);
    }
}
