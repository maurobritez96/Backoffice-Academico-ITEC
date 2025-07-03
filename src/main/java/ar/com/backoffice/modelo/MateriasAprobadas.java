package ar.com.backoffice.modelo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.List;
@Data
@AllArgsConstructor

public class MateriasAprobadas {
    private List<Materia> materiasAprobadas;

    public MateriasAprobadas(){
        this.materiasAprobadas = new ArrayList<>();
    }

}
