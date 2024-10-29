public class Reserva {
    private double tarifaBase;
    private int dias;

    public Reserva(double tarifaBase, int dias) {
        this.tarifaBase = tarifaBase;
        this.dias = dias;
    }

    public double getTarifaBase() {
        return tarifaBase;
    }

    public void setTarifaBase(double tarifaBase) {
        this.tarifaBase = tarifaBase;
    }

    public int getDias() {
        return dias;
    }

    public void setDias(int dias) {
        this.dias = dias;
    }

    public double calcularCosto(Vehiculo vehiculo) {
        return vehiculo.calcularCostoReserva(tarifaBase, dias);
    }

    @Override
    public String toString() {
        return "Reserva [tarifaBase=" + tarifaBase + ", dias=" + dias + "]";
    }
}
