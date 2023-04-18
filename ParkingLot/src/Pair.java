
import java.time.LocalTime;
import java.util.*;

public class Pair <T extends Number>{
    private T x;
    private T y;
    private LocalTime time;
    public Pair(T x, T y)
    {
        this.x = x;
        this.y = y;
        this.time = LocalTime.now();

    }

    public int getLocalTimeSeconds()
    {
        return this.time.getSecond();
    }

    public T getX()
    {
        return this.x;
    }

    public T getY()
    {
        return this.y;
    }
}
