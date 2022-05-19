public class Main {
    public static void main(String[] args) {
        //Criando um programa e setando um Id
        Programa programa1 = new Programa();
        programa1.setId(1);
        //Criando uma thread passado o programa criado e executando
        Thread t1 = new Thread(programa1);
        t1.start();

        //Crinadoum segundo programa e setando o id
        Programa programa2 = new Programa();
        programa2.setId(2);
        //Criando outro processo passado o o programa e executando
        Thread t2 = new Thread(programa2);
        t2.start();

        


    }
}
