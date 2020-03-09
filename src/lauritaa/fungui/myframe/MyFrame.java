package myframe;

import javax.swing.JFrame;

import question.Display;

public class MyFrame extends JFrame {

	private static final long serialVersionUID = 1L;

	public MyFrame() {
		this.setTitle("Hacker.exe");
	    this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	    this.getContentPane().add(new Display());
	    this.pack();
	    this.setVisible(true);
	}
}
