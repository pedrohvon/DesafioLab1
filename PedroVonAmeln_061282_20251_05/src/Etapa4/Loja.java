public class Loja {
    
    //atributos 
    private String nome;
    private int quantidadeFuncionarios;
    private int salarioBaseFuncionario;
    private Endereco endereco; 
    private Data dataFundacao;
    private double taxaComercializacao;
    private Produto [] estoqueProdutos;

    //construtor com passagem de parametro
    public Loja(String nome, int quantidadeFuncionarios, int salarioBaseFuncionario, Endereco endereco, Data dataFundacao, int qtdMaxProdutos, double taxaComercializacao) {  
        this.nome = nome;
        this.quantidadeFuncionarios = quantidadeFuncionarios;
        this.salarioBaseFuncionario = salarioBaseFuncionario;
        this.endereco = endereco;
        this.dataFundacao = dataFundacao;
        this.taxaComercializacao = taxaComercializacao;
        this.estoqueProdutos = new Produto[qtdMaxProdutos];
    }

    //construtor que recebe apenas nome e quantidade de funcionarios 
    public Loja(String nome, int quantfunc, double salarioBase){
        this.nome = nome;
        this.quantidadeFuncionarios = quantfunc;
        this.salarioBaseFuncionario = -1;
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

    // Imprime todos os produtos do estoque
    public void imprimeProdutos() {
    boolean temProduto = false;
    for (Produto p : estoqueProdutos) {
        if (p != null) {
            System.out.println(p);
            temProduto = true;
        }
    }
    if (!temProduto) {
        System.out.println("Nenhum produto no estoque.");
    }
}

    // Insere produto na primeira posição livre do array
    public boolean insereProduto(Produto produto) {
    for (int i = 0; i < estoqueProdutos.length; i++) {
        if (estoqueProdutos[i] == null) {
            estoqueProdutos[i] = produto;
            return true; // inserido com sucesso
        }
    }
    return false; // estoque cheio
}

    // Remove produto com o nome especificado
    public boolean removeProduto(String nomeProduto) {
    for (int i = 0; i < estoqueProdutos.length; i++) {
        if (estoqueProdutos[i] != null &&
            estoqueProdutos[i].getNome().equalsIgnoreCase(nomeProduto)) {
            estoqueProdutos[i] = null;
            return true; // removido com sucesso
        }
    }
    return false; // produto não encontrado
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

    public void setSalarioBaseFuncionario(int salbasfunc){
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

    public double getTaxaComercializacao() {
        return taxaComercializacao;
    }
    public void setTaxaComercializacao(double taxaComercializacao) {
        this.taxaComercializacao = taxaComercializacao;
    }

    public Produto[] getEstoqueProdutos() {
        return estoqueProdutos;
    }
    public void setEstoqueProdutos(Produto[] estoqueProdutos) {
        this.estoqueProdutos = estoqueProdutos;
    }

    
    //metodo toString para exibir infomações da loja 
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Loja: ").append(nome)
          .append("\nFuncionários: ").append(quantidadeFuncionarios)
          .append("\nSalário Base: ").append(salarioBaseFuncionario)
          .append("\nEndereço: ").append(endereco)
          .append("\nData de Fundação: ").append(dataFundacao)
          .append("\nProdutos no estoque:");

        boolean temProduto = false;
        for (Produto p : estoqueProdutos) {
            if (p != null) {
                sb.append("\n  - ").append(p.toString());
                temProduto = true;
            }
        }
        if (!temProduto) {
            sb.append(" Nenhum produto cadastrado.");
        }

        return sb.toString();
    }



    
}


