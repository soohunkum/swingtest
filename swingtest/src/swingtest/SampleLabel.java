package swingtest;

import java.awt.BorderLayout;
import java.awt.Container;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class SampleLabel extends JFrame{
	public static void main(String[] args) {
		SampleLabel frame = new SampleLabel();
		frame.setTitle("SampleLabel");
		frame.setBounds(550,350,300,200);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
	}
		SampleLabel(){
			JLabel label = new JLabel();
			label.setText("Raspberry PI");
			
			JPanel p = new JPanel();
			p.add(label);
			Container contentPane = getContentPane();
			contentPane.add(p,BorderLayout.CENTER);
		}

}
