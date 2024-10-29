public class Auto extends Vehiculo {
    private int numPuertas;

    public Auto(String numMatricula, String marca, String modelo, int año, int numPuertas) {
        super(numMatricula, marca, modelo, año);
        this.numPuertas = numPuertas;
    }

    public int getNumPuertas() {
        return numPuertas;
    }

    public void setNumPuertas(int numPuertas) {
        this.numPuertas = numPuertas;
    }

    @Override
    public double calcularCostoReserva(double tarifaBase, int dias) {
        return tarifaBase * dias;
    }

    @Override
    public String toString() {
        return "Auto [numPuertas=" + numPuertas + ", numMatricula=" + numMatricula + ", marca=" + marca + ", modelo=" + modelo + ", año=" + año + "]";
    }
}
