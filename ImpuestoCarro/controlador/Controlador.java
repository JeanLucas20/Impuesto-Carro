package controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;
import modelo.ImpuestoVehiculo;
import vista.VentanaPrincipal;

public class Controlador implements ActionListener
{
    //Atributos
    private VentanaPrincipal venPrin;
    private ImpuestoVehiculo model;
    //----------------------------
    //Metodos
    //----------------------------
    
    //Constructor
    public Controlador(VentanaPrincipal pVenPrin, ImpuestoVehiculo pModel)
    {
        this.venPrin = pVenPrin;
        this.model = pModel;
        this.venPrin.miPanelOperaciones.agregarOyentesBotones(this);
        
    }

    @Override
    public void actionPerformed(ActionEvent ae) 
    {
        String comando = ae.getActionCommand();
        
        if(comando.equals("Impuesto"))
        {
            try
            {
                int Precio =Integer.parseInt(venPrin.miPanelEntradaDatos.getPrecioVehiculo());
                int Años =Integer.parseInt(venPrin.miPanelEntradaDatos.getAños());
                String Matricula = venPrin.miPanelEntradaDatos.getMatricula();

                model = new ImpuestoVehiculo(Precio, Años, Matricula);
                model.hallarImpuesto();
                venPrin.miPanelResultado.mostrarResultado("El precio del vehiculo es: " + model.getPrecioVehiculo());
                venPrin.miPanelResultado.mostrarResultado("Los años del vehiculo son: " + model.getAños());
                venPrin.miPanelResultado.mostrarResultado("El lugar del vehiculo es: " + model.getMatricula());
                venPrin.miPanelResultado.mostrarResultado("El impuesto del vehiculo es: " + model.getImpuesto());
            }
            catch(Exception e)
            {
                JOptionPane.showMessageDialog(null, "Error en datos de entrada", "Error", JOptionPane.ERROR_MESSAGE);
            }   
        }
        if(comando.equals("borrar"))
        {
            this.venPrin.miPanelEntradaDatos.borrar();
            this.venPrin.miPanelResultado.borrar();
        }
        
    }

}
