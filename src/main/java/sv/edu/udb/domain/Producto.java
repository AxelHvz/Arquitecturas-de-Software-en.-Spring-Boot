package sv.edu.udb.domain;

public class Producto {
    private String nombre; // Guarda el nombre del producto
    private double precioBase; // Guarda el valor original del producto antes del descuento

    // Metodo constructor
    // Inicializa la entidad con los datos específicos
    public Producto(String nombre, double precioBase) {
        this.nombre = nombre;
        this.precioBase = precioBase;
    }

    // Logica de negocio
    // Regla que define como calcular el descuento
    // La regla es independiente de si el precio viene de una DB o memoria local
    public double calcularPrecioConDescuento() {
        // Aplica un 10% de descuento fijo
        return this.precioBase * 0.90;
    }

    // Getters
    // Metodos para acceder a los datos de forma controlada
    public String getNombre() { return nombre; }
    public double getPrecioBase() { return precioBase; }
}