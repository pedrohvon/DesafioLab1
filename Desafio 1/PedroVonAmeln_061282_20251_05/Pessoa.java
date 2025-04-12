public class Pessoa {
    

    //atributos - privados
    private String nome; //armazena dado
    private int idade; //armazena dado
    public String sexo;

    //metodos 

    //construtor com passagem de parametro
    public Pessoa(String nome, int idade){  
       this.nome = nome;
       this.idade = idade;
       this.sexo = sexo;
    } 


    //get e set 
    public String getNome(){ //
        return nome; //retornar o atributo nome da memoria
    }

    public void setNome(String nome){
        this.nome = nome; //atribui nome 
    }

    public int getIdade(){
        return idade;
    }

    public void setIdade(int idade){
        this.idade = idade;
    }

    //toString sobre escrita de metodo
    @Override
    public String toString(){
        return "Pessoa { nome = " + nome + " idade = " + idade + "}"; 
    }
}






























}
