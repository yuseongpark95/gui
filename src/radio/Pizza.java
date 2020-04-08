package radio;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import javax.swing.JButton;
import java.awt.GridLayout;
import javax.swing.JRadioButton;
import javax.swing.border.TitledBorder;
import java.awt.FlowLayout;
import javax.swing.UIManager;
import java.awt.Color;
import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import java.awt.Insets;

public class Pizza extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Pizza frame = new Pizza();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Pizza() {
		setTitle("피자 주문");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		
		JLabel lblNewLabel = new JLabel("자바 피자에 오신 것을 환영합니다.");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		contentPane.add(lblNewLabel, BorderLayout.NORTH);
		
		JPanel panel = new JPanel();
		contentPane.add(panel, BorderLayout.SOUTH);
		
		JButton btnNewButton = new JButton("주문");
		panel.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("취소");
		panel.add(btnNewButton_1);
		
		JLabel lblNewLabel_1 = new JLabel("금액: ");
		panel.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("New label");
		panel.add(lblNewLabel_2);
		
		JPanel panel_1 = new JPanel();
		contentPane.add(panel_1, BorderLayout.CENTER);
		panel_1.setLayout(new GridLayout(0, 3, 0, 0));
		
		JPanel panel_2 = new JPanel();
		panel_2.setBorder(new TitledBorder(UIManager.getBorder("TitledBorder.border"), "\uC885\uB958", TitledBorder.CENTER, TitledBorder.TOP, null, new Color(0, 0, 0)));
		panel_1.add(panel_2);
		panel_2.setLayout(new FlowLayout(FlowLayout.LEFT, 5, 20));
		
		JRadioButton rdbtnNewRadioButton_1 = new JRadioButton("콤보");
		panel_2.add(rdbtnNewRadioButton_1);
		
		JLabel label_2 = new JLabel("");
		panel_2.add(label_2);
		
		JLabel label_3 = new JLabel("");
		panel_2.add(label_3);
		
		JRadioButton rdbtnNewRadioButton = new JRadioButton("불고기");
		panel_2.add(rdbtnNewRadioButton);
		
		JRadioButton rdbtnNewRadioButton_2 = new JRadioButton("포테이토");
		rdbtnNewRadioButton_2.setHorizontalAlignment(SwingConstants.LEFT);
		panel_2.add(rdbtnNewRadioButton_2);
		
		JPanel panel_3 = new JPanel();
		panel_3.setBorder(new TitledBorder(UIManager.getBorder("TitledBorder.border"), "\uCD94\uAC00\uD1A0\uD551", TitledBorder.CENTER, TitledBorder.TOP, null, new Color(0, 0, 0)));
		panel_1.add(panel_3);
		panel_3.setLayout(new GridLayout(0, 1, 0, 0));
		
		JRadioButton rdbtnNewRadioButton_4 = new JRadioButton("피망");
		panel_3.add(rdbtnNewRadioButton_4);
		
		JRadioButton rdbtnNewRadioButton_5 = new JRadioButton("치즈");
		panel_3.add(rdbtnNewRadioButton_5);
		
		JRadioButton rdbtnNewRadioButton_3 = new JRadioButton("페페로니");
		rdbtnNewRadioButton_3.setHorizontalAlignment(SwingConstants.LEFT);
		panel_3.add(rdbtnNewRadioButton_3);
		
		JRadioButton rdbtnNewRadioButton_6 = new JRadioButton("베이컨");
		panel_3.add(rdbtnNewRadioButton_6);
		
		JLabel label = new JLabel("");
		panel_3.add(label);
		
		JLabel label_1 = new JLabel("");
		panel_3.add(label_1);
		
		JPanel panel_4 = new JPanel();
		FlowLayout flowLayout_2 = (FlowLayout) panel_4.getLayout();
		flowLayout_2.setAlignment(FlowLayout.LEFT);
		flowLayout_2.setVgap(20);
		panel_4.setBorder(new TitledBorder(UIManager.getBorder("TitledBorder.border"), "\uD06C\uAE30", TitledBorder.CENTER, TitledBorder.TOP, null, new Color(0, 0, 0)));
		panel_1.add(panel_4);
		
		JRadioButton rdbtnNewRadioButton_7 = new JRadioButton("Small");
		panel_4.add(rdbtnNewRadioButton_7);
		
		JRadioButton rdbtnNewRadioButton_9 = new JRadioButton("Medium");
		rdbtnNewRadioButton_9.setHorizontalAlignment(SwingConstants.LEFT);
		panel_4.add(rdbtnNewRadioButton_9);
		
		JRadioButton rdbtnNewRadioButton_8 = new JRadioButton("Large");
		rdbtnNewRadioButton_8.setHorizontalAlignment(SwingConstants.LEFT);
		panel_4.add(rdbtnNewRadioButton_8);
	}

}
