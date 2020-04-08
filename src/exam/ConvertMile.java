package exam;

import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.BorderLayout;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JButton;

public class ConvertMile extends JFrame {
	private JTextField textField;
	private JTextField textField_1;
	public ConvertMile() {
		setTitle("마일을 킬로미터로 변환");
		
		JPanel panel = new JPanel();
		getContentPane().add(panel, BorderLayout.NORTH);
		
		JLabel lblNewLabel = new JLabel("거리를 마일 단위로 입력하세요");
		panel.add(lblNewLabel);
		
		textField = new JTextField();
		panel.add(textField);
		textField.setColumns(10);
		
		JPanel panel_1 = new JPanel();
		getContentPane().add(panel_1, BorderLayout.SOUTH);
		
		textField_1 = new JTextField();
		panel_1.add(textField_1);
		textField_1.setColumns(30);
		
		JPanel panel_2 = new JPanel();
		getContentPane().add(panel_2, BorderLayout.CENTER);
		
		JButton btnNewButton = new JButton("변환");
		panel_2.add(btnNewButton);
		
		
		
		setVisible(true);
		pack();
		
	}
	public static void main(String[] args) {
		ConvertMile mile = new ConvertMile();
		
		
	}

}
