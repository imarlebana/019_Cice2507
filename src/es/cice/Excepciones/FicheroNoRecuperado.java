package es.cice.Excepciones;

import java.io.FileNotFoundException;
import java.io.IOException;

public class FicheroNoRecuperado extends FileNotFoundException {

    public FicheroNoRecuperado() {
        super("No se encuentra el fichero");
    }

    public FicheroNoRecuperado(String s) {
        super(s);
    }
}
