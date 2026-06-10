import dao.LivroDAO;
import service.Importador;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        LivroDAO dao = new LivroDAO();
        dao.criarTabela();

        Importador importador = new Importador();

        int opcao;

        do {

            System.out.println("\n===== MENU =====");
            System.out.println("1 - Importar CSV");
            System.out.println("2 - Listar por Título");
            System.out.println("3 - Listar por Ano");
            System.out.println("0 - Sair");
            System.out.print("Escolha: ");

            opcao = sc.nextInt();

            switch (opcao) {

                case 1:
                    importador.importar("livros.csv");
                    break;

                case 2:
                    dao.listarPorTitulo();
                    break;

                case 3:
                    dao.listarPorAno();
                    break;

                case 0:
                    System.out.println("Programa encerrado.");
                    break;

                default:
                    System.out.println("Opção inválida.");
            }

        } while (opcao != 0);

        sc.close();
    }
}