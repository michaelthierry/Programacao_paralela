/**
 * Definindo a prioridade das threads com priority
 */
public class Main {
    public static void main(String[] args) {
        //Criando as tarefas runnables
        MinhaThreadRunable tr1 = new MinhaThreadRunable("1", 500);
        MinhaThreadRunable tr2 = new MinhaThreadRunable("2", 500);
        MinhaThreadRunable tr3 = new MinhaThreadRunable("3", 500);
        //Criando as threads
        Thread t1 = new Thread(tr1);
        Thread t2 = new Thread(tr2);
        Thread t3 = new Thread(tr3);
        
        //Sentando as prioridades para cada thread
        /*
         * Isso não garante que em 100% dos casos o t1 execute primeiro 
         * mas a chance dele melhora significamente
         */
        t1.setPriority(Thread.MAX_PRIORITY);
        t2.setPriority(Thread.MIN_PRIORITY);
        t3.setPriority(Thread.NORM_PRIORITY);//Por defult toda thread tem a prioridade normal


        //Iniciando as Threads
        t1.start();
        t2.start();
        t3.start();
    }
}
