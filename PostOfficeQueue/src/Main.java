
public class Main {
    public static void main(String[] args) throws InterruptedException {
        PostOfficeQueue poq = new PostOfficeQueue(5);
        System.out.println(poq.getFreeDesk());
        poq.deskStart(0);
        System.out.println(poq.getFreeDesk());
        poq.deskStart(1);
        poq.deskStart(2);
        System.out.println(poq.getFreeDesk());
    }
}