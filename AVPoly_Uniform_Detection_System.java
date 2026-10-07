
package avpoly_uniform_detection_system;

import java.awt.Dimension;
import java.awt.Toolkit;

public class AVPoly_Uniform_Detection_System {

    public static void main(String[] args) {
        LoginFrame s = new LoginFrame();
        Dimension d = Toolkit.getDefaultToolkit().getScreenSize();
        s.setVisible(true);
        s.setSize(d);
    }
    
}
