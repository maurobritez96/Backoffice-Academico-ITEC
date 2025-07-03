package ar.com.backoffice.modelo;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Profesor {

    private String nombre;
    private String apellido;
    private String dni;
    private String telefono;
    private String email;
    private String  domicilio;
}
