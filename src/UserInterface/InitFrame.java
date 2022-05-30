package UserInterface;

import javax.swing.*;

public class InitFrame extends JFrame {
    public InitFrame() {
        this.setSize(800, 100);
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.add(new InitPanel());
        this.setVisible(true);
    }

}
