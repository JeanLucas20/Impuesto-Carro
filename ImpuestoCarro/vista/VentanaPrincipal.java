package vista;

import javax.swing.JFrame;

public class VentanaPrincipal extends JFrame {
    // ----------------------
    // Atributos
    // ----------------------
    public PanelEntradaDatos miPanelEntradaDatos;
    public PanelOperaciones miPanelOperaciones;
    public PanelResultados miPanelResultado;

    // -------------------------
    // Métodos
    // -------------------------

    // Metodo constructor
    public VentanaPrincipal() {
        // Definición del contenedor de la ventana
        setLayout(null);

        // Creación y adición del PanelEntradaDatos
        miPanelEntradaDatos = new PanelEntradaDatos();
        miPanelEntradaDatos.setBounds(10, 10, 480, 190);
        add(miPanelEntradaDatos);

        // Creación y adición del PanelOperaciones
        miPanelOperaciones = new PanelOperaciones();
        miPanelOperaciones.setBounds(10, 220, 480, 80);
        add(miPanelOperaciones);

        // Creación y adición del PanelOperaciones
        miPanelResultado = new PanelResultados();
        miPanelResultado.setBounds(10, 320, 480, 140);
        add(miPanelResultado);

        // Caracteristicas de la ventana
        setTitle("Empresa");
        setSize(500, 500);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setResizable(false);
        setVisible(true);
    }

    // Crear ventana dialogo Empleados

}
