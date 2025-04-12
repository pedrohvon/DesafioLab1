public class main {
    public static void main(String[] args) {
        
        Loja loja1 = new Loja("Loja A", 10, 1500);
        Loja loja2 = new Loja("Loja B", 5);

        System.out.println("Gastos da Loja A:" + loja1.gastoscomsalario());
        System.out.println("Gastos da Loja:B" + loja2.gastoscomsalario());
    
        Loja lojaA = new Loja("Loja Pequena", 5);
        Loja lojaB = new Loja("Loja Média", 15);
        Loja lojaC = new Loja("Loja Grande", 350);

        System.out.println("Tamanho da Loja Pequena: " + lojaA.tamanhodaloja());
        System.out.println("Tamanho da Loja Média: " + lojaB.tamanhodaloja());
       System.out.println("Tamanho da Loja Grande: " + lojaC.tamanhodaloja());
    }