/**
 * Campo generico su cui verranno definiti i coefficienti.
 *
 * @param <T> Tipo generico indicante quale campo si sta trattando.
 */
public interface Campo <T>{

    /**
     * Somma t.
     *
     * @param x the x
     * @param y the y
     * @return the t
     */
    T somma (T x, T y);


    /**
     * Prodotto t.
     *
     * @param x the x
     * @param y the y
     * @return the t
     */
    T prodotto (T x, T y);

    /**
     * Gets uno.
     *
     * @return l 'elemento neutro per il prodotto
     */
    T getUno(); //elementro neutro prodotto

    /**
     * Gets zero.
     *
     * @return the zero
     */
    T getZero(); //elemento neutro somma

    /**
     * Potenza t.
     *
     * @param x the x
     * @param i the
     * @return the t
     */
    T potenza(T x, int i);
}
