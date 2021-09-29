import java.util.Scanner;

public class Sistema {

    private static Scanner entradaTeclado(String mensagem){
        System.out.println(mensagem);
        return new Scanner(System.in);
    }

    public static void menuPrincipal(){
        System.out.println("---Sistema de Gestão de Restaurante---");
        System.out.println("--RESTAURANTE RAPADURA SALGADA--");
        System.out.println("1 - CADASTRE UM PRATO");
        System.out.println("2 - LISTE OS PRATOS");
        System.out.println("3 - SAIR");
    }

    public static Prato cadastrarPrato(){
        String nomeDoPrato = entradaTeclado("Digite o nome do Prato: ").nextLine();
        Double precoDoPrato = entradaTeclado("Digite o preço do Prato: ").nextDouble();
        Prato prato1 = new Prato(nomeDoPrato,precoDoPrato );
        return prato1;
    }

    public static Ingrediente cadastrarIngredientes(){
        String nomeDoIngrediente = entradaTeclado("Digite os ingredientes: ").nextLine();
        Ingrediente ingrediente = new Ingrediente();
        ingrediente.setNomeDoIngrediente(nomeDoIngrediente);
        return ingrediente;
    }

    public static void executa(){
        boolean menu = true;
        Cardapio cardapio = new Cardapio();

        while (menu){


            menuPrincipal();
            int opcaoDigitada = entradaTeclado("Selecione uma opção: ").nextInt();
            switch (opcaoDigitada){
                case 1:
                    Prato prato = cadastrarPrato();
                    int numeroDeIngredientes = entradaTeclado("Digite a quantidade de ingredientes: ").nextInt();
                        for (int i = 0; i < numeroDeIngredientes; i++) {
                        Ingrediente ingrediente = cadastrarIngredientes();
                        prato.adicionaIngredientes(ingrediente);
                    }
                    cardapio.adicionarPrato(prato);
                    break;
                case 2:
                    System.out.println(cardapio.toString());
                    break;
                case 3:
                    System.out.println("Você está saindo do Sistema");
                    menu = false;
                    break;
            }
        }
    }
}



