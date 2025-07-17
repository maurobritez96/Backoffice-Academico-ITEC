package ar.com.backoffice.modelo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Carrera {
    private String nombre;
    private List<CicloLectivo> ciclosLectivos;

    public Carrera(String nombre){
        this.nombre = nombre;
        this.ciclosLectivos = new ArrayList<>();
    }
}

