/**
 * The type Polinomio.
 *
 * @param <T> the type parameter
 */
public class Polinomio <T> {
    private Campo <T> campoT;
    private T[] coefficienti;

    /**
     * Instantiates a new Polinomio.
     *
     * @param field the field
     * @param coeff the coeff
     */
    public Polinomio(Campo<T> field, T[] coeff)
    {
        coefficienti = coeff;
        campoT = field;
    }

    /**
     * Eval t.
     *
     * @param valore the valore
     * @return the t
     */
    public T eval(T valore)
    {
        T applicazionePolinomiale = campoT.getZero();
        for(int i = 0; i < coefficienti.length; i++)
        {
            if(i == 0)
                applicazionePolinomiale = campoT.somma(applicazionePolinomiale, coefficienti[i]);
            else if(i == 1)
                applicazionePolinomiale = campoT.somma(applicazionePolinomiale, campoT.prodotto(valore, coefficienti[i]));
            else
                applicazionePolinomiale = campoT.somma(applicazionePolinomiale, campoT.prodotto(campoT.potenza(valore, i), coefficienti[i]));
            System.out.println(applicazionePolinomiale);
        }
        return applicazionePolinomiale;
    }
}
