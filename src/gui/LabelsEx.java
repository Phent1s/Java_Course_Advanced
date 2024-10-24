package gui;

import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;

public class LabelsEx {

    public static void main(String[] args) {

        JLabel label = new JLabel();
        Border border = BorderFactory.createLineBorder(Color.GREEN,3);
        ImageIcon icon = new ImageIcon("Altifon_avatar.png");
        label.setText("Hello Java!");
        label.setIcon(icon);
        label.setHorizontalTextPosition(JLabel.RIGHT);
        label.setVerticalTextPosition(JLabel.TOP);
        label.setForeground(Color.BLUE);
        label.setFont(new Font("MV Boli", Font.PLAIN, 20));
        label.setIconTextGap(100);
        label.setBackground(Color.BLACK);
        label.setOpaque(true);
        label.setBorder(border);
        label.setVerticalAlignment(JLabel.CENTER);
        label.setHorizontalAlignment(JLabel.CENTER);
//        label.setBounds(100,100,350,350);



        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//        frame.setSize(500, 500);
        frame.add(label);
//        frame.setLayout(null);
        frame.setVisible(true);
        frame.pack();
    }
}
