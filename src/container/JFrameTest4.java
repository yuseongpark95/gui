package container;

import java.awt.BorderLayout;

import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JColorChooser;
import javax.swing.JFrame;
import javax.swing.border.Border;

public class JFrameTest4 extends JFrame {
	
	// 컨테이너 생성하기
	public JFrameTest4() {
		setTitle("네번째 프로그램");
		setSize(700, 300);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
		
		// 컴포넌트 생성하기
		JButton btn1 = new JButton("open");
		JButton btn2 = new JButton("save");
		JCheckBox check = new JCheckBox("GUI 프로그래밍");
		JColorChooser chooser = new JColorChooser();
		
		// 컴포넌트 부착
		add(btn1, BorderLayout.EAST);
		add(btn2, BorderLayout.WEST);
		add(check, BorderLayout.NORTH);
		add(chooser, BorderLayout.CENTER);		
		
	}
	
	public static void main(String[] args) {
		// 컨테이너 생성하기
		JFrameTest4 f = new JFrameTest4();
		
		
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
