package container;

import java.awt.Dimension;
import java.awt.Toolkit;
import java.net.URL;

import javax.swing.ImageIcon;
import javax.swing.JFrame;

public class Bymyself extends JFrame {
	
	public Bymyself() {
		setTitle("연습용 프로그램");
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
		Bymyself bymyself = new Bymyself();

	}
}
