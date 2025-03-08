package PR20.entities;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class CalculatorController {
    private CalculatorModel model;
    private CalculatorView view;
    private double firstNumber = 0;
    private String currentOperation = null;
    private boolean startNewNumber = true;

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
            
            // Обработка числовых кнопок
            if (command.matches("[0-9.]")) {
                if (startNewNumber) {
                    view.setInputFieldText(command);
                    startNewNumber = false;
                } else {
                    view.setInputFieldText(view.getInputFieldText() + command);
                }
            } 
            // Обработка операций
            else if (command.matches("[+\\-*/]")) {
                try {
                    // Если уже есть операция, сначала выполняем её
                    if (currentOperation != null) {
                        calculateResult();
                    }
                    
                    firstNumber = Double.parseDouble(view.getInputFieldText());
                    currentOperation = command;
                    startNewNumber = true;
                } catch (NumberFormatException ex) {
                    view.setInputFieldText("Error");
                    startNewNumber = true;
                }
            } 
            // Обработка равно
            else if (command.equals("=")) {
                calculateResult();
                currentOperation = null;
                startNewNumber = true;
            } 
            // Обработка очистки
            else if (command.equals("C")) {
                view.setInputFieldText("");
                firstNumber = 0;
                currentOperation = null;
                startNewNumber = true;
                model.clearExpression();
            }
        }
        
        private void calculateResult() {
            try {
                if (currentOperation != null) {
                    double secondNumber = Double.parseDouble(view.getInputFieldText());
                    double result = 0;
                    
                    switch (currentOperation) {
                        case "+":
                            result = firstNumber + secondNumber;
                            break;
                        case "-":
                            result = firstNumber - secondNumber;
                            break;
                        case "*":
                            result = firstNumber * secondNumber;
                            break;
                        case "/":
                            if (secondNumber == 0) {
                                view.setInputFieldText("Division by zero");
                                return;
                            }
                            result = firstNumber / secondNumber;
                            break;
                    }
                    
                    view.setInputFieldText(String.valueOf(result));
                    firstNumber = result;
                }
            } catch (NumberFormatException ex) {
                view.setInputFieldText("Error");
                startNewNumber = true;
            }
        }
    }
}
