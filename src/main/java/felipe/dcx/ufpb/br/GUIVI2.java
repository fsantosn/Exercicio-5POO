package felipe.dcx.ufpb.br;

import javax.swing.*;
import java.awt.*;

public class GUIVI2 extends JFrame {

    JLabel linha1, linha2;

    public GUIVI2() {

        setTitle("Biblioteca Central");
        setSize(400,400);
        setLocation(0,0);
        setResizable(true);
        getContentPane().setBackground(Color.white);

        ImageIcon livrosImg = new ImageIcon("src/main/java/imgs/livros.png");

        linha1 = new JLabel("Biblioteca Central", JLabel.CENTER);
        linha1.setForeground(Color.red);
        linha1.setFont(new Font("Serif", Font.BOLD, 24));

        linha2 = new JLabel(livrosImg, JLabel.CENTER);

        getContentPane().setLayout(new GridLayout(3,1));
        getContentPane().add(linha1);
        getContentPane().add(linha2);
    }

    public static void main(String[] args) {
        JFrame janela = new GUIVI2();
        janela.setVisible(true);
        janela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}