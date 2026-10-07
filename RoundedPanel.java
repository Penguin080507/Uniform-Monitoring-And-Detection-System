package StaffOperations;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import javax.swing.JPanel;

public class RoundedPanel extends JPanel {
    private int cornerRadius = 20; // radius of the curve

    public RoundedPanel(Color bgColor, int radius) {
        super();
        this.cornerRadius = radius;
        setBackground(bgColor);
        setOpaque(false); // important to paint rounded corners
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);

        Graphics2D g2 = (Graphics2D) g.create();
        g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);

        g2.setColor(getBackground());
        g2.fillRoundRect(0, 0, getWidth(), getHeight(), cornerRadius, cornerRadius);

        g2.dispose();
    }
}
