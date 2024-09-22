import java.awt.*;
import javax.swing.*;

public class Window extends JFrame{
    //Componentes graficos
    JLabel titulo = new JLabel("Manejador de archivos");
    Cubo cubo = new Cubo();
    //Inicialización de la ventana
    public Window(){
        this.setTitle("CRUD");
        this.setLayout(null);
        this.setResizable(false);
        this.setSize(640,640);
        this.setLocation(400,400);
        this.getContentPane().setBackground(Color.BLACK);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setVisible(true);

        titulo.setBounds(180,10,500,50);
        titulo.setForeground(Color.WHITE);
        titulo.setFont(new Font("Serif",Font.BOLD,20));
        this.add(titulo);
        this.cubo.setBounds(270, 50, 100, 100);  // Establece la posición y el tamaño del cubo
        this.cubo.setBackground(Color.BLACK);
        this.add(cubo);
    }
}
