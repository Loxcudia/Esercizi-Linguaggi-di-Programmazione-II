public class Main {
    public static void main(String[] args)
    {
        Controller c = new Controller();
        Controller.Function ac = c.addFunction("Aria_Condizionata");
        Controller.Function risc = c.addFunction("Riscaldamento");
        Controller.Function sedile = c.addFunction("Sedile_Riscaldato");

        ac.setIncompatible(risc);
        ac.setIncompatible(sedile);

        ac.turnOn();
        c.printOn();
        System.out.println("−−−−");

        risc .turnOn();
        sedile .turnOn();
        c.printOn();
    }
}