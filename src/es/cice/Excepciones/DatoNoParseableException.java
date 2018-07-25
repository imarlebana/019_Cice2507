package es.cice.Excepciones;

public class DatoNoParseableException extends Exception {

    public DatoNoParseableException(){
        super("Objeto no parseable");
    }

    public DatoNoParseableException(String msg){
        super(msg);
    }
}
