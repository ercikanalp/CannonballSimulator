package UserInterface;

import Calculations.Cannonball;
import Calculations.Location;
import Calculations.Tower;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;

public class InitPanel extends JPanel {
    private JButton button;
    private JPanel fieldPanel;
    private ArrayList<JTextField> fields;

    public InitPanel() {
        this.setLayout(new BorderLayout());
        button = new JButton("Initialize");

        fieldPanel = new JPanel();
        fieldPanel.setLayout(new GridLayout(1, 9));
        fields = new ArrayList<>();
        fields.add(new JTextField("Mass"));
        fields.add(new JTextField("Angle"));
        fields.add(new JTextField("Speed"));
        fields.add(new JTextField("X Location"));
        fields.add(new JTextField("Y Location"));
        fields.add(new JTextField("Wind"));
        fields.add(new JTextField("Tower X Coord"));
        fields.add(new JTextField("Tower Y Coord"));
        fields.add(new JTextField("Tower Height"));
        for (JTextField f : fields) {
            fieldPanel.add(f);
        }

        button.addActionListener(e -> {
            int mass = Integer.parseInt(fields.get(0).getText());
            double angle = Double.parseDouble(fields.get(1).getText());
            double speed = Double.parseDouble(fields.get(2).getText());
            int x = Integer.parseInt(fields.get(3).getText());
            int y = Integer.parseInt(fields.get(4).getText());
            double wind = Double.parseDouble(fields.get(5).getText());
            Cannonball cb = new Cannonball(x, y, mass, angle, speed, wind);
            Location towerL = new Location(Double.parseDouble(fields.get(6).getText()),Double.parseDouble(fields.get(7).getText()));
            double height = Double.parseDouble(fields.get(8).getText());
            Tower tower = new Tower(towerL, height);
            new MainFrame(cb, tower);
        });

        this.add(fieldPanel, BorderLayout.CENTER);
        this.add(button, BorderLayout.SOUTH);
    }
}
