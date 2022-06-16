public class Main2 {
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

        /**Primeira Solução: com isAlive
         * Enquanto as thread estiverem vivas o programa principal neste ponto
         * vai a mimir, codigo abaixo:
         */
        
        while(t1.isAlive() || t2.isAlive() || t3.isAlive()){
            try {
                Thread.sleep(100);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        System.out.println("Programa principal terminou!");
        /**Essa solução apesar de funcionar não é uma solução legal
         * supondo que os numeros de thread seja grande, a condição do nosso while
         * se tornará gigante. Veja o Main3 para uma solução melhor
         */


    }
}
