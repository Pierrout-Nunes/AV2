package tecladovirtual;


import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import java.awt.Font;

public  class Botao extends JFrame implements ActionListener {
   
    JPanel painel = new JPanel();// criando o painel
    JFrame frame = new JFrame("Teclado virtual para a digitação correta");// Titulo da frame

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
        
       
        JButton b1 = new JButton("1");
        JButton b2 = new JButton("2");
       
        b1.addActionListener(this);
        
        //Declarando componentes
        JTextArea caixa;
        //***caixa de texto**
       caixa = new JTextArea();// criei componente
       //valores para a area de texto
       //caixa.setFont(new Font("Serif", Font.ITALIC, 12));
       caixa.setLineWrap(true);
       caixa.setWrapStyleWord(true);
        
       
        
        painel.add(b1);
        painel.add(b2);
        painel.add(caixa);
        
       String texto = "";
       caixa.setText(texto);
       caixa.setVisible(true);
     
       
    }

  // Não aceita meu b1
    @Override
    public void actionPerformed(ActionEvent e) {
        
        b1.setFont(new Font("SansSerif", Font.BOLD, 20));
    }
    
 
}
