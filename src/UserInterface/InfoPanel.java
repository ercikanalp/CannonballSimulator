package UserInterface;

import Calculations.Cannonball;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;

public class InfoPanel extends JPanel {
    private ArrayList<JLabel> labels;

    public InfoPanel(Cannonball cb) {
        this.setLayout(new GridLayout(0, 5));
        labels = new ArrayList<>();
        labels.add(new JLabel("Mass: " + cb.getMass()));
        labels.add(new JLabel(("Angle: " + cb.getAngle())));
        labels.add(new JLabel("Velocity: " + cb.getSpeed()));
        labels.add(new JLabel("Location: " + cb.getX() + "," + cb.getY()));
        labels.add(new JLabel("Wind: "+ cb.getWind()));
        for (JLabel l : labels) {
            this.add(l);
        }
        this.setVisible(true);
    }
}
