package PR20.entities;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;

public class CalculatorView extends JPanel {
    private JTextField inputField;
    private JButton[] buttons;
    private String[] buttonLabels = {
            "7", "8", "9", "/",
            "4", "5", "6", "*",
            "1", "2", "3", "-",
            "0", ".", "=", "+",
            "C" // Добавляем кнопку для очистки строки
    };

    public CalculatorView() {
        setLayout(new BorderLayout());
        setBackground(new Color(90, 0, 90));

        inputField = new JTextField();
        inputField.setFont(new Font("Arial", Font.PLAIN, 24));
        inputField.setHorizontalAlignment(JTextField.RIGHT);
        inputField.setEditable(false);
        add(inputField, BorderLayout.NORTH);

        JPanel buttonPanel = new JPanel();
        buttonPanel.setLayout(new GridLayout(5, 4, 10, 10)); // Увеличиваем количество строк для добавления кнопки C
        buttonPanel.setBackground(new Color(90, 0, 90));
        buttons = new JButton[buttonLabels.length];

        for (int i = 0; i < buttonLabels.length; i++) {
            buttons[i] = new JButton(buttonLabels[i]);
            buttons[i].setFont(new Font("Arial", Font.PLAIN, 18));
            buttons[i].setBackground(new Color(150, 0, 150));
            buttons[i].setForeground(Color.WHITE);
            buttonPanel.add(buttons[i]);
        }

        add(buttonPanel, BorderLayout.CENTER);
    }

    public void setInputFieldText(String text) {
        inputField.setText(text);
    }

    public String getInputFieldText() {
        return inputField.getText();
    }

    public void addButtonClickListener(ActionListener listener, int index) {
        buttons[index].addActionListener(listener);
    }

    public String[] getButtonLabels() {
        return buttonLabels;
    }
}
