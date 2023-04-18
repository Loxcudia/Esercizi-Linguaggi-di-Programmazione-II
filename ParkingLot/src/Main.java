import java.lang.Thread;
public class Main {
    public static void main(String[] args) throws InterruptedException {
        ParkingLot p = new ParkingLot(10, 10);
        Pair<Integer> pos1 = p.carIn();
        Pair<Integer> pos2 = p.carIn();
        Thread.sleep(1000);
        int sec1 = p.carOut(pos1);
        Thread.sleep(1000);
        int sec2 = p.carOut(pos2);
        System.out.println("("+pos1.getX()+",␣"+pos1.getY()+"),␣"+sec1
        );
        System.out.println("("+pos2.getX()+",␣"+pos2.getY()+"),␣"+sec2
        );
    }
}