package peterson;

public class Mainmethod {

    public static void main(String[] args) {
        SharedData d1 = new SharedData();
        Peterson p1 = new Peterson(d1, 0);
        Peterson p2 = new Peterson(d1, 1);

        Thread t1 = new Thread(p1);
        Thread t2 = new Thread(p2);
        t1.start();
        t2.start();
    }

}
