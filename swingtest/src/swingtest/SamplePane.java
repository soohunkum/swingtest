package swingtest;

import java.awt.BorderLayout;
import java.awt.Container;
import java.nio.channels.AcceptPendingException;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class SamplePane extends JFrame{	
		public static void main (String[] args) {
			SamplePane frame = new SamplePane("Swing");
			frame.setVisible(true);
		}
		SamplePane(String title){
			setTitle(title);
			setBounds(550,350,300,200);
			setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			JPanel p = new JPanel();
			JButton btn1 = new JButton("YES");
			JButton btn2 = new JButton("NO");
			p.add(btn1);
			p.add(btn2);
			Container c = getContentPane();
			c.add(p, BorderLayout.CENTER);
		
}}
