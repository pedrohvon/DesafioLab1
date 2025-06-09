package Etapa1;

public class Loja {
    private String nome;
    private int quantidadeFuncionarios;
    private int salarioBaseFuncionario;
    private Data dataFundacao;
    private Endereco endereco;
    private int qtdMaxProdutos;
    
 
   //construtor com passagem de parametro
    public Loja(String nome, int quantidadeFuncionarios, int salarioBaseFuncionario, Data dataFundacao, Endereco endereco, int qtdMaxProdutos) {
        this.nome = nome;
        this.quantidadeFuncionarios = quantidadeFuncionarios;
        this. salarioBaseFuncionario = salarioBaseFuncionario;
        this.dataFundacao = dataFundacao;
        this.endereco = endereco;   
        this.qtdMaxProdutos = qtdMaxProdutos; 
      
    }

    //construtor que recebe apenas nome e quantidade de funcionarios 
    public Loja(String nome, int quantidadeFuncionarios){
        this.nome = nome;
        this. quantidadeFuncionarios = quantidadeFuncionarios;
        this.salarioBaseFuncionario = (int) -1;
    }

    public String getTipo() {
        return "Loja";
    }

    //método para calcular gastos com salario
    public double gastoscomsalario(){
        if (salarioBaseFuncionario == -1){
            return -1;
        }
        return quantidadeFuncionarios * salarioBaseFuncionario;
    }

    //metodo para determinar o tamanho da loja
    public char tamanhodaloja(){
        if (quantidadeFuncionarios < 10) {
            return 'P'; 
        }
        else if (quantidadeFuncionarios <= 30) {
            return 'M';
        }
        else {
            return 'G';
        }
    }
    //getter e setters
    public String getNome(){
        return nome;
    }

    public void setNome(String nome){
        this.nome = nome;
    }

    public int getQuantidadeFuncionarios(){
        return quantidadeFuncionarios;
    }

    public void setQuantidadeFuncionarios(int quantfunc){
        this.quantidadeFuncionarios = quantfunc;
    }

    public int getSalarioBaseFuncionario(){
        return salarioBaseFuncionario;
    }

    public void setSalarioBaseFuncionario(int salbasfunc){
        this.salarioBaseFuncionario = salbasfunc;
    }
   

    // Método toString
    @Override
    public String toString() {
        return "Loja{" +
                "nome='" + nome + '\'' +
                ", quantidadeFuncionarios=" + quantidadeFuncionarios +
                ", salarioBaseFuncionario=" + salarioBaseFuncionario +
                '}';
    }
    
}


