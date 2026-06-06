package Opciones;

import javax.swing.*;
import java.awt.*;

public class Opcion1 extends JPanel {

    public Opcion1() {
        setLayout(new BorderLayout());

        JPanel PanelT = new JPanel(new BorderLayout());
        PanelT.setBackground(new Color(30, 30, 30));
        PanelT.setOpaque(true);

/*************************************************************************************************************************************/
//Logica
        JLabel label = new JLabel("Este es un panel personalizado Panel 1", SwingConstants.CENTER);
        label.setForeground(Color.WHITE);
        PanelT.add(label, BorderLayout.CENTER);
        
/*************************************************************************************************************************************/
        add(PanelT, BorderLayout.CENTER);
        
    }

}
