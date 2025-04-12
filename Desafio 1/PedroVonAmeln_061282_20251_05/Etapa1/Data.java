public class Data {

    //atributos
    private int dia;
    private int mes;
    private int ano;

    //método construtor que valida a Data
    public Data(int dia, int mes, int ano){
        if (dataValida(dia, mes, ano)){
            this.dia = dia;
            this.mes = mes;
            this.ano = ano;
        } else {
            System.out.println("Data inválida! Definindo para 01/01/2000.");
            this.dia = 1;
            this.mes = 1;
            this.ano = 2000;
        }
    }

    //método para verificar se um ano é bissexto
    public boolean verificaAnoBissexto(){
        return (ano % 4 == 0 && ano % 100 != 0) || (ano % 400 == 0);
    }

    //método para validar a data 
    private boolean dataValida(int dia, int mes, int ano){
        if (mes < 1 || mes > 12){
            return false;
        }

        int[] diasPorMes = {31, verificaAnoBissexto() ? 29 : 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

        return dia >= 1 && dia <= diasPorMes[mes - 1];
    }

    //getters e setters
    public int getDia(){
        return dia;
    }

    public void setDia(int dia){
        if (dataValida(dia, this.mes, this.ano)){
            this.dia = dia;
        } else{
            System.out.println("Dia Inválido!");
        }
    }

    public int getMes(){
        return mes;
    }

    public void setMes(int mes){
        if (dataValida(this.dia, mes, this.ano)){
            this.mes=mes;
        } else {
            System.out.println("Mês Inválido!");
        }
    }

    public int getAno(){
        return ano;
    }

    public void setAno(int ano){
        if (dataValida(this.dia, this.mes, ano)){
            this.ano = ano;
        } else{
            System.out.println("Ano Inválido!");
        }
    }

    //método toString 
    @Override
    public String toString(){
        return String.format("%02d/%02d/%04d", dia, mes, ano);
    }
    
}
