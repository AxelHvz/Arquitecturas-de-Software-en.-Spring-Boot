package sv.edu.udb.domain.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

@Entity
public class Contact {

    @Id
    @GeneratedValue
    private int id;
    private String nombre;
    private String correo;

    //Constructor vacio para el JPA
    public Contact() {}

    //Constructor con parametros para pruebas
    public Contact(String nombre, String correo) {
        this.nombre = nombre;
        this.correo = correo;
    }

    //Getters y Setters
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

}
