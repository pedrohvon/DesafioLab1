package Etapa1;

public class Produto {

    //atributos
    private String nome;
    private double preco;
    
    //metodo construtor 
    public Produto (String nome, double preco){
        this.nome = nome;
        this.preco = preco;
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

    //método toString
    @Override
    public String toString(){
        return "Produto { nome = " + nome + " preco " + preco + "}";
    }
}
