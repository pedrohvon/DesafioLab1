public class Produto {

    //atributos
    private String nome;
    private double preco;
    private Data dataValidade;
    
    //metodo construtor 
    public Produto (String nome, double preco, Data dataValidade){
        this.nome = nome;
        this.preco = preco;
        this.dataValidade = dataValidade;
    }

    public Produto(String string, int i, Data d1) {
    }

    //método estaVencido
    public boolean estaVencido (Data dataAtual){
        if (this.dataValidade.getAno() < dataAtual.getAno()){
            return true;
        }else if (this.dataValidade.getAno() == dataAtual.getAno()){
            if (this.dataValidade.getMes() < dataAtual.getMes()){
                return  true;
            }else if (this.dataValidade.getMes() == dataAtual.getMes()){
                if (this.dataValidade.getDia() < dataAtual.getDia()){
                    return  true;
                }
            }
        }
        return false; 
    }
    
    //getters e setters 
    public String getNome(){
        return nome;
    }

    public void setNome(String nome){
        this.nome = nome;
    }

    public double getPreco(){
        return preco;
    }

    public void setPreco(double preco){
        this.preco = preco;
    }

    public Data getDataValiadade(){
        return dataValidade;
    }

    public void setDataValidade(Data dataValidade){
        this.dataValidade = dataValidade;
    }
    public Produto[] getEstoqueProdutos() {
        return getEstoqueProdutos();
    }

    public void setEstoqueProdutos(Produto[] estoqueProdutos) {
    }
    
    //método toString
    @Override
    public String toString(){
        return "Produto { nome = " + nome + " preco " + preco + " dataValidade " + dataValidade + "}";
    }

    public Object getDataValidade() {
        throw new UnsupportedOperationException("Unimplemented method 'getDataValidade'");
    }
}
