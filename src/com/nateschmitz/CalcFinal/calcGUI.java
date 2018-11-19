package com.nateschmitz.CalcFinal;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class calcGUI {
    private JButton buttomMSG;
    private JPanel panelmain;
    private JButton a1Button;
    private JButton a4Button;
    private JButton a3Button;
    private JButton a2Button;
    private JProgressBar progressBar1;
    private JButton a5Button;
    private JButton a6Button;
    private JButton a7Button;
    private JButton a8Button;
    private JButton a9Button;
    boolean butt[] = {false,false,false,false};
    int progressVal;

    public calcGUI() {
        a1Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                progressVal += 25;
                butt[0] = true;
                progressBar1.setValue(progressVal);
                //JOptionPane.showMessageDialog(null, "You clicked button 1", "Listener", JOptionPane.PLAIN_MESSAGE);


            }
        });
        a2Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                progressVal += 25;
                progressBar1.setValue(progressVal);
                butt[1] = true;
                //JOptionPane.showMessageDialog(null, "You clicked button 2","Listener", JOptionPane.PLAIN_MESSAGE);
            }
        });
        a3Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                progressVal += 25;
                progressBar1.setValue(progressVal);
                butt[2] = true;
                //JOptionPane.showMessageDialog(null, "You clicked button 3", "Listener", JOptionPane.PLAIN_MESSAGE);
            }
        });
        a4Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                progressVal += 25;
                progressBar1.setValue(progressVal);
                butt[3] = true;
                //JOptionPane.showMessageDialog(null, "You clicked button 4", "Listener", JOptionPane.PLAIN_MESSAGE);
            }
        });
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("App");
        frame.setContentPane(new calcGUI().panelmain);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }
}
