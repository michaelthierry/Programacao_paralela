public class Main3 {
    public static void main(String[] args) {
        MinhaThreadRunable tr1 = new MinhaThreadRunable("1", 500);
        MinhaThreadRunable tr2 = new MinhaThreadRunable("2", 500);
        MinhaThreadRunable tr3 = new MinhaThreadRunable("3", 500);
        
        Thread t1 = new Thread(tr1);
        Thread t2 = new Thread(tr2);
        Thread t3 = new Thread(tr3);

        t1.start();
        t2.start();
        t3.start();

        /**Segunda Solução: com o join() 
         * Com o join a proxima thread so sera iniciada depois que a tread
         * que chama join terminar ou depois dos milisegundos de que a thread join for inicializada
        */
        
        try {
            t1.join();
            t2.join();
            t3.join();
        } catch (Exception e) {
            e.printStackTrace();
        }
        //A linha abixo só será impressa quando as thread terminarem
        System.out.println("Programa principal terminou!");
        
    }
}
