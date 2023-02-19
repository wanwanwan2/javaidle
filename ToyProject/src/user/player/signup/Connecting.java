package user.player.signup;

import java.awt.BorderLayout;
import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Connecting extends JFrame {
	public static void main(String[] args) {

		JFrame mf = new JFrame();
		mf.setSize(800, 500);

		JPanel panel = new JPanel();
		Image icon = new ImageIcon("images/connecting.png").getImage().getScaledInstance(800, 500, 0);

		JLabel label = new JLabel(new ImageIcon(icon));

		panel.add(label);
		mf.add(label);
		mf.add(label, BorderLayout.CENTER);
		mf.setVisible(true);
		mf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}
