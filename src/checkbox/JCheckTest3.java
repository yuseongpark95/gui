package checkbox;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.GridLayout;

import javax.swing.ButtonGroup;
import javax.swing.JCheckBox;

public class JCheckTest3 extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					JCheckTest3 frame = new JCheckTest3();
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
	public JCheckTest3() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		
		JLabel lblNewLabel = new JLabel("좋아하는 과일을 선택하세요");
		contentPane.add(lblNewLabel, BorderLayout.NORTH);
		
		JPanel panel = new JPanel();
		contentPane.add(panel, BorderLayout.CENTER);
		panel.setLayout(new GridLayout(0, 2, 0, 0));
		
		JCheckBox check1 = new JCheckBox("New check box");
		panel.add(check1);
		
		JCheckBox check2 = new JCheckBox("New check box");
		panel.add(check2);
		
		JCheckBox check3 = new JCheckBox("New check box");
		panel.add(check3);
		
		JCheckBox check4 = new JCheckBox("New check box");
		panel.add(check4);
		
		JCheckBox check5 = new JCheckBox("New check box");
		panel.add(check5);
		
		JCheckBox check6 = new JCheckBox("New check box");
		panel.add(check6);
		
		ButtonGroup group = new ButtonGroup();
		group.add(check1);
		group.add(check2);
		group.add(check3);
		group.add(check4);
		group.add(check5);
		group.add(check6);
	}

}
