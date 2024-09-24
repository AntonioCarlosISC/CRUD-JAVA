import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;

public class Tabla extends JComponent {
    public Tabla() {
        // Crear el modelo de datos
        String[] columnNames = {"ID", "Nombre", "Edad"};
        Object[][] data = {
            {1, "Juan", 25},
            {2, "Ana", 30},
            {3, "Carlos", 40},
            {4, "David", 25},
            {5, "Javier", 22}
        };

        // Crear la JTable con el modelo de datos
        JTable table = new JTable(new DefaultTableModel(data, columnNames));

        // Agregar la JTable dentro de un JScrollPane para permitir el desplazamiento
        JScrollPane scrollPane = new JScrollPane(table);

        // Establecer un tamaño para el JScrollPane
        scrollPane.setPreferredSize(new Dimension(500, 300)); // Ajusta el tamaño según lo necesario

        // Agregar el JScrollPane a este componente
        this.setLayout(new BorderLayout()); // Usar un layout para el JComponent
        this.add(scrollPane, BorderLayout.CENTER); // Agregar el JScrollPane al centro
    }
}
