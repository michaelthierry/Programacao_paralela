import java.util.ArrayList;
/*Futuramente essa classe deve se chamar Aeroporto */
public class Teste {
    public static void main(String[] args) {
        /*Criamos a torre de controle
         * Ela tem dois valores booleanos que representam as pistas de pouso e decolagem
         */
        TorredeControle controle = new TorredeControle();

        /*Criamos uma serie de avioes e para cada um passamos a torre de controle */
        Aeronave a1 = new Aeronave("A-01", "TAM", controle);
        Aeronave a2 = new Aeronave("B-01", "GOL", controle);
        Aeronave a3 = new Aeronave("C-01", "TOPDOWN", controle);
        Aeronave b1 = new Aeronave("A-02", "TAM", controle);
        Aeronave b2 = new Aeronave("B-02", "GOL", controle);
        Aeronave b3 = new Aeronave("C-02", "TOPDOWN", controle);
        
        /*Vamos supor que a empresa TOPDOWN paga mais então sua prioridade é maxima */
        a3.setPriority(Thread.MAX_PRIORITY);
        /*Criamos um array list de aeronaves e adicionamos cada aviao */
        ArrayList<Aeronave> aeronaves = new ArrayList<>();

        aeronaves.add(a1);
        aeronaves.add(a2);
        aeronaves.add(a3);
        aeronaves.add(b1);
        aeronaves.add(b2);
        aeronaves.add(b3);
        /*Iniciamos cada aviao */
        for(Aeronave a: aeronaves){
            a.start();
        }
    }
}
