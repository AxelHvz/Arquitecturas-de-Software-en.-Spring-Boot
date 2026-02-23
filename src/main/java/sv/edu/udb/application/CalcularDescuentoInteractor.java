package sv.edu.udb.application;

import sv.edu.udb.domain.Producto;

// Implementacion del caso de uso
// Coordina la ejecucion de la logica de negocio
// Implementa el puerto de entrada para cumplir con lo definido
public class CalcularDescuentoInteractor implements DescuentoInput {

    // Sobrescribe el metodo definido en la interfaz
    @Override
    public double ejecutar(String nombre, double precio) {
        // Crea una instancia de la entidad (la regla de negocio)
        Producto producto = new Producto(nombre, precio);

        // Retorna el resultado llamando a la logica interna de la entidad
        return producto.calcularPrecioConDescuento();
    }
}