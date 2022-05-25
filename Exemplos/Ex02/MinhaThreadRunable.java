/**
 * Criando a classe MinhaThread que implementa a interface Runnable
 */
public class MinhaThreadRunable implements Runnable{
    //Atributos da minha thread
    private String nome;
    private int tempo;

    /**
     * Construtor da thread 
     * Recebe nome e o tempo de sleep 
     * Após atribuir os campo cria uma thread e passa tudo pra dentro
     */
    public MinhaThreadRunable(String nome, int tempo){
        this.nome = nome;
        this.tempo = tempo;
        //Thread t = new Thread(this);
        //t.start();
    }
    
    //Implementando o metro run
    public void run(){
         for(int i = 0; i < 10; i++){
            System.out.println(this.nome + " Thread executando"+"("+i+")");
            //tenta fazer a thread dormir 1 segundo
            try {
                Thread.sleep(tempo);
            } catch (Exception e) {
                e.printStackTrace();
            }
    
        }
        System.out.println("Thread "+this.nome+" Terminou");
    }
}