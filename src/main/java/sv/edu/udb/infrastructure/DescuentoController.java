package sv.edu.udb.infrastructure;

import org.springframework.web.bind.annotation.*;
import sv.edu.udb.application.DescuentoPort;
import sv.edu.udb.application.CalcularDescuentoUseCase;


// Convierte esta clase en un adaptador web
@RestController
// Define la ruta del controlador en la web
@RequestMapping("/tienda")

public class DescuentoController {
    // Las dependencias siempre deben apuntar hacia adentro (hacia el Puerto)
    private final DescuentoPort service = new CalcularDescuentoUseCase();

    // Se define el endpoint HTTP GET para recibir peticiones
    @GetMapping("/descuento")
    // @RequestParam extrae los datos de la URL (?nombre=X&precio=Y)
    public String obtenerPrecio(@RequestParam String nombre, @RequestParam double precio) {
        // Llama al puerto de entrada para procesar la logica
        double precioFinal = service.ejecutar(nombre, precio);

        // Retorna la respuesta final al usuario (Adaptador de salida web)
        return "El precio final de " + nombre + " ya con descuento es de: $" + precioFinal;
    }
}