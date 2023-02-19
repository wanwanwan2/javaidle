package user.player.signup;

import java.awt.BorderLayout;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;


public class SignUpPage extends JFrame{
   public static void main(String[] args) {
      
      JFrame mf = new JFrame("이미지 라벨 테스트");

      mf.setSize(800, 500);

      JPanel panel = new JPanel();

      Image icon = new ImageIcon("images/LoginBackground.PNG").getImage().getScaledInstance(800, 500, 0);

      JLabel label = new JLabel(new ImageIcon(icon));

      
      panel.add(label);


      mf.add(label, BorderLayout.CENTER);

      mf.setVisible(true);
      mf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);


   }
}
