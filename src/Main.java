import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        SistemaBurger sistemaBurger = new SistemaBurger();

        User user = null;

        while (true) {
            System.out.println("\n==============================");
            System.out.println("Bem vindo ao >THE BEST BURGER!<");
            System.out.println("A sua plataforma de avaliação de Hambúrgueres!");
            System.out.println("1- Fazer Login");
            System.out.println("2- Fazer uma avaliação");
            System.out.println("3- Ver todas as avaliações");
            System.out.println("4- Ver o ranking geral de melhores hambúrgueres");
            System.out.println("5- SAIR");
            System.out.println("==============================");

            System.out.print("Digite sua escolha: ");
            int escolha = scanner.nextInt();
            scanner.nextLine();

            switch (escolha) {

                case 1:
                    System.out.print("Digite seu nome: ");
                    String nome = scanner.nextLine();

                    System.out.print("Digite seu Email: ");
                    String email = scanner.nextLine();

                    user = new User(nome, email);
                    sistemaBurger.cadastrarUsuario(user);

                    System.out.println("Login realizado com sucesso!");
                    break;

                case 2:
                    if (user == null) {
                        System.out.println("Você precisa fazer login antes de avaliar!");
                        break;
                    }

                    System.out.print("Digite o nome do Hambúrguer: ");
                    String burgerNome = scanner.nextLine();

                    System.out.print("Digite o local: ");
                    String localNome = scanner.nextLine();

                    Burger burger = new Burger(burgerNome, localNome);

                    System.out.print("Digite a nota (0 a 10): ");
                    int notaBurger = scanner.nextInt();
                    scanner.nextLine();

                    if (notaBurger < 0 || notaBurger > 10) {
                        System.out.println("Nota inválida! Avaliação cancelada.");
                        break;
                    }

                    System.out.print("Digite a sua avaliação: ");
                    String descricaoAvaliacao = scanner.nextLine();

                    Avaliacao avaliacao = new Avaliacao(user, burger, notaBurger, descricaoAvaliacao);
                    sistemaBurger.cadastrarAvaliacao(avaliacao);

                    System.out.println("Avaliação cadastrada com sucesso!");
                    break;

                case 3:
                    System.out.println("\n===== TODAS AS AVALIAÇÕES =====");
                    sistemaBurger.todasAvaliacoes();
                    break;

                case 4:
                    System.out.println("\n===== RANKING GERAL =====");
                    sistemaBurger.rankingBurgers();
                    break;

                case 5:
                    System.out.println("Obrigado por ter usado o The Best Burger, até logo!");
                    scanner.close();
                    return;

                default:
                    System.out.println("Escolha inválida!");
            }
        }
    }
}