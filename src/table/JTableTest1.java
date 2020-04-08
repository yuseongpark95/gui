package table;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import javax.swing.JScrollBar;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class JTableTest1 extends JFrame {

	private JPanel contentPane;
	private JTable table;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					JTableTest1 frame = new JTableTest1();
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
	public JTableTest1() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		
		contentPane.add(btnNewButton, BorderLayout.SOUTH);
		
		JScrollPane scrollPane = new JScrollPane();
		contentPane.add(scrollPane, BorderLayout.CENTER);
		
		table = new JTable();
		table.setModel(new DefaultTableModel(
			new Object[][] {
				{"hong", "24"},
				{"park", "26"},
				{"kim", "28"},
			},
			new String[] {
				"\uC774\uB984", "\uB098\uC774"
			}
		));
		
		
		JButton btnNewButton = new JButton("출력");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//  table 내용을 가져와서 출력하기
				
				//  1. 모델 가져오기
				TableModel model = table.getModel();
				System.out.println("이름\t나이");
				
				// 2. 모델의 내용 출력하기
				for (int i=0; i<model.getColumnCount(); i++) {
					System.out.println(model.getValueAt(i, j)+"\t");
				}
				System.out.println();
			}
			
		});
		contentPane.add(btnNewButton, BorderLayout.SOUTH);
		JScrollPane scrollPane = new JScrollPane();
		contentPane.add(scrollPane, BorderLayout.CENTER);	
		
		scrollPane.setViewportView(table);
	}

}
