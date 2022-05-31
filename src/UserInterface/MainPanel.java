package UserInterface;

import Calculations.Cannonball;
import Calculations.Location;
import Calculations.Tower;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;

public class MainPanel extends JPanel {
    private Cannonball cb;
    private Tower tower;

    public MainPanel(Cannonball cb, Tower tower) {
        this.tower = tower;
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
        g.fillRect(600 - (int) tower.getLocation().getX(), 600 - (int) tower.getLocation().getY(), 50, (int) tower.getHeight());
    }

}
