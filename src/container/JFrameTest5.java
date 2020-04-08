package container;

import java.awt.BorderLayout;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JColorChooser;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.Border;

public class JFrameTest5 extends JFrame {
	
	public JFrameTest5() {
		setTitle("다섯번째 프로그램");
		setBounds(500, 500, 700, 300);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
		
		// 컴포넌트 생성하기
		JPanel panel = new JPanel();
		panel.setLayout(new FlowLayout());
		
		JButton btn1 = new JButton("open");
		JButton btn2 = new JButton("save");
		JCheckBox check = new JCheckBox("GUI 프로그래밍");
		JColorChooser chooser = new JColorChooser();
		
		// 컴포넌트 부착 - JPanel
		panel.add(btn1);
		panel.add(btn2);
		panel.add(check);
		panel.add(chooser);
		
		// JPanel을 frame에 부착.
		add(panel);
	}
	
	public static void main(String[] args) {
		// 컨테이너 생성하기
		JFrameTest5 f = new JFrameTest5();
		
		
		/*
		// 컨테이너 생성하기
		JFrame f = new JFrame("첫번째 프로그램");
		// x를 누르면 프로그램 종료
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		// 컨테이너 크기 지정하기
		f.setSize(300, 300);
		// 컨테이너 보여주기
		f.setVisible(true);
		*/

	}
}
