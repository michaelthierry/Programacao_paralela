import java.util.ArrayList;

/*Futuramente essa classe deve se chamar Aeroporto */
public class Teste {
    public static void main(String[] args) {
        /*Criando um Arraylist de empresas */
        ArrayList<Empresa> empresas = new ArrayList<>();
        /*Criando as empresas */
        Empresa e1 = new Empresa("TAM", 100.000);
        Empresa e2 = new Empresa("GOL", 200.000);
        Empresa e3 = new Empresa("TOPDOWN", 300.000);
        /*Adicionado as empresas na lista*/
        empresas.add(e1);
        empresas.add(e2);
        empresas.add(e3);
        /*Criamos a torre de controle
         * Ela tem dois valores booleanos que representam as pistas de pouso e decolagem
         */
        TorredeControle controle = new TorredeControle();


        /*Criamos uma serie de avioes e para cada um passamos a torre de controle */
        Aeronave a1 = new Aeronave("A-01", "TAM", 10.0, controle);
        Aeronave a2 = new Aeronave("B-01", "GOL", 10.0, controle);
        Aeronave a3 = new Aeronave("C-01", "TOPDOWN", 10.0, controle);
        Aeronave b1 = new Aeronave("A-02", "TAM", 10.0, controle);
        Aeronave b2 = new Aeronave("B-02", "GOL", 10.0, controle);
        Aeronave b3 = new Aeronave("C-02", "TOPDOWN", 10.0, controle);
        
        /*Criamos um array list de aeronaves e adicionamos cada aviao */
        ArrayList<Aeronave> aeronaves = new ArrayList<>();

        aeronaves.add(a1);
        aeronaves.add(a2);
        aeronaves.add(a3);
        aeronaves.add(b1);
        aeronaves.add(b2);
        aeronaves.add(b3);

        setPrioridade(aeronaves, empresas);

        /*Iniciamos cada aviao */
        for(Aeronave a: aeronaves){
            a.start();
        }
    }
    public static void setPrioridade(ArrayList<Aeronave> aeronaves, ArrayList<Empresa> empresas){
        for(Aeronave a: aeronaves){
            for(Empresa e: empresas){
                if(a.getNomeEmpresa().equals(e.getNome())){
                    if(e.getOrcamento() > 200.000){
                        a.setPriority(Thread.MAX_PRIORITY);
                        break;
                    }else if(e.getOrcamento() < 200.000){
                        a.setPriority(Thread.MIN_PRIORITY);
                        break;
                    }
                }
            }
        }
    }
}
