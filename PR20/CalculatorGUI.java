package PR20;
import PR20.entities.*;
import javax.swing.*;
import java.awt.*;

public class CalculatorGUI {
    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            CalculatorModel model = new CalculatorModel();
            CalculatorView view = new CalculatorView();
            CalculatorController controller = new CalculatorController(model, view);
            controller.initController();

            JFrame frame = new JFrame("Calculator");
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.setSize(400, 400);
            frame.getContentPane().setBackground(new Color(90, 0, 90));
            frame.add(view);

            frame.setVisible(true);
        });
    }
}
