package layout;

import java.awt.Color;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTabbedPane;

public class JTabbedPaneTest extends JFrame {
	
	public JTabbedPaneTest() {
		setTitle("JTabbedPaneTest");
		setSize(500, 500);
		setVisible(true);
		
		
		JTabbedPane jTabbed = new JTabbedPane();
		// tabl이 보여질 위치 지정
		jTabbed.setTabPlacement(JTabbedPane.BOTTOM);
		
		JPanel first = new JPanel();
		first.setBackground(Color.YELLOW);
		jTabbed.addTab("첫번째", first);
		
		
		// 탭에 보여줄 패널 추가
		JPanel second = new JPanel();
		second.setBackground(Color.BLUE);
		jTabbed.addTab("두번째", second);
		

		JPanel third = new JPanel();
		third.setBackground(Color.RED);
		jTabbed.addTab("세번째", third);
		
		add(jTabbed);
	}
		
	public static void main(String[] args) {
		JTabbedPaneTest test = new JTabbedPaneTest();
	}
}
