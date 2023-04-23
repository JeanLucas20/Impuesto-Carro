package modelo;

public class ImpuestoVehiculo {

    // Atributos
    private int PrecioVehiculo;
    private double Impuesto;
    private int Años;
    private String Matricula;

    // Métodos

    /* Método Constructor */
    public ImpuestoVehiculo(int pPrecio, int pAños, String pMatricula) {
        this.PrecioVehiculo = pPrecio;
        this.Impuesto = 0;
        this.Años = pAños;
        this.Matricula = pMatricula;
    }

    public void setPrecioVehiculo(int PrecioVehiculo) {
        this.PrecioVehiculo = PrecioVehiculo;
    }

    public int getPrecioVehiculo() {
        return PrecioVehiculo;
    }

    public void setAños(int Años) {
        this.Años = Años;
    }

    public int getAños() {
        return Años;
    }

    public void setMatricula(String Matricula) {
        this.Matricula = Matricula;
    }

    public String getMatricula() {
        return Matricula;
    }

    public void setImpuesto(double pImpuesto) {
        this.Impuesto = pImpuesto;
    }

    public double getImpuesto() {
        return Impuesto;
    }

    public void hallarImpuesto() {
        if (Años == 0) {
            if (Matricula.equals("socorro")) {
                Impuesto = (10 * PrecioVehiculo) / 100;
                Impuesto = Impuesto - (50 * Impuesto) / 100;
            } else {
                Impuesto = (10 * PrecioVehiculo) / 100;
            }

        } else if (Años <= 5) {
            if (Matricula.equals("socorro")) {
                Impuesto = (7 * PrecioVehiculo) / 100;
                Impuesto = Impuesto - (50 * Impuesto) / 100;
            } else {
                Impuesto = (7 * PrecioVehiculo) / 100;
            }

        } else {
            if (Matricula.equals("socorro")) {
                Impuesto = (3 * PrecioVehiculo) / 100;
                Impuesto = Impuesto - (50 * Impuesto) / 100;
            } else {
                Impuesto = (3 * PrecioVehiculo) / 100;
            }

        }
    }

}
