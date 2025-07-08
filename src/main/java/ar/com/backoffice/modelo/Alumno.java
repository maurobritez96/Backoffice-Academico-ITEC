package ar.com.backoffice.modelo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;


@Data
@AllArgsConstructor
@NoArgsConstructor
public class Alumno {
    private String nombre;
    private String apellido;
    private String dni;
    private String telefono;
    private String email;
    private String domicilio;

    @Override
    public String toString() {
        return "Alumno{" +
                "Nombre='" + nombre + '\'' +
                ", Apellido='" + apellido + '\'' +
                ", Dni='" + dni + '\'' +
                ", Telefono='" + telefono + '\'' +
                ", Email='" + email + '\'' +
                ", Domicilio='" + domicilio + '\'' +
                '}';
    }
}
