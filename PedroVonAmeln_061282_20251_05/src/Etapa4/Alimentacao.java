import Etapa1.Loja;

public class Alimentacao extends Loja{

    private Data dataAlvara;

    //construtor

    public Alimentacao(String nome, int quantidadeFuncionarios, int salarioBaseFuncionario, Endereco endereco, Data dataFundacao, Data dataAlvara){
        super(nome, quantidadeFuncionarios);
        this.dataAlvara = dataAlvara;
    }

   //getter
    public Data getDataAlvara() {
        return dataAlvara;
    }

    //setter
    public void setDataAlvara(Data dataAlvara) {
        this.dataAlvara = dataAlvara;
    }

    //sobrescreva toString
    @Override
    public String toString() {
        return super.toString() + "\nData do Alvará: " + 
           (dataAlvara != null ? dataAlvara : "Não informado");
    }   

    @Override
        public String getTipo() {
            return "Alimentação";
    }
    
}
