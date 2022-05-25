/**
 * Testando minha thread
 */
public class Main {
    public static void main(String[] args) {
        /*Thread com extends de Thread
        MinhaThread minhathread = new MinhaThread(); //criando minha thread
        minhathread.start(); // inicializando minha thread
        */
        
        //Thread com implements runnable
        MinhaThreadRunable minhaThread = new MinhaThreadRunable(); //criando um objeto runable
        Thread t = new Thread(minhaThread); // passando meu runable para uma thread
        t.start(); //Rodando minha thread.
        //*/

    }
}
