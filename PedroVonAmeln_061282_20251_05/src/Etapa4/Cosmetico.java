public class Cosmetico extends Loja {
    private double taxaComercializacao;
   
    
    public Cosmetico(String nome, int quantidadeFuncionarios, int salarioBaseFuncionario, Endereco endereco, Data dataFundacao, int qtdMaxProdutos) {
        super(nome, quantidadeFuncionarios, qtdMaxProdutos);
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

    @Override
        public String getTipo() {
            return "Cosmético";
    }

    

}

    




    

