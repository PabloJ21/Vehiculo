public abstract class Vehiculo {
    protected String numMatricula;
    protected String marca;
    protected String modelo;
    protected int año;

    public Vehiculo(String numMatricula, String marca, String modelo, int año) {
        this.numMatricula = numMatricula;
        this.marca = marca;
        this.modelo = modelo;
        this.año = año;
    }

    public String getNumMatricula() {
        return numMatricula;
    }

    public void setNumMatricula(String numMatricula) {
        this.numMatricula = numMatricula;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getAño() {
        return año;
    }

    public void setAño(int año) {
        this.año = año;
    }

    public abstract double calcularCostoReserva(double tarifaBase, int dias);

    @Override
    public String toString() {
        return "Vehiculo [numMatricula=" + numMatricula + ", marca=" + marca + ", modelo=" + modelo + ", año=" + año + "]";
    }
}
