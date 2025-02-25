package PR8;
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class AnimationWindow extends JFrame {
    private int currentFrame = 0;
    private ImageIcon[] frames;
    private JLabel animationLabel;

    public AnimationWindow() {
        setTitle("Animation");
        setSize(600, 600);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        String[] framePaths = {"C:/Users/artem/Desktop/cat.jpg/", "C:/Users/artem/Desktop/cat2.jpg/","C:/Users/artem/Desktop/kitten.jpg/"};
        frames = new ImageIcon[framePaths.length];
        for (int i = 0; i < framePaths.length; i++) {
            frames[i] = new ImageIcon(framePaths[i]);
        }
        animationLabel = new JLabel();
        add(animationLabel);
        Timer timer = new Timer(1000, new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (frames != null && frames.length > 0) {
                    animationLabel.setIcon(frames[currentFrame]);
                    currentFrame = (currentFrame + 1) % frames.length;
                }
            }
        });
        timer.start();
    }
    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            AnimationWindow window = new AnimationWindow();
            window.setVisible(true);
        });
    }
}
