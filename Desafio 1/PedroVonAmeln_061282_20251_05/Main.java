public class Main {
    
    public static void main(String[] args) {
        
        //Criar a classe pessoa
        //alocar em memoria e chamar o construtor
        Pessoa p = new Pessoa("João", 25);
        Pessoa pessoa = new Pessoa("Maria", 21);

        System.out.println("Nome :" + p.getNome() + "idade: " + p.getIdade());
        System.out.println("Nome :" + pessoa.getNome());

        
        p.setIdade(30);
        System.out.println("nome :" + p.getIdade());

        system.out.println(pessoa);

    }

}
