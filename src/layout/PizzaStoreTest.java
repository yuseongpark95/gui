package layout;

import java.awt.BorderLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class PizzaStoreTest extends JFrame {
	
	public PizzaStoreTest() {
		setSize(800, 200);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setTitle("자바 피자");
		setVisible(true);
		
		JPanel totalPane = new JPanel();
		totalPane.setLayout(new BorderLayout());
		
		JPanel topPane = new JPanel();
		JLabel label1 = new JLabel("자바 피자에 오신 것을 환영합니다. 피자의 종류를 선택하시오.");
		topPane.add(label1);
		totalPane.add(topPane, BorderLayout.NORTH);
		
					
		// 센터
		JPanel centerPane = new JPanel();
		JButton btn1 = new JButton("콤보피자");
		JButton btn2 = new JButton("포테이토피자");
		JButton btn3 = new JButton("불고기피자");
		JLabel label2 = new JLabel("개수");
		JTextField field = new JTextField(10);
		centerPane.add(btn1);
		centerPane.add(btn2);
		centerPane.add(btn3);
		centerPane.add(label2);
		centerPane.add(field);
		totalPane.add(centerPane, BorderLayout.CENTER);
		
		add(totalPane);
	}			
	
	public static void main(String[] args) {
		PizzaStoreTest pizzastore = new PizzaStoreTest();

	}

}
