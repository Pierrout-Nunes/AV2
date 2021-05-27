package tecladovirtual;


import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import java.awt.Font;
import javax.swing.JTextField;

public  class Botao extends JFrame implements ActionListener {
   
    // cria componentes
    JPanel painel = new JPanel();
    JFrame frame = new JFrame("Teclado virtual para a digitação correta");// Titulo da frame
    JTextField texto = new JTextField ();
    JTextArea caixa = new JTextArea ();
    
    // declaração
    JButton b1 = new JButton("1");
    JButton b2 = new JButton("2");

        
     //método para o básico
    public void basico (){
        frame.setSize(400,100);// definindo o tamanho da frame
       // setTitle("Teclado virtual para a digitação correta");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);// fechar quando apertar no X
        frame.setLocationRelativeTo(null);// o JFrame inicializa no meio da tela
        frame.setVisible(true);
        
        
        frame.getContentPane().add(painel);// getContentPane() gerencia o layout, permite varias ações ou adiciona componenetes na interface
        //f.pack();// redimensiona tudo de uma vez, é tipo o setSize ou setBounds 
        // esse pack ta sobrepondo o meu f.setsize
        frame.setVisible(true);
    }
    
    // método que molda o teclado
    public void keyboard () {
        

       // cria evento do botão, keylistener !!!!
        b1.addActionListener(this);
        
      // configurações da caixa de texto
        caixa.setFont(new Font("Serif", Font.ITALIC, 12));
        caixa.setLineWrap(true);
        caixa.setWrapStyleWord(true);
        caixa.setVisible(true);
       
        
        painel.add(b1);
        painel.add(b2);
        painel.add(caixa);
        painel.add(texto);
        
     
    }

    
    @Override
    public void actionPerformed(ActionEvent e) {
       // Melhor fazer com JTextArea b1.setFont(new Font("SansSerif", Font.BOLD, 20));
        if (e.getSource() == b1) {
            caixa.append(texto.getText() + "\n");
        }
        
          
    }

    
    
 
}
