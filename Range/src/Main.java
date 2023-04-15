public class Main {
    public static void main(String[] args) {
        Range<Integer> a = new Range<>(10, 20);
        Range<Integer> d = new Range<>(19, 30);
        System.out.println(a. isInside (10)) ;
        System.out.println(a. isInside (50)) ;
        Range<String> b = new Range<>("albero", "dirupo"),
        c = new Range<>("casa", "catrame");
        System.out.println(a.isOverlapping(d)) ;
    }
}