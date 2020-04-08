package event;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import javax.swing.JLabel;

public class MyFrame3 extends JFrame implements ActionListener{
	
	private JPanel contentPane;
	private JLabel label;
	private JButton btn1;

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MyFrame3 frame = new MyFrame3();
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
	public MyFrame3() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		
		JPanel panel = new JPanel();
		contentPane.add(panel, BorderLayout.NORTH);
		
		btn1 = new JButton("버튼을 누르세요");
		panel.add(btn1);
		//버튼과 리스너를 연동하는 부분
		btn1.addActionListener(this);
		
		label = new JLabel("New label");
		panel.add(label);
	}//main 종료

	@Override
	public void actionPerformed(ActionEvent e) {
		// button 글자 변경
		btn1.setText("버튼을 또 눌렀니?");
		// lable 글자 변경
		label.setText("버튼 눌러짐");
	}
}













