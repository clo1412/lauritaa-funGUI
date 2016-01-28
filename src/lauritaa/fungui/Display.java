/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lauritaa.fungui;
import java.awt.Dimension;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;
/**
 *
 * @author Andrew_2
 */
public class Display extends JPanel implements ActionListener{
    private JButton print;
    private JLabel label;
    public hacker tim;
    /**
     * makes display
     * constructor
     */
    public Display(){
        print = new JButton("Hack");
        label = new JLabel("Start Hacking");
        
        setPreferredSize(new Dimension(245, 136));
        
        setLayout(null);
        
        add(print);
        add(label);
        
        print.setBounds(70, 10, 100, 25);
        label.setBounds(20, 45, 210, 35);
        
        print.addActionListener(this);
    }
    /**
     * Method that checks when the button is clicked
     * @param e 
     */
    public void actionPerformed(ActionEvent e){
        if(e.getSource()==print){
            tim = new hacker();
            String x = JOptionPane.showInputDialog("Enter User you want to hack:");
            this.label.setText(tim.hackattack(x));
        }
    }
}