/**
 * Criando uma Thread implementado a interface Runnable
 * - Interface Runnable
 */
public class Main {
    public static void main(String[] args) {
        MinhaThreadRunable tr1 = new MinhaThreadRunable("1", 1000);
        MinhaThreadRunable tr2 = new MinhaThreadRunable("2", 1000);
    }
}
