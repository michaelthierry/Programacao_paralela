public class TorredeControle extends Thread{
    //As duas pistas que precisamos
    private boolean pistaDecolagem;
    private boolean pistaAterrizagem;
    private Aeronave nave;
    
    //Construtor
    public TorredeControle(){
        this.pistaDecolagem = true;
        this.pistaAterrizagem = true;
       
        this.start();
    }
    //Metodos para manipular as pistas
    public synchronized void setPistaAterrizagem(boolean status){
        pistaAterrizagem = status;
        notifyAll();
    }

    public synchronized void setPistaDecolagem(boolean status){
        pistaDecolagem = status;
        notifyAll();
    }   
    

    public synchronized boolean getPistaDecolagem() {
        return pistaDecolagem;
    }
    public synchronized boolean getPistaAterrizagem() {
        return pistaAterrizagem;
    }
    //Metodo onde estabeleço a forma de escalonamento das pistas
    public void run(){
        
        while(true){
            //pistas trancadas
            setPistaAterrizagem(false);
            setPistaDecolagem(false);
            System.out.println("\u001B[31m"+"Pistas Fechadas"+"\u001B[0m");
            /*Vamos fazer a pista aguardar por uma notificação */
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            //libero as pista
            setPistaAterrizagem(true);
            setPistaDecolagem(true);
            System.out.println("\u001B[32m"+"Pistas Abertas"+"\u001B[0m");
            
            //A mimir
            try {
                Thread.sleep(2000); 
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    public synchronized void aguardaNaPista(){  
        try {
            wait();
        } catch (Exception e) {
            e.printStackTrace();
        }
        notifyAll();

    }
    public synchronized void aguardaSolicitacao(){  
        try {
            wait();
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    public synchronized String empresaPrioritaria(){
        return "GOL";
    }
}
