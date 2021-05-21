package com.company;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Display extends JFrame {
   private JButton button = new JButton("Check my Please!");
    private JTextField textField = new JTextField("Fack you check",5);
     private JLabel label = new JLabel("Write what you want");
        private JRadioButton radio1 = new JRadioButton("Bot #1");
         private JRadioButton radio2 = new JRadioButton("Bot #2");
          private JCheckBox check = new JCheckBox("Go Bro",true);

    public Display (){
        super("Test Interface");
        this.setBounds(100,100,250,100);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        Container container = this.getContentPane();
        container.setLayout(new GridLayout(3,2, 2,2));
        container.add(label);
        container.add(textField);

        ButtonGroup group = new ButtonGroup();
        group.add(radio1);
        group.add(radio2);
        container.add(radio1);
        radio1.setSelected(true);
        container.add(radio2);
        container.add(check);
        button.addActionListener( new ButtonEventListener());
        container.add(button);
    }

    class ButtonEventListener implements ActionListener {
        public void actionPerformed(ActionEvent e){
            String message = "";
            message += "Hello\n"+"Welcome "+ textField.getText()+"\n";
            message += (radio1.isSelected()? "You okey? ":"You That sleep? ")+ "okey!\n";
            message += "Bay bay "+ ((check.isSelected()) ? " Bro" : " Sister");
            JOptionPane.showMessageDialog(null,message,"Input",JOptionPane.PLAIN_MESSAGE);
        }
    }
}
