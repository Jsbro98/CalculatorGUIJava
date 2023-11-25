import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;
import java.util.ArrayList;

public class CalculatorGUIJava {

    public CalculatorGUIJava() {
        // display field styling
        displayField.setFont(new Font("serif", Font.PLAIN, 25));
        displayField.setHorizontalAlignment(JTextField.TRAILING);

        // panel padding
        Border padding = BorderFactory.createEmptyBorder(10, 10, 10, 10);
        panel1.setBorder(padding);

        //operation key styling
        ArrayList<JButton> buttons = new ArrayList<>();
        Component[] components = operationPanel.getComponents();

        for (Component component : components) {
            if (component instanceof JButton) {
                buttons.add((JButton) component);
            }
        }

        buttons.forEach(button -> {
            button.setPreferredSize(new Dimension(75, 50));
            button.setMaximumSize(new Dimension(75, 50));
            button.setMinimumSize(new Dimension(75, 50));
        });

    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("CalculatorGUIJava");
        frame.setContentPane(new CalculatorGUIJava().panel1);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(new Dimension(375, 375));
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
    private JButton plusButton;
    private JButton divideButton;
    private JButton minusButton;
    private JButton multiplyButton;
    private JButton equalsButton;
    private JTextField displayField;
    private JPanel operationPanel;
    private JPanel displayPanel;
    private JPanel keypadPanel;
}
