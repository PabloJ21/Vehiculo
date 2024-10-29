public class Main {
    public static void main(String[] args) {
        Empresa empresa = new Empresa("Alquiler de Carros", "Fundadores");
 
        Cliente cliente = new Cliente("Juan Gomez", "1230923923");
        empresa.añadirCliente(cliente);
 
        Vehiculo auto = new Auto("AB132", "Toyota", "Corolla", 2020, 4);
        empresa.añadirVehiculo(auto);
 
        Reserva reserva = new Reserva(100.0, 5); 
        empresa.crearReserva(reserva);
 
        double costoReserva = reserva.calcularCosto(auto);
        System.out.println("Costo de la reserva del auto: " + costoReserva);
    }
 }
 
