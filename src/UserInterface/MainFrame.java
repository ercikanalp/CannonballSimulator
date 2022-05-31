package UserInterface;

import Calculations.Cannonball;
import Calculations.Tower;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;

public class MainFrame extends JFrame {
    public MainFrame(Cannonball cannon, Tower tower) {
        this.setSize(800, 800);
        this.setLayout(new BorderLayout());
        this.add(new InfoPanel(cannon), BorderLayout.NORTH);
        this.add(new MainPanel(cannon, tower), BorderLayout.CENTER);
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setVisible(true);
    }
}
