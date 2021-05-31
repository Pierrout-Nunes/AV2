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
   String pangrama = "apa";// ARRUMAAAAAAR
   int tamanhoDaFrase = pangrama.length();// tamanho do pangrama
   int atual = 0;// a desgraça da letra atual
  
    // cria componentes
    JPanel painel = new JPanel();
    JFrame frame = new JFrame("Teclado virtual para a digitação correta");// Titulo da frame
    JTextField texto = new JTextField (pangrama);// aparece pangrama p copiar
    JTextArea caixa = new JTextArea ();// onde eu escrevo
    JLabel titulo = new JLabel("titulo");

    //(String.format(" pangramas a serem digitados %s",pangrama)); em caixa
    // declaração
    JButton bA = new JButton("A");
     JButton bP = new JButton("P");
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
       bP.addKeyListener(this);
       
      // configurações da caixa de texto
        caixa.setFont(new Font("Serif", Font.ITALIC, 12));
        caixa.setLineWrap(true);
        caixa.setWrapStyleWord(true);
        caixa.setVisible(true);
        
       
        painel.add(bA);
        painel.add(bP);
        painel.add(bEnter);
        painel.add(caixa);
        painel.add(texto);
        painel.add(titulo);
     
     final Color corOriginal = bEnter.getBackground();
     // bEnter.setBackground(corOriginal); keyrleased !!!!
     

     caixa.addKeyListener( new KeyAdapter(){
     @Override
     public void keyPressed(KeyEvent evt) {
      
           int keyCode = evt.getKeyCode();
         switch (keyCode) {
             case KeyEvent.VK_ENTER:
                 // caixa.append(texto.getText() + "\n");// printa o texto toda vez q aperta enter
                 bEnter.doClick();
                 System.out.println("foi o enter");
                 System.out.println(" "+ keyCode);
                 bEnter.setBackground(Color.red);
                 //Ação gerada pelo ENTER
                 break;
             case KeyEvent.VK_A:
                 //caixa.append(texto.getText()); printa o texto toda vez que for A
                 bA.doClick();
                 System.out.println("foi o A");
                 System.out.println(" "+ keyCode);
                 break;
             case KeyEvent.VK_P:
                 //caixa.append(texto.getText()); printa o texto toda vez que for A
                 bP.doClick();
                 System.out.println("foi o P");
                 System.out.println(" "+ keyCode);
                 break;
             default:
                 break;
         }
      
        }

     @Override
     public void  keyReleased (KeyEvent evt){
        int keyCode = evt.getKeyCode();
       //voltar a cor original
            if ( keyCode == KeyEvent.VK_ENTER) { 
                bEnter.setBackground(corOriginal);
            }
        
        // quantidade de letras que acertei, porém depois que erra uma .. nao continua a conta
        // ve letra por letra
           if(caixa.getText().charAt(atual)==texto.getText().charAt(atual)){
           System.out.println("acertou");
           atual ++; // o quanto que digitei certo  
           System.out.println("Você acertou  "+ atual );
       }
         // comparação dos textos, tanto da caixa de entrada quanto do textField usado de exemplo  
         if(texto.getText().equals(caixa.getText()))  {
               System.out.println("aparece caso tudo certo" );
               
         }
          
 
    }

    
      }); 
 
    }


}
