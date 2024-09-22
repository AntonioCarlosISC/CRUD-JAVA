import javax.swing.*;
import java.awt.*;

public class Cubo extends JPanel implements Runnable {
    
    private int size = 30; // Tamaño del cubo
    private int x = 20, y = 20;


    // Sobrescribir el método paintComponent para dibujar el cubo
    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        // Dibujar un cubo (rectángulo)
        g.setColor(Color.RED);
        g.draw3DRect(x, y, size, size, getFocusTraversalKeysEnabled());    
        g.draw3DRect(x -10, y- 10, size, size, getFocusTraversalKeysEnabled());    
        

    }

    // Método run para mover el cubo
    @Override
    public void run() {
        boolean creciendo = true; // Controla si el cubo está creciendo o decreciendo

        while (true) {
            if (creciendo) {
                size += 1;
                if (size >= 40) {
                    creciendo = false; // Cambiar a modo de decrecimiento
                }
            } else {
                size -= 1;
                if (size <= 20) {
                    creciendo = true; // Cambiar a modo de crecimiento
                }
            }
    
            repaint(); // Redibujar el cubo con el nuevo tamaño
    
            try {
                Thread.sleep(100); // Pausar 100 ms entre cada actualización (misma velocidad para crecer y decrecer)
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
