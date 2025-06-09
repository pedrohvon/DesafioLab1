import Etapa1.Loja;

public class Informatica extends Loja{

    private Double seguroEletronico;

    //contrutor
    public Informatica(String nome, int quantidadeFuncionarios, int salarioBaseFuncionario, Endereco endereco, Data dataFundacao, Double seguroEletronico) {
        super(nome, quantidadeFuncionarios);
        this.seguroEletronico = seguroEletronico;
    }

    //getter
    public double getSeguroEletronico() {
        return seguroEletronico;
    }

    //setter
    public void setSeguroEletronico(double seguroEletronico) {
        this.seguroEletronico = seguroEletronico;
    }



    //sobrescreva toString
    @Override
    public String toString() {
        return super.toString() + "\nSeguro de Eletrônico: R$ " + String.format("%.2f", seguroEletronico);
    }
}
