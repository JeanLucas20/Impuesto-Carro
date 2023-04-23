package vista;

import java.awt.Color;
import java.awt.Font;
import static java.awt.Font.BOLD;
import java.awt.event.ActionListener;
import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.border.TitledBorder;

public class PanelOperaciones extends JPanel {
    // ----------------------
    // Atributos
    // ----------------------
    public JButton btImpuesto;
    public JButton btBorrar;

    // ----------------------
    // Metodos
    // ----------------------

    // Constructor
    public PanelOperaciones() {
        // Definicion del contenedor del panel
        setLayout(null);
        setBackground(Color.gray);

        // Creación y adicion de los botones
        btImpuesto = new JButton("Impuesto");
        btImpuesto.setFont(new Font("chiler", BOLD, 12));
        btImpuesto.setBounds(10, 20, 90, 20);
        add(btImpuesto);
        btImpuesto.setActionCommand("Impuesto");

        btBorrar = new JButton("Borrar");
        btBorrar.setBounds(120, 20, 90, 20);
        this.add(btBorrar);
        btBorrar.setActionCommand("borrar");

        // Borde y titulo del panel
        TitledBorder borde = BorderFactory.createTitledBorder("Operaciones");
        borde.setTitleColor(Color.red);
        setBorder(borde);
    }

    public void agregarOyentesBotones(ActionListener pAL) {
        btImpuesto.addActionListener(pAL);
        btBorrar.addActionListener(pAL);

    }

}