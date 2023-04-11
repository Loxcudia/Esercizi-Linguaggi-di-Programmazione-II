public class VistaWeightException extends Exception{

    VistaWeightException()
    {
        super("Errore: il peso provato ad inserire non è valido. Va inserito un peso che sia maggiore o uguale al parametro Double p");
    }
}
