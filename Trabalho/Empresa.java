/*Definição da classe empresa */
public class Empresa {
    /*Atributos */
    private String nome;
    private double orcamento;
    /*Contrutor */
    public Empresa(String nome, double orcamento){
        this.nome = nome;
        this.orcamento = orcamento;
    }
    /*Getters and Setters */
    public String getNome(){
        return this.nome;
    }
    public double getOrcamento(){
        return this.orcamento;
    }
    public void setNome(String nome){
        this.nome = nome;
    }
    public void setOrcamento(double orcamento){
        this.orcamento = orcamento;
    }
}
