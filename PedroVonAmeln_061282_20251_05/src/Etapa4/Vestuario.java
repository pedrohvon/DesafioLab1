import Etapa1.Loja;

public class Vestuario extends Loja {

    private Boolean produtosImportados;

    //construtor
    public Vestuario(String nome, int quantidadeFuncionarios, int salarioBaseFuncionario, Endereco endereco, Data dataFundacao, Boolean produtosImportados) {
        super(nome, quantidadeFuncionarios);
        this.produtosImportados = produtosImportados;
    }

    //getter
    public boolean getProdutosImportados() {
        return produtosImportados;
    }

    //setter
    public void setProdutosImportados(boolean produtosImportados) {
        this.produtosImportados = produtosImportados;
    }

    //sobrescreva toString
    @Override
    public String toString() {
        return super.toString() + "\nProdutos Importados: " + (produtosImportados ? "Sim" : "Não");
    }

    @Override
        public String getTipo() {
            return "Vestuário";
    }
}
