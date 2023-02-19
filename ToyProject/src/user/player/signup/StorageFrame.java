package user.player.signup;

import java.awt.Font;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;


public class StorageFrame extends JFrame {

	   private JFrame myPage;

	   public StorageFrame() {
	      Font labelFont = new Font("DungGeunMo", Font.PLAIN, 25);

	      this.myPage = this;
	      myPage.setSize(800, 500);
	      myPage.setLocationRelativeTo(null);
	      myPage.setResizable(false);

	      JPanel panel = new JPanel();

	      panel.setLayout(null);

	      int btnW = 220;
	      int btnH = 60;
	      int btnX = 400 - btnW / 2;
	      int btnY = 190;

	      ImageIcon backgrond = new ImageIcon("imges/storage.png");
	      Image img = new ImageIcon("imges/buttonFrame.png").getImage().getScaledInstance(btnW, btnH, 0);

	      // 배경
	      JLabel background = new JLabel(backgrond);
	      background.setSize(800, 500);
	      background.setLocation(0, 0);

	      // 재료 라벨
	      JLabel ingreLabel = new JLabel();
	      ingreLabel.setIcon(new ImageIcon(img));
	      ingreLabel.setSize(btnW, btnH);
	      ingreLabel.setLocation(btnX, btnY);

	      JButton ingreBtn = new JButton("로그인"); // 재료확인
	      ingreBtn.setBorderPainted(false);
	      ingreBtn.setContentAreaFilled(false);
	      ingreBtn.setFocusPainted(false);
	      ingreBtn.setFont(labelFont);
	      ingreBtn.setSize(btnW, btnH);
	      ingreBtn.setLocation(btnX, btnY);

	      // 레시피 라벨
	      JLabel recipeLabel = new JLabel();
	      recipeLabel.setIcon(new ImageIcon(img));
	      recipeLabel.setSize(btnW, btnH);
	      recipeLabel.setLocation(btnX, btnY + 150);

	      JButton recipeBtn = new JButton("레시피 확인");
	      recipeBtn.setBorderPainted(false); 
	      recipeBtn.setContentAreaFilled(false); // 버튼 투명
	      recipeBtn.setFocusPainted(false);
	      recipeBtn.setFont(labelFont);
	      recipeBtn.setSize(btnW, btnH);
	      recipeBtn.setLocation(btnX, btnY + 150);

	      ingreBtn.addActionListener(new ActionListener() {

	         @Override
	         public void actionPerformed(ActionEvent e) {
	            myPage.dispose();
	            new LoginPage();
	         }
	      });

	      // 패녈에 추가
	      panel.add(ingreBtn);
	      panel.add(recipeBtn);
	      panel.add(ingreLabel);
	      panel.add(recipeLabel);
	      panel.add(background);

	      myPage.add(panel);

	      myPage.setVisible(true);
	      myPage.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	   }

	}