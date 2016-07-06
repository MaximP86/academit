import javax.swing.*;
import java.awt.*;

/**
 * Created by 1 on 06.07.2016.
 */
public class Main {
    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                JFrame frame = new JFrame("Temperature Converter");
                frame.setSize(300, 200);
                frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                frame.setVisible(true);
                JButton button = new JButton("Convert");
                frame.add(button);
            }
        });
    }
}
