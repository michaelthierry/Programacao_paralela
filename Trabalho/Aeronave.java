public class Aeronave extends Thread{
    /*Atributos da Aeronave */
    private String nome;
    private String nomeEmpresa;
    private double tanque;
    private TorredeControle torre;

    /*Construtor da Aeronave */
    public Aeronave(String nome, String nomeEmpresa, double tanque, TorredeControle torre) {
        this.nome = nome;
        this.nomeEmpresa = nomeEmpresa;
        this.tanque = tanque;
        this.torre = torre;
        //this.start();
    }

    /*Getters and Setters*/
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNomeEmpresa() {
        return nomeEmpresa;
    }

    public void setNomeEmpresa(String nomeEmpresa) {
        this.nomeEmpresa = nomeEmpresa;
    }

    public double getTanque() {
        return tanque;
    }

    public void setTanque(double tanque) {
        this.tanque += tanque;
    }

    /*Sobreecrita de metodo toString*/
    public String toString(){
        return "Aeronave: "+this.nome+" Empresa: "+this.nomeEmpresa;
    }

    /*Funções da aeronave*/
    public void decolar(){
        System.out.println("Aeronave: "+this.nome+" decolou");
    }

    public void aterrizar(){
        System.out.println("Aeronave: "+this.nome+" aterrizou");
    }

    /*Inicialmente vamos fazer a aeronave sobrevoar por um tempo especifico */
    public void voar(){
        try {
            Thread.sleep(2000);
            this.tanque -= 1.0;
        } catch (Exception e) {
            e.printStackTrace();
        }
        if(this.tanque <= 0){
            System.out.println("Aeronave: "+this.nome+" está caindo");
        }else{
            System.out.println("Aeronave: "+this.nome+" está voando");
        }
        
    }

    /* Aqui a Aeronave deve perdir permissão para o torre de controle do aeroporto para decolar ou aterrizar
     * Caso a pista esteja indisponivel ela deve aguardar.*/
    public void run() {
        
        while(true){
            //Aeronave solicita a pista
           
            
            /*Enquando a pista não é liberada a aeronave deve esperar no patio*/ 
            System.out.println("Aeronave: "+this.nome+"\u001B[33m"+" solicita delocagem "+"\u001B[0m"+this.getPriority());
            while(torre.getPistaDecolagem() == false){
                System.out.println("Aeronave: "+this.nome+"\u001B[35m"+" aguardando no patio"+"\u001B[0m");
                torre.aguardaNoPatio(this);
            }
            torre.setPistaDecolagem(false);

            //torre.aguardaPista();
            decolar();
            voar();
            System.out.println("Aeronave: "+this.nome+" solicita aterrizagem");
            //Enquanto a torre não liberar a pista de aterrizagem a aeronave voa
            while(torre.getPistaAterrizagem() == false){
                voar();
            }
            aterrizar();
        }
    }
    
 
}
