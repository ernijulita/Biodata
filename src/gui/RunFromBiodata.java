package gui;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
//import javax.swing.ImageIcon;

public class RunFromBiodata {
    public static void main(String[] args) {
        JFrame jFrame = new JFrame("Biodata Mahasiswa");
        jFrame.setContentPane(new FromBiodata().getRoolPanel());
        jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jFrame.setLocationRelativeTo(null);
        jFrame.setSize(500, 400);
        jFrame.setVisible(true);
       // ImageIcon image = new ImageIcon("");
        //jFrame.setIconImage(image.getImage());



    }
}