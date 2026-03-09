package felipe.dcx.ufpb.br;
import javax.swing.JFrame;
import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;
public class BibliotecaGUI extends JFrame {

    public BibliotecaGUI(){
        setTitle("Bilioteca Central");
        setSize(600,600);
        setLocation(0,0);
        setResizable(false);
        //janela não redimensionável
        getContentPane().setBackground(Color.LIGHT_GRAY);

    }

    public static void main(String [] args){
        BibliotecaGUI p  = new BibliotecaGUI();
        p.setVisible(true);
        WindowListener fechadorDeJanelaPrincipal = new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        };p.addWindowListener(fechadorDeJanelaPrincipal);
    }
}
