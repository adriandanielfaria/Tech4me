package entidades;



public class Emprestimo {

    private String nome;
    private Double rendaMensal;
    private Double valorTotal;
    private Integer numDePrestacoes;

    public Emprestimo () {

    }

    public Emprestimo(String nome, Double rendaMensal, Double valorTotal, Integer numDePrestacoes) {
        this.nome = nome;
        this.rendaMensal = rendaMensal;
        this.valorTotal = valorTotal;
        this.numDePrestacoes = numDePrestacoes;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Double getRendaMensal() {
        return rendaMensal;
    }

    public void setRendaMensal(Double rendaMensal) {
        this.rendaMensal = rendaMensal;
    }

    public Double getValorTotal() {
        return valorTotal;
    }

    public void setValorTotal(Double valorTotal) {
        this.valorTotal = valorTotal;
    }

    public Integer getNumDePrestacoes() {
        return numDePrestacoes;
    }

    public void setNumDePrestacoes(Integer numDePrestacoes) {
        this.numDePrestacoes = numDePrestacoes;
    }

    public double prestacoes() {
        return valorTotal / numDePrestacoes;
    }

    public void regras () { 
        if( valorTotal <= rendaMensal * 10 && prestacoes() <= rendaMensal * 0.3 ) {
            System.out.println("Empréstimo aprovado!");
            
        } else {
            System.out.println("Emprestimo negado");
            
        }
        
    }
   
}
