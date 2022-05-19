/**
 * Testando minha thread
 */
public class Main {
    public static void main(String[] args) {
        //Thread com extends de Thread
        //MinhaThread minhathread = new MinhaThread();
        //minhathread.start();

        //Thread com implements runnable
        MinhaThreadRunable minhaThread = new MinhaThreadRunable();
        Thread t = new Thread(minhaThread);
        t.start();
    }
}
