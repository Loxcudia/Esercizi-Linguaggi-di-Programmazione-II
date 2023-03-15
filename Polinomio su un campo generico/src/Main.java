/**
 * The type Main.
 */
public class Main {
    /**
     * Main di prova
     *
     * @param args the input arguments
     */
    public static void main(String[] args)
    {
        Double[] d = {2.0, 3.0, 1.0}; //2 + 3x + x^2
        Polinomio<Double> f = new Polinomio<Double>(new CampoDouble(), d);
        System.out.println(f.eval(2.0));
    }
}