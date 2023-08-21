
public class Main {
    public static void main(String[] args) {
        VoteBox b = new VoteBox(10);
        b.vote(true);
        System.out.println(b.isDone());
        b.vote(false);
    }
}