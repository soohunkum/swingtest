package swingtest;

import java.awt.BorderLayout;
import java.awt.Container;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class SampleTextField extends JFrame{
		public static void main(String[] args) {
			SampleTextField frame = new SampleTextField();
			frame.setTitle("SampleTextField");
			frame.setBounds(550,350,300,200);
			frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			frame.setVisible(true);
		}
		SampleTextField(){
			JTextField text = new JTextField();
			text.setColumns(25);
			text.setText("Raspberry PI");
			JPanel p = new JPanel();
			p.add(text);
			Container contentPane = getContentPane();
			contentPane.add(p,BorderLayout.CENTER);
		}

}
