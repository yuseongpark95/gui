package layout;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.Panel;
import java.awt.Toolkit;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.Border;

public class BorderLayoutTest1 extends JFrame {	
		public BorderLayoutTest1() {
			// 타이틀 지정
			setTitle("BorderLayout");
			
			// 크기 지정
			setSize(500, 500);
			
			// 프로그램 종료
			setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			
			// 화면에 보이기
			setVisible(true);
			
			// Jpanel 생성
			JPanel contentPane = new JPanel();
			// layout 지정
			contentPane.setLayout(new BorderLayout());
			
			// 버튼 컴포넌트 생성
			JButton btn1 = new JButton("버튼1");
			JButton btn2 = new JButton("버튼2");
			JButton btn3 = new JButton("버튼3");
			JButton btn4 = new JButton("버튼4");
			JButton btn5 = new JButton("버튼5");
			
			// 패널에 버튼 부착
			contentPane.add(btn1, BorderLayout.EAST);
			contentPane.add(btn2, BorderLayout.WEST);
			contentPane.add(btn3, BorderLayout.CENTER);
			contentPane.add(btn4, BorderLayout.NORTH);
			contentPane.add(btn5, BorderLayout.SOUTH);
			
			// 화면 센터에 띄우기
			Toolkit kt = Toolkit.getDefaultToolkit();
			Dimension screenSize = kt.getScreenSize();
			
			int x = (screenSize.width - getWidth())/2;
			int y = (screenSize.height - getHeight())/2;
			setLocation(x, y);
			
			// 프레임에 panel 부착
			add(contentPane);
						
		}
		
		public static void main(String[] args) {
			BorderLayoutTest1 border = new BorderLayoutTest1();
	

	}

}
