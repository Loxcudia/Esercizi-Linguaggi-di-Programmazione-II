/*
Implementare il metodo statico threadRace, che accetta due oggetti Runnable come
argomenti, li esegue contemporaneamente e restituisce 1 oppure 2, a seconda di quale dei
due Runnable è terminato prima.
Implementare due versioni che differiscono per il criterio di terminazione:
1) il metodo termina quando entrambi i Runnable terminano
2) il metodo termina quando almeno un Runnable è terminato
 */
import java.time.LocalTime;
import java.util.*;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;


public class Main {

    //1):
    public static int threadRace(Runnable r1, Runnable r2)
    {
        boolean[] flags = new boolean[2];
        flags[0] = false;
        flags[1] = false;
        final LocalTime[] time1 = new LocalTime[1];
        final LocalTime[] time2 = new LocalTime[1];
        Thread t1 = new Thread()
        {
            @Override
            public void run()
            {
                r1.run();
                time1[0] = java.time.LocalTime.now();
                flags[0] = true;
            }
        };
        Thread t2 = new Thread()
        {
            @Override
            public void run()
            {
                r2.run();
                time2[0] = java.time.LocalTime.now();
                flags[1] = true;
            }
        };
        t1.start();
        t2.start();
        while(!flags[0] || !flags[1]) {}
        return time1[0].compareTo(time2[0]);
    }

    //2):
    public static int threadRaceSecondVersion(Runnable r1, Runnable r2)
    {
        boolean[] flags = new boolean[2];
        flags[0] = false;
        flags[1] = false;
        final LocalTime[] time1 = new LocalTime[1];
        final LocalTime[] time2 = new LocalTime[1];
        Thread t1 = new Thread()
        {
            @Override
            public void run()
            {
                r1.run();
                time1[0] = java.time.LocalTime.now();
                flags[0] = true;
            }
        };
        Thread t2 = new Thread()
        {
            @Override
            public void run()
            {
                r2.run();
                time2[0] = java.time.LocalTime.now();
                flags[1] = true;
            }
        };
        t1.start();
        t2.start();
        while(!flags[0] && !flags[1]) {}
        return time1[0].compareTo(time2[0]);
    }

    public static void main(String[] args) {

    }
}