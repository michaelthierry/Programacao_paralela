import java.util.ArrayList;

public class Teste {
    public static void main(String[] args) {
        TorredeControle controle = new TorredeControle();


        Aeronave a1 = new Aeronave("A-01", "TAM", controle);
        Aeronave a2 = new Aeronave("B-01", "GOL", controle);
        Aeronave a3 = new Aeronave("C-01", "TOPDOWN", controle);
        Aeronave b1 = new Aeronave("A-02", "TAM", controle);
        Aeronave b2 = new Aeronave("B-02", "GOL", controle);
        Aeronave b3 = new Aeronave("C-02", "TOPDOWN", controle);
        /*Vamos supor que a empresa TOPDOWN paga mais então sua prioridade é maxima */
        a3.setPriority(Thread.MAX_PRIORITY);

        ArrayList<Aeronave> aeronaves = new ArrayList<>();

        aeronaves.add(a1);
        aeronaves.add(a2);
        aeronaves.add(a3);
        aeronaves.add(b1);
        aeronaves.add(b2);
        aeronaves.add(b3);

        for(Aeronave a: aeronaves){
            a.start();
        }

        //a1.start();
        //a2.start();
        //a3.start();
        //b1.start();
        //b2.start();
        //b3.start();
        

        
        //controle.start();
        //a1.start();
        //a2.start();
        //a3.start();


    }
}
