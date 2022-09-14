package java_study.day2.gui;

import java.awt.Frame;
import java.awt.GridLayout;
import java.awt.Panel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class Ex5 extends JFrame implements ActionListener {
	JLabel id_la, password_la;
	JTextField id_tf, password_tf;
	JButton login, join;
	Frame ex6 = (Frame) new Ex6();
	
	public JTextField id, password;
	
	public Ex5() {
		super("GUI");
		
		id_la = new JLabel("ID");
		password_la = new JLabel("PASSWORD");
		id_tf = new JTextField();
		password_tf = new JTextField();
		login = new JButton("login");
		join = new JButton("join");
		
		Panel p = new Panel();
		Panel p2 = new Panel(new GridLayout(2, 2));
		p.setLayout(new GridLayout(1, 2, 10, 10));
		
		p.add(login);
		p.add(join);
		p2.add(id_la);
		p2.add(id_tf);
		p2.add(password_la);
		p2.add(password_tf);
		this.add(p, "South");
		this.add(p2, "Center");
		
		this.setSize(300, 120);
		this.setVisible(true);
		this.addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e) {
				System.exit(0);
			}
		});
		login.addActionListener((ActionListener) this);
	}
	
	public static void main(String[] args) {
		new Ex5();
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		System.out.println("Ȯ��: " + id_tf.getText());
		id_tf.setText("");
		ex6.setVisible(true);
		this.setVisible(false);
		ex6.dispose();
//		if(id_tf.getText().equals(members[0].getId()) && password_tf.getText().equals(members[0].getPassword())) {
//			
//		}
	}
}
