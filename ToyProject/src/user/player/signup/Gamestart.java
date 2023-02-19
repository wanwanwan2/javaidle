package user.player.signup;

import java.awt.CardLayout;
import java.awt.Color;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Gamestart extends JFrame {
	
	public Gamestart() {
		super("CardLayout");
		
		this.setBounds(0, 0, 800, 500);
		
		CardLayout card = new CardLayout();
		this.setLayout(card);
		
		JPanel card1 = new JPanel();
		JPanel card2 = new JPanel();

		
		card1.setBackground("images/start.png");
		card2.setBackground(Color.YELLOW);    
		
		
		card1.add(new JLabel("Card1"));
		card2.add(new JLabel("Card2"));
		
		this.add(card1);
		this.add(card2);
		
		/* 패널에 이벤트 추가 */
		card1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				if(e.getButton() == 1) {
					card.next(card1.getParent());
				}
				if(e.getButton() == 3) {
					card.previous(card1.getParent());
				}
			}
		});
		
		card2.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				if(e.getButton() == 1) {
					card.next(card2.getParent());
				}
				if(e.getButton() == 3) {
					card.previous(card2.getParent());
				}
			}
		});
		
		this.setVisible(true);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

	private Object ImageIcon(String string) {
		// TODO Auto-generated method stub
		return null;
	}
}
