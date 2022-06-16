/**
 * Criando varias Threads 
 * Metodos isAlive e join
 */
public class Main1 {
    public static void main(String[] args) {
        //Criando as tarefas runnables
        MinhaThreadRunable tr1 = new MinhaThreadRunable("1", 500);
        MinhaThreadRunable tr2 = new MinhaThreadRunable("2", 500);
        MinhaThreadRunable tr3 = new MinhaThreadRunable("3", 500);
        //Criando as threads
        Thread t1 = new Thread(tr1);
        Thread t2 = new Thread(tr2);
        Thread t3 = new Thread(tr3);
        //Iniciando as Threads
        t1.start();
        t2.start();
        t3.start();
        //Tentativa de imprimir quando as threads terminar
        System.out.println("Programa principal terminou!"); 
        /* A linha acima é executada antes das threads terminar
         * Veja o main2 para ver uma possivel solução
         */
    }
}
