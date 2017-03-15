package first_frame;

import javax.swing.*;
import java.awt.*;

/**
 * Created by anonymous on 28.02.2017.
 */
public class Main {
    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                MainFrame mainFrame = new MainFrame("Frame", new Dimension(1080, 720));
                mainFrame.init();
            }
        });
    }
}
