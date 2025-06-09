import Etapa1.Loja;

public class Cosmetico extends Loja {
    private double taxaComercializacao;
   
    public Cosmetico(String nome, int quantidadeFuncionarios, int salarioBaseFuncionario, Data dataFundacao, Endereco endereco, int qtdMaxProdutos, double taxaComercializacao) {
        super(nome, quantidadeFuncionarios);
        this.taxaComercializacao = taxaComercializacao;
    }

    // Getter e Setter para taxaComercializacao
    public void setTaxaComercializacao(double taxaComercializacao) {
        this.taxaComercializacao = taxaComercializacao;
    }

    public double getTaxaComercializacao() {
        return taxaComercializacao;
    }

    @Override
    public String toString() {
        return super.toString() + "\nTaxa de Comercialização: " + taxaComercializacao;
    }
}



    

