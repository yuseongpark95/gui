package exam;

import java.awt.BorderLayout;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.plaf.FontUIResource;

public class RockPaperScissor extends JFrame implements ActionListener {
	
	private JTextField tf;
	
	public RockPaperScissor() {
		setTitle("가위바위보");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(500, 500);
		setVisible(true);
		
		JLabel top = new JLabel("아래의 버튼 중에서 하나를 클릭하시오.");
		top.setFont(new FontUIResource("굴림", Font.PLAIN, 16));
		getContentPane().add(top, BorderLayout.NORTH);
		
		tf = new JTextField();
		tf.setFont(new Font("굴림", Font.PLAIN, 16));
		getContentPane().add(tf, BorderLayout.SOUTH);
		tf.setColumns(10);
		
		JPanel pane = new JPanel();
		getContentPane().add(pane, BorderLayout.CENTER );
		pane.setLayout(new GridLayout(0, 3, 0, 0));
		
		JButton btnNewButton = new JButton("ROCK");
		btnNewButton.setFont(new Font("굴림", Font.BOLD, 20));
		pane.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("PAPER");
		btnNewButton_1.setFont(new Font("굴림", Font.BOLD, 20));
		pane.add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("SCISSOR");
		btnNewButton_2.setFont(new Font("굴림", Font.BOLD, 20));
		pane.add(btnNewButton_2);
	}
	
	public static void main(String[] args) {
		RockPaperScissor rps = new RockPaperScissor();

	}

	@Override
	public void actionPerformed(ActionEvent e) {
		
		
		
	}

}
