public class Loja {
    
    //atributos 
    private String nome;
    private int quantidadeFuncionarios;
    private double salarioBaseFuncionario;
    private Endereco endereco; 
    private Data dataFundacao;

    //construtor com passagem de parametro
    public Loja(String nome, int quantidadeFuncionarios, double salarioBaseFuncionario){  
        this.nome = nome;
        this.quantidadeFuncionarios = quantidadeFuncionarios;
        this.salarioBaseFuncionario = salarioBaseFuncionario;
        this.endereco = endereco;
        this.data = dataFundacao;
    }

    //construtor que recebe apenas nome e quantidade de funcionarios 
    public Loja(String nome, int quantfunc){
        this.nome = nome;
        this. quantidadeFuncionarios = quantfunc;
        this.salarioBaseFuncionario = -1;
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

    public double getSalarioBaseFuncionario(){
        return salarioBaseFuncionario;
    }

    public void setSalarioBaseFuncionario(double salbasfunc){
        this.salarioBaseFuncionario = salbasfunc;
    }

    public Endereco getEndereco(){
        return endereco;
    }

    public void setEndereco(Endereco endereco){
        this.endereco = endereco;
    }

    public Data getDataFundacao(){
        return dataFundacao;
    }

    public void setDataFundacao(Data dataFundacao){
        this.dataFundacao = dataFundacao;
    }


    //metodo toString para exibir infomações da loja 
    @Override
    public String toString() {
        return "Loja{" +
                "nome='" + nome + '\'' +
                ", quantidadeFuncionarios=" + quantidadeFuncionarios +
                ", salarioBaseFuncionario=" + salarioBaseFuncionario +
                ", endereco=" + endereco +
                ", dataFundacao=" + dataFundacao +
                '}';
    }
