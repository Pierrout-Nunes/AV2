package tecladovirtual;


import java.awt.Color;
import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import java.awt.Font;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import javax.swing.JLabel;
import javax.swing.JTextField;

public  class Botao extends KeyAdapter {
   // final static String [] pangrama2 = {"apa", "aaa"};// ARRUMAAAAAAR
   // int tamanhoDaFrase = pangrama.length;// tamanho do pangrama
    String pangrama = "appp";
    int tamanhoDaFrase = pangrama.length();
    int atual = 0;// a desgraça da letra atual
    int erroAtual = 0;// a outra coisa q deu errado la
    int acertoAtual = 0;
    // cria componentes
    JPanel painel = new JPanel();
    JFrame frame = new JFrame("Teclado virtual para a digitação correta");// Titulo da frame
    JTextField texto = new JTextField (pangrama);// = new JTextField (pangrama);// aparece pangrama p copiar
  //  JTextField texto = new JTextField (pangrama[tamanhoDaFrase]);
    JTextArea caixa = new JTextArea ();// = new JTextArea ();// onde eu escrevo
    JLabel titulo = new JLabel("titulo");

    //(String.format(" pangramas a serem digitados %s",pangrama)); em caixa
    // declaração
    JButton bA = new JButton("A");
    JButton bP = new JButton("P");
    JButton bEnter = new JButton("enter");
    JButton bDelete = new JButton("del");
 
     // Para o básico do frame
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
    
    // Molda o teclado
    public void keyboard () {

       // cria evento do botão, acho q isso é inútil
        bEnter.addKeyListener(this);
        bA.addKeyListener(this);
        bP.addKeyListener(this);
        bDelete.addKeyListener(this);
       
      // configurações da caixa de texto
        caixa.setFont(new Font("Serif", Font.ITALIC, 12));
        caixa.setLineWrap(true);
        caixa.setWrapStyleWord(true);
        caixa.setVisible(true);
        
     // adiciona os elementos ao painel  
        painel.add(bA);
        painel.add(bP);
        painel.add(bEnter);
        painel.add(bDelete);
        
        painel.add(caixa);
        painel.add(texto);
        painel.add(titulo);
        
   
        // Responsável pela volta da cor original do botão
        final Color corOriginal = bEnter.getBackground(); 
    
    // "Ouvir" os eventos do teclado 
    //aki fica a exceção ?
     caixa.addKeyListener( new KeyAdapter(){
     @Override
     // Quando pressiona o botão
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
                case KeyEvent.VK_BACK_SPACE:
                        bDelete.doClick();
                default:
                    break;
            }
      
        }
     
     // Quando deixa de pressionar o botão
     @Override
     public void  keyReleased (KeyEvent evt){
        int keyCode = evt.getKeyCode();
       //É o que efetiva a volta da cor original
            if ( keyCode == KeyEvent.VK_ENTER) { 
                bEnter.setBackground(corOriginal);
            }
            

       try{
          // for(int i = 0; i < 3; i++)//rodar 3 pang
            //se o tamanho da frase q to digitando ainda é menor
                   //do q a frase de exemplo , faça o q ja escrevi 
               //senão, mude de frase c o setText de texto e caixa e o-- for--
             if(caixa.getText().length() < tamanhoDaFrase){
                
                // Esse if serve para me retornar o i-ésimo caractere da string > charAt
                    if(caixa.getText().charAt(atual)==texto.getText().charAt(atual)){
                        atual++;
                        System.out.println("acertou");
                        acertoAtual ++; // o quanto que digitei certo  
                        System.out.println("Você acertou  "+ acertoAtual );

                }

                    // Se eu errar
                    else if (caixa.getText().charAt(atual)!= texto.getText().charAt(atual)){
                            erroAtual ++;
                            System.out.println("errou "+ erroAtual);
                        //    caixa.setText(caixa.getText().substring(0, atual));
                    }
               // atual++;
            
                  }
             else{
                texto.setText("ap");// essa string precisa ser menor que a primeira
                caixa.setText(null);
                atual = 0; 
                erroAtual = 0;
                acertoAtual = 0; 
                System.out.println(" "+texto.getText());
             }
       }
      
       catch(Exception um){
           // tratamento do delete ja q sempre estoura a string
             if(evt.getKeyCode()==8){
                atual--;
            }
           System.out.println("estourou o tamaho da string");
           System.out.println(" "+atual);
       }

        // comparação dos textos, tanto da caixa de entrada quanto do textField usado de exemplo
        
         if(texto.getText().equals(caixa.getText()))  {
               System.out.println("aparece caso tudo certo" ); 
   
     }
    }

      }); 
   
    }

}
