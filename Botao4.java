package tecladovirtual;


import java.awt.Color;
//import java.awt.event.ActionEvent;
//import java.awt.event.ActionListener;
import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import java.awt.Font;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
//import java.awt.event.KeyListener;
//import javax.swing.AbstractAction;
import javax.swing.JLabel;
import javax.swing.JTextField;

// implements Keylistener ????? ActionListener
//implements ActionListener
public  class Botao extends KeyAdapter {
   
    // cria componentes
    JPanel painel = new JPanel();
    JFrame frame = new JFrame("Teclado virtual para a digitação correta");// Titulo da frame
    JTextField texto = new JTextField ();
    JTextArea caixa = new JTextArea ();
    JLabel titulo = new JLabel("colocar em outro lugar, vai ser as frases com for");
    
    
    // declaração
    JButton bA = new JButton("A");
    JButton bEnter = new JButton("enter");

        
     //método para o básico
    public void basico (){
        frame.setSize(400,400);// definindo o tamanho da frame
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
        

       // cria evento do botão, acho q isso é inútil
       bEnter.addKeyListener(this);
       bA.addKeyListener(this);
       
      // configurações da caixa de texto
        caixa.setFont(new Font("Serif", Font.ITALIC, 12));
        caixa.setLineWrap(true);
        caixa.setWrapStyleWord(true);
        caixa.setVisible(true);
        
       
        painel.add(bA);
        painel.add(bEnter);
        painel.add(caixa);
        painel.add(texto);
        painel.add(titulo);
      
     // Isso não está ligado ao botão, deve ser o jtexArea ou o field fazendo o trabalho
     // preciso usar o jtextField pelo visto, o textAREa da erro
     
     final Color corOriginal = bEnter.getBackground();
     // bEnter.setBackground(corOriginal); keyrleased !!!!
     caixa.addKeyListener( new KeyAdapter(){
     @Override
     public void keyPressed(KeyEvent evt) {
         // o source é objeto, aki eu to mexendo com inteiro
           int keyCode = evt.getKeyCode();
            if ( keyCode == KeyEvent.VK_ENTER) { 
                caixa.append(texto.getText() + "\n");
                bEnter.doClick();
                System.out.println("foi o enter");
                bEnter.setBackground(Color.red);
                //Ação gerada pelo ENTER
            }
            else if (keyCode == KeyEvent.VK_A) {                    
                caixa.append(texto.getText());
                bA.doClick();
                System.out.println("foi o A");
            }
        }
  //   });
     
     @Override
     public void  keyReleased (KeyEvent evt){
        int keyCode = evt.getKeyCode();
            if ( keyCode == KeyEvent.VK_ENTER) { 
                bEnter.setBackground(corOriginal);
            }
   
    }
      }); 
  
    }

    // ActionListener tem esse método
  /* @Override
    public void actionPerformed(ActionEvent e) {
       // Melhor fazer com JTextArea b1.setFont(new Font("SansSerif", Font.BOLD, 20));
        if (e.getSource() == b1) {
            caixa.append(texto.getText() + "1");
        }   
    }*/
   
    
  

}
   
    
  

