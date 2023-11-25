import javax.swing.*;
import java.awt.*;

public class CalculatorGUIJava {
    public static void main(String[] args) {
        JFrame frame = new JFrame("CalculatorGUIJava");
        frame.setContentPane(new CalculatorGUIJava().panel1);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//        frame.pack();
        frame.setSize(new Dimension(300, 300));
        frame.setVisible(true);
    }

    private JButton a9Button;
    private JPanel panel1;
    private JButton a1Button;
    private JButton a8Button;
    private JButton a4Button;
    private JButton a5Button;
    private JButton a3Button;
    private JButton a6Button;
    private JButton a2Button;
    private JButton a7Button;
    private JButton a0Button;
}
