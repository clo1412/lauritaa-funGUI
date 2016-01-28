/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lauritaa.fungui;
import javax.swing.JFrame;
/**
 *
 * @author Andrew_2
 */
public class LauritaaFunGUI {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        JFrame frame = new JFrame("Hacker.exe");
        
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.getContentPane().add(new Display());
        frame.pack();
        frame.setVisible(true);
    }
    
}
