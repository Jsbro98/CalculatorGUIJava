import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

public class CalculatorGUIJava {

    public CalculatorGUIJava() {
        // button constants
        Dimension BUTTON_DIMENSION = new Dimension(75, 50);
        Font BUTTON_FONT = new Font("Courier New", Font.BOLD, 24);

        // display field styling
        displayField.setFont(new Font("Consolas", Font.PLAIN, 25));
        displayField.setComponentOrientation(ComponentOrientation.RIGHT_TO_LEFT);
        displayField.setEditable(false);
        displayField.setBorder(BorderFactory.createLineBorder(Color.BLACK));

        // panel padding
        Border padding = BorderFactory.createEmptyBorder(12, 12, 12, 12);
        panel1.setBorder(padding);


        //operation key styling
        setButtonStyle(getButtons(operationPanel), BUTTON_FONT, BUTTON_DIMENSION);
        operationPanel.setBorder(BorderFactory.createEmptyBorder(10, 0, 10, 0));

        //keypad key styling
        setButtonStyle(getButtons(keypadPanel), BUTTON_FONT, BUTTON_DIMENSION);
        keypadPanel.setBorder(BorderFactory.createEmptyBorder(10, 0, 10, 20));
        clearButton.setAlignmentX(10.0f);
        clearButton.setMargin(new Insets(10, 10, 10, 10));


        // add event listeners to all buttons except clear and equals, to update displayField
        ArrayList<JButton> buttonLists = new ArrayList<>( getButtons(keypadPanel) );
        buttonLists.addAll( getButtons(operationPanel) );

        buttonLists.forEach(button -> {
            if (button != clearButton && button != equalsButton) {
                button.addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent actionEvent) {
                        String text = displayField.getText();
                        displayField.setText(text + button.getText());
                    }
                });
            }
        });

        clearButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                displayField.setText("");
            }
        });
    }

    // helper function for styling buttons
    public static void setButtonStyle(ArrayList<JButton> buttons, Font font, Dimension dimension) {
        buttons.stream().filter(button -> !button.getText().equals("Clear")).forEach(button -> {
            button.setFont(font);
            button.setPreferredSize(dimension);
            button.setMaximumSize(dimension);
            button.setMinimumSize(dimension);
        });
    }

    public static ArrayList<JButton> getButtons(JPanel panel) {
        ArrayList<JButton> buttons = new ArrayList<>();
        Component[] components = panel.getComponents();

        for (Component component : components) {
            if (component instanceof JButton) {
                buttons.add((JButton) component);
            }
        }

        return buttons;
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("CalculatorGUIJava");
        frame.setContentPane(new CalculatorGUIJava().panel1);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(new Dimension(400, 445));
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
    private JTextArea displayField;
    private JPanel operationPanel;
    private JPanel displayPanel;
    private JPanel keypadPanel;
    private JButton clearButton;
}
