package StaffOperations;

import java.awt.Color;
import java.awt.Dimension;
import static java.awt.Component.CENTER_ALIGNMENT;
import javax.swing.Box;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class createcard {

    public static JPanel createCard(String title, String value, Color bgColor) {
        RoundedPanel panel = new RoundedPanel(bgColor, 20); // 20px corner radius
        panel.setLayout(new javax.swing.BoxLayout(panel, javax.swing.BoxLayout.Y_AXIS));

        // SET CUSTOM SIZE HERE
        panel.setPreferredSize(new Dimension(300, 150)); // width=300, height=150

        JLabel titleLabel = new JLabel(title);
        titleLabel.setForeground(Color.WHITE);
        titleLabel.setFont(new java.awt.Font("Times New Roman", java.awt.Font.BOLD, 16));
        titleLabel.setAlignmentX(CENTER_ALIGNMENT);

        JLabel valueLabel = new JLabel(value);
        valueLabel.setForeground(Color.WHITE);
        valueLabel.setFont(new java.awt.Font("Times New Roman", java.awt.Font.BOLD, 28));
        valueLabel.setAlignmentX(CENTER_ALIGNMENT);

        panel.add(Box.createVerticalStrut(20));
        panel.add(titleLabel);
        panel.add(Box.createVerticalStrut(15));
        panel.add(valueLabel);
        panel.add(Box.createVerticalStrut(20));

        return panel;
    }
}
