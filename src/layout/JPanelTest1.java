package layout;

import java.awt.BorderLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.JTree;

public class JPanelTest1 extends JFrame {
	
	public JPanelTest1() {
		setSize(500, 500);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setTitle("여러가지 레이아웃");
		setVisible(true);
		
		JPanel totalPane = new JPanel();
		totalPane.setLayout(new BorderLayout());
		
		// 상단에 보여줄 레이아웃 설정
		JPanel topPane = new JPanel();
		JButton btn1 = new JButton("왼쪽");
		JButton btn2 = new JButton("가운데");
		JButton btn3 = new JButton("오른쪽");
		topPane.add(btn1);
		topPane.add(btn2);
		topPane.add(btn3);
		totalPane.add(topPane, BorderLayout.NORTH);
		
		JPanel leftPane = new JPanel();
		JButton btn4 = new JButton("수박");
		leftPane.add(btn4);
		totalPane.add(leftPane, BorderLayout.WEST);
		
		
		// 좌측에 보여줄 레이아웃 설정
		JPanel rightPane = new JPanel();
		JButton btn5 = new JButton("메론");
		rightPane.add(btn5);
		totalPane.add(rightPane, BorderLayout.EAST);
		
		// 가운데 보여줄 레이아웃 설정
		JPanel centerPane = new JPanel();
		JLabel label = new JLabel("이름 ");
		JTextField field = new JTextField(10);
		JTree tree = new JTree();
		centerPane.add(label);
		centerPane.add(field);
		centerPane.add(tree);
		totalPane.add(centerPane, BorderLayout.CENTER);
		
		// 아래 보여줄 레이아웃 설정
		JButton btn6 = new JButton("남쪽버튼");
		totalPane.add(btn6, BorderLayout.SOUTH);
		
		add(totalPane);

	}
	
	
	public static void main(String[] args) {
		JPanelTest1 swing = new JPanelTest1();

	}

}
