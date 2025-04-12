public class Endereço {

    //atributos
    private String nomeDaRua;
    private String cidade;
    private String pais;
    private String cep;
    private String numero;
    private String complemento;

    //método construtor 
    public Endereço(String nomeDaRua, String cidade, String pais, String cep, String numero, String complemento){
        this.nomeDaRua = nomeDaRua;
        this.cidade = cidade;
        this.pais = pais;
        this.cep = cep;
        this.numero = numero;
        this.complemento = complemento;
    }

    //método toString
    @Override
    public String toString(){
        return "Endereco { nomeDaRua = " + nomeDaRua + " cidade = " + cidade + " pais " + pais + " cep " + cep + " numero " + numero + " complemento " + complemento +"}"; 
    }

    
}
