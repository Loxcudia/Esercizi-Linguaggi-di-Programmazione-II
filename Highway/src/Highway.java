import java.util.*;
public class Highway {

    private int highwayLenght;

    private int[] cars; //ogni indice corrisponde ad un km, e in ogni cella c'è il numero di automobili presenti nel corrispondente kilometro


    public Highway(int highwayLenght)
    {
        this.highwayLenght = highwayLenght;
        this.cars = new int[highwayLenght + 1];
    }

    public synchronized void insertCar(int x)
    {
        this.cars[x + 1]++;
    }

    public int nCars(int x)
    {
        return this.cars[x + 1];
    }

    public void progress()
    {
        for(int i = highwayLenght; i > 1; i--)
        {
            this.cars[i] = this.cars[i - 1];
        }
    }

}
