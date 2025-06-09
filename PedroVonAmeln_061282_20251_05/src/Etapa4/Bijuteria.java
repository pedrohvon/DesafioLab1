import Etapa1.Loja;


public class Bijuteria extends Loja {

    private Double metaVendas;

    //contrutor
    public Bijuteria(String nome, int quantidadeFuncionarios, int salarioBaseFuncionario, Endereco endereco, Data dataFundacao, int metaVendas){
        super(nome, quantidadeFuncionarios);
        this.metaVendas = (double) metaVendas;
    }

    //getter
    public double getMetaVendas() {
        return metaVendas;
    }

    //setter
    public void setMetaVendas(double metaVendas) {
        this.metaVendas = metaVendas;
    }

    //sobrescreva toString
    @Override
    public String toString() {
        return super.toString() + "\nMeta de Vendas: R$ " + String.format("%.2f", metaVendas);
    }

    @Override
        public String getTipo() {
            return "Bijuteria";
    }
    
}
