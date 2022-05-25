/**
 * Criando uma classe que extends de Thread 
 */
public class MinhaThread extends Thread{
    //Atributos de minhaThread
    private String nome;

    //Construtor
    public MinhaThread(String nome){
        this.nome = nome;
    }

    //Implementando o metodo run()
    public void run(){
        System.out.println(this.nome + " Thread executando");
    }
}
