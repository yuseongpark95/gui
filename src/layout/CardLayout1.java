package layout;

import java.awt.CardLayout;
import java.awt.Color;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.SwingUtilities;

public class CardLayout1 extends JFrame {
	
	private JPanel contentPane;
	private JPanel redCard, blueCard, orangeCard;
	
	public CardLayout1() {
		setTitle("카드레이아웃");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(500, 500);
		contentPane = new JPanel();
		contentPane.setLayout(new CardLayout(0,0));
		
		contentPane.add("RedCard",getCard());
		contentPane.add("BlueCard",getCard());
		contentPane.add("OrangeCard",getCard());
		setContentPane(contentPane);
	}
	
	public JPanel getCard() {
		if(redCard==null) {
			redCard = new JPanel();
			redCard.setBackground(Color.cyan);
			return redCard;
		}else if(blueCard==null) {
			blueCard = new JPanel();
			blueCard.setBackground(Color.blue);
			return blueCard;
		}else {
			orangeCard = new JPanel();
			orangeCard.setBackground(Color.orange);
			return orangeCard;
		}
	}
	
	public static void main(String[] args) {
		CardLayout1 card = new CardLayout1();
		card.setVisible(true);
		Thread t = new Thread() {
			@Override
			public void run() {
				for(int i=0; i<2; i++) {
					try {
						Thread.sleep(800);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
					SwingUtilities.invokeLater(new Runnable() {
						@Override
						public void run() {
							CardLayout cardLayout = (CardLayout)card.getContentPane().getLayout();
							// 다음 카드의 패널을 보여주기
							cardLayout.next(card.getContentPane());	
						}
					});
				}
				
			}
		};
		t.start();

	}

}
