public class Main {
    public static void main(String[] args) {
        //Criando o programa(1) e setando um Id
        Programa p1 = new Programa();
        p1.setId(1);
        //Criando uma thread, passado o programa criado e executando
        Thread t1 = new Thread(p1);
        t1.start();


        //Criando um o programa(2) e setando o id
        Programa p2 = new Programa();
        p2.setId(2);
        //Criando outra thread, passado o programa e executando
        Thread t2 = new Thread(p2);
        t2.start();

        


    }
}
