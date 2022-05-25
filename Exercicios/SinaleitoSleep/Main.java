public class Main{
    public static void main(String[] args) {
        Thread semaforo1 = new Thread(new SemaforoSleep(), "1");
        Thread semaforo2 = new Thread(new SemaforoSleep(), "2");
        
        semaforo2.start();
        semaforo1.start();
    }
}
