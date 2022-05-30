package UserInterface;

import Calculations.Cannonball;
import Calculations.Location;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;

public class MainPanel extends JPanel {
    private Cannonball cb;

    public MainPanel(Cannonball cb) {
        this.setVisible(true);
        this.setBackground(new Color(86, 203, 241));
        this.cb = cb;

    }

    public void paint(Graphics g) {
        cb.launch();
        ArrayList<Location> locations = cb.getLocations();
        for (int i = 0; i < locations.size(); i++) {
            g.fillOval((int) locations.get(i).getX(), 500 - (int) locations.get(i).getY(), 30, 30);
            g.setColor(Color.black);
        }
    }

}
