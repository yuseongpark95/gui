package container;

import javax.swing.JFrame;

public class JFrameTest3 extends JFrame {
	
	public JFrameTest3() {
		setTitle("세번째 프로그램");
		setSize(300, 300);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
	}
	
	public static void main(String[] args) {
		
		JFrameTest3 f = new JFrameTest3();
		
		
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
