package Opciones;

import javax.swing.*;
import java.awt.*;

public class Opcion2 extends JPanel {
//Aquí las busquedas y la tabla solo muestran vehiculos activos
    public Opcion2() {
        
        setLayout(new BorderLayout());

        JPanel PanelT = new JPanel(new BorderLayout());
        PanelT.setBackground(new Color(30, 30, 30));
        PanelT.setOpaque(true);

        JLabel label = new JLabel("Este es un panel personalizado Panel 2", SwingConstants.CENTER);
        label.setForeground(Color.WHITE);
        PanelT.add(label, BorderLayout.CENTER);

        add(PanelT, BorderLayout.CENTER);
    }
}
