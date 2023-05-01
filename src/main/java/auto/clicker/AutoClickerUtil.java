package auto.clicker;

import javax.swing.*;
import java.awt.*;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Random;

public class AutoClickerUtil {
    public static void clickerWindow(int amount) throws MalformedURLException {
        Random random = new Random();

        for (int i = 1; i <= amount; i++) {
            boolean useTrollUrl = random.nextBoolean();
            URL imageUrl = useTrollUrl ? new URL("https://chroma.bigrat.monster/media/bigrat-static.png") : new URL("https://upload.wikimedia.org/wikipedia/en/thumb/9/9a/Trollface_non-free.png/220px-Trollface_non-free.png");
            ImageIcon imageIcon = new ImageIcon(imageUrl);
            JLabel label = new JLabel(imageIcon);

            JFrame cpsWindow = new JFrame();
            cpsWindow.setUndecorated(true);
            cpsWindow.getContentPane().add(label);
            cpsWindow.pack();

            Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
            int x = random.nextInt(screenSize.width - cpsWindow.getWidth());
            int y = random.nextInt(screenSize.height - cpsWindow.getHeight());
            cpsWindow.setLocation(x, y);

            cpsWindow.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // im not that evil yet (:
            cpsWindow.setVisible(true);
        }
    }
}