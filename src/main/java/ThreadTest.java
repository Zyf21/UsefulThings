public class ThreadTest extends Thread {

    @Override
    public void run() {
        System.out.println("I'm Thread! My name is " + getName());
    }
}