package PR20.entities;
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CalculatorController {
    private CalculatorModel model;
    private CalculatorView view;

    public CalculatorController(CalculatorModel model, CalculatorView view) {
        this.model = model;
        this.view = view;
    }
    public void initController() {
        String[] buttonLabels = view.getButtonLabels();
        for (int i = 0; i < buttonLabels.length; i++) {
            view.addButtonClickListener(new ButtonClickListener(), i);
        }
    }
    private class ButtonClickListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            String command = ((JButton) e.getSource()).getText();
            if (command.equals("=")) {
                String expression = view.getInputFieldText();
                model.appendExpression(expression);
                double result = model.evaluateExpression();
                view.setInputFieldText(Double.toString(result));
                model.clearExpression();
            } else if (command.equals("C")) { // Обрабатываем очистку строки
                view.setInputFieldText("");
                model.clearExpression();
            } else {
                view.setInputFieldText(view.getInputFieldText() + " " + command);
            }
        }
    }
}
