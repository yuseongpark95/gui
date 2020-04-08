package event;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Frame;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class MyFrame6 extends JFrame implements ActionListener {

	private JPanel contentPane;
	private JButton btnYellow, btnRed;
	private JPanel panel;
	private JButton btnClose;
	
	

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MyFrame6 frame = new MyFrame6();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public MyFrame6() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		
		panel = new JPanel();
		panel.setBackground(new Color(135, 206, 235));
		contentPane.add(panel, BorderLayout.NORTH);
		
		btnYellow = new JButton("노랑");
		btnYellow.addActionListener(this);			
		panel.add(btnYellow);
		
		btnRed = new JButton("빨강");
		btnRed.addActionListener(this);	
		panel.add(btnRed);
		
		btnClose = new JButton("닫기");
		btnClose.setBackground(new Color(255, 0, 0));
		btnClose.addActionListener(this);
		panel.add(btnClose);
	}

	@Override
	public void actionPerformed(ActionEvent e) {

		// btnYellow or btnRed
		if(e.getSource() == btnYellow) {			
			contentPane.setBackground(Color.YELLOW);
			panel.setBackground(new Color(135, 206, 235));		
		}else if(e.getSource() == btnRed) {	
			contentPane.setBackground(Color.RED);
			panel.setBackground(Color.BLUE);
		}else  {
			System.exit(0);
		}
	}

}
