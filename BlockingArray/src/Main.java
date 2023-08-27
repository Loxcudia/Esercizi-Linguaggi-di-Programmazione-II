import java.util.*;
public class Main {
    public static void main(String[] args) {
        BlockingArray<String> array = new BlockingArray <>(10);
        array.put(0, "uno");
        array.put(1, "due");
        System.out.println(array.take(0)) ;
        array.put(1, "tre");
    }
}