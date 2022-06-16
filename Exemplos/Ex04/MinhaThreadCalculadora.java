/*
 * Criando a classe de Thread somadora 
 * Ela te os atributos nome, um vetor de numeros e um atributo compartilhado que é uma
 * calculadora.
 * 
 */
public class MinhaThreadCalculadora implements Runnable {
    private String nome;
    private int[] numeros;
    private static Calculadora c = new Calculadora();
    //Construtor da Thread
    public MinhaThreadCalculadora(String nome, int[] numeros){
        this.nome = nome;
        this.numeros = numeros;
        new Thread(this, nome).start();
    }
    @Override
    public void run(){
        System.out.println(this.nome + " iniciada");
        int soma = c.Somador(this.numeros);
        System.out.println("A soma = "+soma);
        System.out.println(this.nome + " Terminou");
    }
}
