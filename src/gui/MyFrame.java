package gui;

import javax.swing.*;
import java.awt.*;

public class MyFrame extends JFrame {



    public MyFrame() throws HeadlessException {
        this.setTitle("JFrame EX!");
        this.setSize(420,420);
        this.setVisible(true);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setResizable(false);
    ImageIcon icon = new ImageIcon("Altifon_avatar.png");
        this.setIconImage(icon.getImage());
        this.getContentPane().setBackground(Color.BLACK);
    }
}
