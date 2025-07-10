package ar.com.backoffice.modelo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class CicloLectivo {
    private String ano;
    private List<Materia> materias;
    private Carrera carrera;

    public CicloLectivo(String ano, Carrera carrera){
        this.ano = ano;
        this.carrera = carrera;
        this.materias = new ArrayList<>();
    }

}

