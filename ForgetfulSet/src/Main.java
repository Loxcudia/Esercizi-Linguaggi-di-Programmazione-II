import java.util.*;
public class Main {
    public static void main(String[] args) throws InterruptedException {
        ForgetfulSet<String> s = new ForgetfulSet<String>(1000);
        s .add("uno");
        s .add("due");
        System.out.println(s .contains("uno") + ",␣" + s.contains("due") + ",␣" + s.contains(" tre"));
        Thread.sleep(800);
        s .add("tre");
        System.out.println(s .contains("uno") + ",␣" + s.contains("due") + ",␣" + s.contains(" tre"));
        Thread.sleep(800);
        System.out.println(s .contains("uno") + ",␣" + s.contains("due") + ",␣" + s.contains(" tre"));
    }
}