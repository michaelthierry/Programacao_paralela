public class Main {
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

        /**A linha abaixo é executado antes das threads terminar*/
        //System.out.println("Programa principal terminou!");

        /**Primeira Solução: com isAlive
         * Enquanto as thread estiverem vivas o programa principal neste ponto
         * vai a mimir, codigo abaixo:
         */
        /*
        while(t1.isAlive() || t2.isAlive() || t3.isAlive()){
            try {
                Thread.sleep(100);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        System.out.println("Programa principal terminou!");
        */

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
            //TODO: handle exception
        }
        System.out.println("Programa principal terminou!");

    }
}
