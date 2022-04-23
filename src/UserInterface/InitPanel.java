package UserInterface;

import Calculations.Cannonball;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;

public class InitPanel extends JPanel
{
    private JButton button;
    private JPanel fieldPanel;
    private ArrayList<JTextField> fields;
    public InitPanel()
    {
        this.setLayout(new BorderLayout());
        button = new JButton("Initialize");

        fieldPanel = new JPanel();
        fieldPanel.setLayout(new GridLayout(1,3));
        fields = new ArrayList<>();
        fields.add(new JTextField("Mass"));
        fields.add(new JTextField("Angle"));
        fields.add(new JTextField("Speed"));
        for(JTextField f : fields)
        {
            fieldPanel.add(f);
        }

        button.addActionListener( e-> {
            int mass = Integer.parseInt(fields.get(0).getText());
            double angle = Double.parseDouble(fields.get(1).getText());
            double speed = Double.parseDouble(fields.get(2).getText());
            Cannonball cb = new Cannonball(mass, angle, speed);
            new MainFrame(cb);
        });

        this.add(fieldPanel,BorderLayout.CENTER);
        this.add(button,BorderLayout.SOUTH);
    }
}
