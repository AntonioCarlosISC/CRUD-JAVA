import java.awt.*;
import javax.swing.*;

public class Window extends JFrame {
    // Componentes gráficos
    JLabel titulo = new JLabel("Manejador de archivos");
    Cubo cubo = new Cubo();
    Tabla table = new Tabla();
    
    // Inicialización de la ventana
    public Window() {
        this.setTitle("CRUD");
        this.setLayout(new BorderLayout()); // Usar BorderLayout en lugar de null layout
        this.setResizable(false);
        this.setSize(640, 640);
        this.setLocation(400, 400);
        this.getContentPane().setBackground(Color.BLACK);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        
        // Configuración del título
        titulo.setHorizontalAlignment(SwingConstants.CENTER);
        titulo.setForeground(Color.WHITE); // Cambiar a negro para que sea visible en fondo blanco
        titulo.setFont(new Font("Serif", Font.BOLD, 20));
        
        // Agregar el título en la parte superior
        this.add(titulo, BorderLayout.NORTH);
        
        // Panel central para contener la tabla y el cubo
        JPanel centralPanel = new JPanel();
        centralPanel.setLayout(null); // Mantenemos el null layout solo para el panel interno
        centralPanel.setBackground(Color.WHITE);
        
        // Configuración del cubo
        cubo.setBounds(270, 50, 100, 100);  // Establece la posición y el tamaño del cubo
        cubo.setBackground(Color.BLACK); // Fondo del cubo
        
        // Configuración de la tabla
        table.setBounds(50, 200, 540, 300);  // Ajustar el tamaño de la tabla
        
        // Agregar la tabla y el cubo al panel central
        centralPanel.add(table);
        centralPanel.add(cubo);
        centralPanel.setBackground(Color.BLACK);
        // Agregar el panel central a la ventana principal
        this.add(centralPanel, BorderLayout.CENTER);
        
        this.setVisible(true); // Mostrar la ventana
    }
}