package Kg.Pound;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.DecimalFormat;

public class WeightConverter extends JFrame {

    private JTextField kgTextField;
    private JButton convertBtn;
    private JTextField poundTextField;
    private JButton clearBtn;
    private JButton exitBtn;
    private JPanel weightConverter;

    public WeightConverter(String title) {
        super(title);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setContentPane(weightConverter);
        this.pack();
        clearBtn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                // clear the text fields
                kgTextField.setText("");
                poundTextField.setText("");
            }
        });
        exitBtn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                // exit from application
                System.exit(0);
            }
        });
        convertBtn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                double kilo, convert;
                kilo = Double.parseDouble(kgTextField.getText());
                convert = kilo * 2.2046226218;
                poundTextField.setText(String.valueOf(new DecimalFormat("##.##").format(convert)));
            }
        });
    }

    public static void main(String[] args) {

        JFrame frame = new WeightConverter("Weight Conversion Tool");
        frame.setVisible(true);
        frame.setSize(500,300);
    }
}