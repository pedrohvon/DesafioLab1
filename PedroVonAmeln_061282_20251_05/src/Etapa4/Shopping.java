import java.util.Arrays;

public class Shopping {
    private String nome;
    private Endereco endereco;
    private Loja[] lojas;

    public Shopping(String nome, Endereco endereco, int quantidadeMaximaLojas) {
        this.nome = nome;
        this.endereco = endereco;
        this.lojas = new Loja[quantidadeMaximaLojas];
    }

    // Métodos de acesso (getters e setters)
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }

    public Loja[] getLojas() {
        return lojas;
    }

    public void setLojas(Loja[] lojas) {
        this.lojas = lojas;
    }

    // Insere uma loja na primeira posição livre do array
    public boolean insereLoja(Loja lojaInformatica) {
        for (int i = 0; i < lojas.length; i++) {
            if (lojas[i] == null) {
                lojas[i] = lojaInformatica;
                return true;
            }
        }
        return false; // Não há espaço disponível
    }

    // Remove uma loja pelo nome
    public boolean removeLoja(String nomeLoja) {
        for (int i = 0; i < lojas.length; i++) {
            if (lojas[i] != null && lojas[i].getNome().equalsIgnoreCase(nomeLoja)) {
                lojas[i] = null;
                return true;
            }
        }
        return false; // Loja não encontrada
    }

    // Retorna a quantidade de lojas de um determinado tipo
    public int quantidadeLojasPorTipo(String tipo) {
        String[] tiposValidos = {"Cosmético", "Vestuário", "Bijuteria", "Alimentação", "Informática"};
        boolean tipoValido = false;
        for (String t : tiposValidos) {
            if (t.equalsIgnoreCase(tipo)) {
                tipoValido = true;
                break;
            }
        }
        if (!tipoValido) return -1;

        int contador = 0;
        for (Loja loja : lojas) {
            if (loja != null && loja.getTipo().equalsIgnoreCase(tipo)) {
                contador++;
            }
        }
        return contador;
    }

   // Retorna a loja de Informática com o maior seguro eletrônico
    public Informatica lojaSeguroMaisCaro() {
    Informatica lojaMaisCara = null;
    double maiorSeguro = -1.0;

    for (Loja loja : lojas) {
        if (loja instanceof Informatica) {
            Informatica lojaInfo = (Informatica) loja;
            double valorSeguro = lojaInfo.getSeguroEletronico();
            if (lojaMaisCara == null || valorSeguro > maiorSeguro) {
                lojaMaisCara = lojaInfo;
                maiorSeguro = valorSeguro;
            }
        }
    }

    return lojaMaisCara;
}
     @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Shopping other = (Shopping) obj;
        if (nome == null) {
            if (other.nome != null)
                return false;
        } else if (!nome.equals(other.nome))
            return false;
        if (endereco == null) {
            if (other.endereco != null)
                return false;
        } else if (!endereco.equals(other.endereco))
            return false;
        if (!Arrays.equals(lojas, other.lojas))
            return false;
        return true;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Shopping: ").append(nome).append("\n");
        sb.append("Endereço: ").append(endereco).append("\n");
        sb.append("Lojas:\n");
        for (Loja loja : lojas) {
            if (loja != null) {
                sb.append(" - ").append(loja.toString()).append("\n");
            }
        }
        return sb.toString();
    }

    public boolean insereLoja(Informatica lojaInformatica) {
        throw new UnsupportedOperationException("Unimplemented method 'insereLoja'");
    }

    public boolean insereLoja(Bijuteria lojaBijuteria) {
        throw new UnsupportedOperationException("Unimplemented method 'insereLoja'");
    }
}