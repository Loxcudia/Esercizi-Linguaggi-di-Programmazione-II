/**
 * The type Campo double.
 */
public class CampoDouble implements Campo<Double>{
    public Double somma(Double x, Double y)
    {
        return x + y;
    }
    public Double prodotto(Double x, Double y)
    {
        return x*y;
    }
    public Double getZero()
    {
        return 0.;
    }
    public Double getUno()
    {
        return 1.;
    }
    public Double potenza(Double x, int i) //i è l'esponente della potenza
    {
        if (i == 0)
            return this.getUno();
        else if (i == 1)
            return x;
        else
        {
            for (int k = 0; k < i-1; k++)
                x = prodotto(x, x);
            return x;
        }
    }
}
