package tw.org.iii.tutor;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.Random;

public class 抽籤 {
    private static void createAndShowGUI() {
      JFrame demo = new JFrame("Layout Demo");

      demo.setSize(300, 250);
      demo.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      demo.getContentPane().setLayout(new FlowLayout(FlowLayout.LEFT));
  
  JTextField num1 = new JTextField(10);
  JLabel to = new JLabel("to");
  JTextField num2 = new JTextField(10);
  JButton submit = new JButton("submit");
  
  JTextArea outputTextArea = new JTextArea("",5,20);
  
  demo.add(num1);
  demo.add(to);
  demo.add(num2);
  demo.add(submit);
  demo.add(outputTextArea);
  
  submit.addActionListener(new ActionListener(){
   @Override
   public void actionPerformed(ActionEvent e) {
    int n1 = Integer.parseInt(num1.getText());
    int n2 = Integer.parseInt(num2.getText());

    int i=(int)((Math.random()*(n2-n1))+n1+1);
    
    outputTextArea.insert("恭喜" + String.valueOf(i) + "中獎!!\n", 0);
   }
  });
demo.setVisible(true);
    }
public static void main(String[] args) {
        javax.swing.SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                createAndShowGUI();
            }
        });
    }
}