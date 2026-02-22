package sv.edu.udb;

import org.junit.jupiter.api.Test;
import sv.edu.udb.domain.Producto;
import static org.junit.jupiter.api.Assertions.assertEquals;

// Clase para probar la logica de negocio sin usar la web
public class ProductoDescuentoTest {

    @Test
    void CalcularDescuentoDelDiezPorCiento() {
        // Creamos un producto con unnnombre y um valor de 100 dolares
        Producto producto = new Producto("Escritorio color negro", 100.0);

        // Se configura lo necesario para la prueba, un producto de 100 dolares en este caso
        double resultado = producto.calcularPrecioConDescuento();

        // Se verifica que el resultado sea 90.0
        assertEquals(90.0, resultado, "El descuento debe ser del 10%");
    }
}