package ar.com.backoffice.excepciones;

public class NoEncontradoExcepcion extends IndexOutOfBoundsException{

    public NoEncontradoExcepcion (String mensaje){
        super(mensaje);
    }


}
