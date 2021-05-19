package javaapplication31;

import javax.swing.*;
import javax.swing.JTextField;

public class JavaApplication31 {

    private static void createAndShowGUI() {
        
        JFrame.setDefaultLookAndFeelDecorated(true);
        
        JFrame frame = new JFrame("HelloWorldSwing");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);// quando apertar o X
        
        JLabel label = new JLabel("Hello World");
        frame.getContentPane().add(label);
        
        frame.pack(); 
        frame.setVisible(true);
        
    }
    public static void main(String[] args) {
        
        SwingUtilities.invokeLater(new Runnable(){    
            public void run() {
            createAndShowGUI();
            }
        });
     
        CaixaDeTexto texfield = new CaixaDeTexto();
    
        texfield.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        texfield.setSize(310,110);
        texfield.setVisible(true);
    }
    
}
