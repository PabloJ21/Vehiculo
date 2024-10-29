public class Camioneta extends Vehiculo {
    private double capacidadToneladas;

    public Camioneta(String numMatricula, String marca, String modelo, int año, double capacidadToneladas) {
        super(numMatricula, marca, modelo, año);
        this.capacidadToneladas = capacidadToneladas;
    }

    public double getCapacidadToneladas() {
        return capacidadToneladas;
    }

    public void setCapacidadToneladas(double capacidadToneladas) {
        this.capacidadToneladas = capacidadToneladas;
    }

    @Override
    public double calcularCostoReserva(double tarifaBase, int dias) {
        double porcentajeExtra = calcularPorcentajeExtra();
        return tarifaBase * dias * (1 + porcentajeExtra);
    }

    public double calcularPorcentajeExtra() {
        return capacidadToneladas * 0.1;
    }

    @Override
    public String toString() {
        return "Camioneta [numMatricula=" + numMatricula + ", capacidadToneladas=" + capacidadToneladas + ", marca=" + marca + ", modelo=" + modelo + ", año=" + año + "]";
    }
}
