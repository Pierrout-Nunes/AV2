package tecladovirtual;

import javax.swing.JFrame;

public class TecladoVirtual extends JFrame {
    // Construtor para as configurações da janela
    TecladoVirtual() {
        setSize(400,100);
        setTitle("Teclado virtual para a digitação correta");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setVisible(true);         
    }
    public static void main(String[] args) {
        new TecladoVirtual();
        new Botao();
    }
    
}
