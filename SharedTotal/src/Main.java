import java.util.*;
public class Main {
    public static void main(String[] args) {
        SharedTotal tot = new SharedTotal(1000);
        try {
            System.out.println(tot.setValAndReceiveTot(5.0));
        } catch (InterruptedException e) {}
    }
}