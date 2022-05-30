package UserInterface;

import Calculations.Cannonball;

import javax.swing.*;
import java.awt.*;

public class MainFrame extends JFrame {
    public MainFrame(Cannonball cannon) {
        this.setSize(800, 800);
        this.setLayout(new BorderLayout());
        this.add(new InfoPanel(cannon), BorderLayout.NORTH);
        this.add(new MainPanel(cannon), BorderLayout.CENTER);
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setVisible(true);
    }
}
