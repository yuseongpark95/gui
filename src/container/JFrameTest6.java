package container;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Toolkit;
import java.net.URL;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JColorChooser;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.Border;

public class JFrameTest6 extends JFrame {
	
	public JFrameTest6() {
		setTitle("여섯번째 프로그램");
		setSize(100, 100);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
		
		// 창을 화면 센터에 띄우기
		Toolkit kt = Toolkit.getDefaultToolkit();
		Dimension screenSize = kt.getScreenSize();
		
		int x = (screenSize.width - getWidth())/2;
		int y = (screenSize.height - getHeight())/2;
		setLocation(x, y);
		
		// 아이콘 변경
		URL url = getClass().getResource("icons8.gif");
		setIconImage(new ImageIcon(url).getImage());
	}
	
	public static void main(String[] args) {
		// 컨테이너 생성하기
		JFrameTest6 f = new JFrameTest6();
		
		
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
