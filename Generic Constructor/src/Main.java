public class Main {
    public static void main(String[] args) {

        Container<Employee> cont1 = new <String>Container<Employee>("ciao");
        Container<Employee> cont2 = new <Integer>Container<Employee>(new Integer(42));
        Container<Manager> cont3 = new <Integer>Container<Manager>(new Integer(42));
    }
}