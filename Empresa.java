import java.util.List;
import java.util.ArrayList;

public class Empresa {
    private String nombre;
    private String ubicacion;
    private int cantidadVehiculos;
    private List<Cliente> clientes;
    private List<Vehiculo> vehiculos;
    private List<Reserva> reservas;

    public Empresa(String nombre, String ubicacion) {
        this.nombre = nombre;
        this.ubicacion = ubicacion;
        this.clientes = new ArrayList<>();
        this.vehiculos = new ArrayList<>();
        this.reservas = new ArrayList<>();
        this.cantidadVehiculos = 0;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getUbicacion() {
        return ubicacion;
    }

    public void setUbicacion(String ubicacion) {
        this.ubicacion = ubicacion;
    }

    public int getCantidadVehiculos() {
        return cantidadVehiculos;
    }

    public void setCantidadVehiculos(int cantidadVehiculos) {
        this.cantidadVehiculos = cantidadVehiculos;
    }

    public List<Cliente> getClientes() {
        return clientes;
    }

    public void setClientes(List<Cliente> clientes) {
        this.clientes = clientes;
    }

    public List<Vehiculo> getVehiculos() {
        return vehiculos;
    }

    public void setVehiculos(List<Vehiculo> vehiculos) {
        this.vehiculos = vehiculos;
    }

    public List<Reserva> getReservas() {
        return reservas;
    }

    public void setReservas(List<Reserva> reservas) {
        this.reservas = reservas;
    }

    public void añadirCliente(Cliente cliente) { clientes.add(cliente); }

    public void añadirVehiculo(Vehiculo vehiculo) { 
        vehiculos.add(vehiculo); 
        cantidadVehiculos++; 
    }

    public void crearReserva(Reserva reserva) { reservas.add(reserva); }

    public void eliminarCliente(Cliente cliente) { clientes.remove(cliente); }

    public void eliminarVehiculo(Vehiculo vehiculo) { 
        vehiculos.remove(vehiculo); 
        cantidadVehiculos--; 
    }

    public void eliminarReserva(Reserva reserva) { reservas.remove(reserva); }

    @Override
    public String toString() {
        return "Empresa [nombre=" + nombre + ", ubicacion=" + ubicacion + ", cantidadVehiculos=" + cantidadVehiculos + ", clientes=" + clientes + ", vehiculos=" + vehiculos + ", reservas=" + reservas + "]";
    }
}
