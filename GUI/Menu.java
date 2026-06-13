package GUI;

import Opciones.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

/**
 * Panel lateral que contiene las opciones del menú principal y cambia el contenido mostrado.
 */
public class Menu extends javax.swing.JPanel implements ActionListener {

    private JButton option1Button;
    private JButton option2Button;
    private JButton option3Button;
    private JButton option4Button;
    private JButton option5Button;

    private JPanel mainPanel;

    /**
     * Crea el menú y lo enlaza con el panel principal donde se mostrarán las opciones seleccionadas.
     * @param contentPanel Panel principal que se actualizará al pulsar una opción.
     */
    public Menu(JPanel contentPanel) {
        this.mainPanel = contentPanel;

        // Establecer el layout del Menu como BorderLayout
        this.setLayout(new BorderLayout());

        // Panel para las opciones del menú en la parte izquierda
        JPanel panel = new JPanel(new GridLayout(5, 1));
        panel.setBackground(new Color(45, 45, 45));

        // Opción 1
        option1Button = new JButton("Ingresar");
        option1Button.addActionListener(this);
        PintarBoton(option1Button);
        panel.add(option1Button);

        // Opción 2
        option2Button = new JButton("Retirar");
        option2Button.addActionListener(this);
        PintarBoton(option2Button);
        panel.add(option2Button);

        // Opción 3
        option3Button = new JButton("Listar");
        option3Button.addActionListener(this);
        PintarBoton(option3Button);
        panel.add(option3Button);

        // Opción 4
        option4Button = new JButton("Historial");
        option4Button.addActionListener(this);
        PintarBoton(option4Button);
        panel.add(option4Button);

        // Opción 5
        option5Button = new JButton("Salir");
        option5Button.setBackground(Color.RED);
        option5Button.addActionListener(this);
        panel.add(option5Button, BorderLayout.SOUTH);

        // Agregar el panel del menú al panel principal en la parte izquierda
        this.add(panel);
    }

    /**
     * Maneja los clics en los botones del menú y muestra la opción correspondiente.
     * @param e Evento generado al pulsar un botón.
     */
    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == option1Button) {
            Opciones.Opcion1 O1 = new Opciones.Opcion1();
            MPAdd(O1);
        } else if (e.getSource() == option2Button) {
            Opciones.Opcion2 O2 = new Opciones.Opcion2();
            MPAdd(O2);
        } else if (e.getSource() == option3Button) {
            Opciones.Opcion3 O3 = new Opciones.Opcion3();
            MPAdd(O3);
        } else if (e.getSource() == option4Button) {
            Opciones.Opcion4 O4 = new Opciones.Opcion4();
            MPAdd(O4);
        } else if (e.getSource() == option5Button) {
            System.exit(0);
        }
    }

    /**
     * Reemplaza el contenido mostrado en el panel principal por el panel indicado.
     * @param panel Nuevo panel que se mostrará en el área central.
     */
    public void MPAdd(JPanel panel) {
        mainPanel.removeAll();
        mainPanel.add(panel, BorderLayout.CENTER);
        revalidate();
        repaint();
    }

    /**
     * Aplica estilos visuales a un botón del menú.
     * @param miBoton Botón al que se le aplicarán los estilos.
     */
    public void PintarBoton(JButton miBoton) {
        miBoton.setContentAreaFilled(true);
        miBoton.setBorderPainted(false);
        miBoton.setFocusPainted(false);
        miBoton.setOpaque(false);
        miBoton.setBackground(new Color(45, 45, 45));
        miBoton.setForeground(Color.WHITE);
    }
}

