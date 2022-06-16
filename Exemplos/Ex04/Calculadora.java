/*Criando uma classe Calculadora
 * Ela tem um atributo soma e um metodo que soma os valores contidos em um vetor
 */
public class Calculadora {

    private int soma;
    /*
     * Esse metodo recebe o vetor com os valores executa a soma e retorna o total
     * Caso esse metodo esteja apenas publico as thread não são sincornizada 
     * alterando totalmente o resultado final de cada uma. Isso ocorre porquê as mesma
     * invadem a regiao de codigo apos a outra te-lo alterado. 
     */
    public synchronized int Somador(int[] valores){
        
        soma = 0;

        for(int i = 0; i < valores.length; i++){
            soma += valores[i];

            System.out.println("Executando a soma: "+Thread.currentThread().getName()+ " Somando o valor "+ valores[i]+" com o total de: " +soma);

            try {
                Thread.sleep(1000);
            } catch (Exception e) {
                e.printStackTrace();
            }
        
        }
        return soma;
    }
}
