import java.until.scanner;

public class Principal {
    public static void main (String[] args){
        scanner scanner = new Scanner(System.in);
        Loja loja = null;
        Produto produto = null;

        int opcao;

        do{
            System.out.println("\n=== MENU ===");
            System.out.println("(1) Criar uma loja");
            System.out.println("(2) Criar um produto");
            System.out.println("(3) Sair");
            System.out.print("Escolha uma opção: ");
            opcao = scanner.nextInt();
            scanner.nextLine(); //limpar o buffer 

            switch (opcao){
                case1:
                    System.out.print("Nome da loja");
                    String nomeLoja = scanner.nextLine();
                    System.out.print("Quantidade de funcionarios: ");
                    int qtdeFunc = scanner.nextInt();
                    System.out.print("Salário base dos Funcionários: ");
                    double salarioBase = scanner.nextDouble();
                    scanner.nextLine();

                    loja = new Loja(nomeLoja; qtdeFunc; salarioBase);
                    System.out.println("Loja criada com sucesso");
                    break;
                
                case2:
                    System.out.print("Nome do produto: ");
                    String nomeProduto = scanner.nextLine();
                    System.out.print("Preço do produto: ");
                    double precoProduto = scanner.nextDouble();

                    System.out.println("Informe a data de validade");
                    System.out.print("Dia: ");
                    int dia = scanner.nextInt();
                    System.out.print("Mês: ");
                    int mes = scanner.nextInt();
                    System.out.print("Ano: ");
                    int ano = scanner.nextInt();

                    Data dataValidade = new Data(dia, mes, ano);
                    produto = new Produto (nomeProduto, precoProduto, dataValidade);
                    System.out.println("Produto criado com sucesso!");
                    break;

                case3:
                    System.out.println("Saindo...");
                    break;

                default
                    System.out.println("Opção inválida");

                }
            }

            // verificar vencimento e exibir loja
            if (loja != null && produto != null){
                Data dataReferencia = new Data(20, 10, 2023);
                if (produto.estaVencido(dataReferencia)) {
                    System.out.println("PRODUTO VENCIDO");
                } else {
                    System.out.println("PRODUTO NÃO VENCIDO");
                }

                System.out.println(loja.toString());

                loja = null;
                produto = null;
            }
        
        } while (opcao != 3);

        scanner.close();
    }

