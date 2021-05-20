package tecladovirtual;

import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.JPanel;

public class Botao extends JFrame{
    
    JButton b1 = new JButton("1");
    JButton b2 = new JButton("2");
    
    Botao (){
       
        JFrame f = new JFrame("Teclado virtual para a digitação correta");// Titulo da frame
        f.setSize(400,100);// definindo o tamanho da frame
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);// fechar quando apertar no X
        f.setLocationRelativeTo(null);// o JFrame inicializa no meio da tela
        f.setVisible(true);
        
        JPanel p = new JPanel();// criando o painel
        p.add(b1);
        p.add(b2);
        
        f.getContentPane().add(p);// getContentPane() gerencia o layout, permite varias ações ou adiciona componenetes na interface
        //f.pack();// redimensiona tudo de uma vez, é tipo o setSize ou setBounds 
        // esse pack ta sobrepondo o meu f.setsize
        f.setVisible(true);
       
   }
   
   
}
