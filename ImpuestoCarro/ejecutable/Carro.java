package ejecutable;

import controlador.Controlador;
import modelo.ImpuestoVehiculo;
import vista.VentanaPrincipal;

public class Carro {
    public static void main(String[] args)
    {
        VentanaPrincipal miVentana = new VentanaPrincipal();
        ImpuestoVehiculo miImpuestoVehiculo = null;
        Controlador miControlador = new Controlador(miVentana,miImpuestoVehiculo);
    }    
}
