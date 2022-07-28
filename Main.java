//PROJECT FINISHED

import javax.swing.*;
import javax.swing.plaf.ColorUIResource;
import javax.swing.UIManager;
import java.awt.*;

public class Main {

    public static void main(String[] args) {

        UIManager UI=new UIManager();

        int distance;
        int time;

        //this code adds color and set size of the GUI
        UI.put("OptionPane.background", new ColorUIResource(255, 255, 255));
        UI.put("Panel.background",new ColorUIResource(202, 255, 108));

        UIManager.put("OptionPane.minimumsize", new Dimension(100,75));

        //all wrapped in while loop to keep asking until program terminates

        while(true){
            while (true) {
                String str = JOptionPane.showInputDialog("Distance (kilometers): ");
                distance = Integer.parseInt(str);
                if (distance >= 1)
                    break;
            }
            while (true) {
                String str = JOptionPane.showInputDialog("Time (Hours): ");
                time = Integer.parseInt(str);
                if (time >= 1)
                    break;
            }
            int speed = (distance / time);
            JOptionPane.showMessageDialog(null, "Impressive! Your speed was approx: " + speed + "km/h", "Result", 1);
        }
    }
}
//PROJECT FINISHED