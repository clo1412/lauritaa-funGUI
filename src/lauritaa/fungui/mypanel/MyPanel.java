package mypanel;

import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


import javax.swing.JOptionPane;
import javax.swing.JPanel;

import mybutton.MyButton;
import mylabel.MyLabel;
import question.hacker;

public class MyPanel extends JPanel implements ActionListener{

	
	private static final long serialVersionUID = 1L;
	private MyButton print;
    private MyLabel label;
    public hacker tim;
	
	public MyPanel() {
		setPreferredSize(new Dimension(245, 136));
	    setLayout(null);
		initializeButtonAndLabel();
        addComponent();
        print.addActionListener(this);
	}

	private void addComponent() {
		add(print);
        add(label);
	}

	private void initializeButtonAndLabel() {
		print = new MyButton();
        label = new MyLabel();
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if(e.getSource()==print){
            tim = new hacker();
            String x = JOptionPane.showInputDialog("Enter User you want to hack:");
            this.label.setText(tim.hackattack(x));
        }
	}

}
