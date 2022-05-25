/**
 * Criando uma classe que extends de Thread 
 */
public class MinhaThread extends Thread{
    //Atributos de minhaThread
    private String nome;
    private int tempo;

    //Construtor
    public MinhaThread(String nome, int tempo){
        this.nome = nome;
        this.tempo = tempo;
        this.start();
    }

    //Implementando o metodo run()
    public void run(){
        //Fazendo ele percorrer um laço dez vezes
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
