package tecladovirtual;

import javax.swing.JFrame;
import javax.swing.JButton;

public class Botao extends JFrame{
    
    JButton b1 = new JButton("1");
    JButton b2 = new JButton("2");
    
    Botao (){
       setLayout(null); // sem as regras chatas de Layout
       b1.setBounds(0, 300, 100, 60);// b1.setBounds(WIDTH, WIDTH, WIDTH, HEIGHT);
       b2.setBounds(100, 300, 100, 60);
       add(b1);
       add(b2);
       
   }
   
   
}
