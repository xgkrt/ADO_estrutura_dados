package View;

import java.util.Scanner;

public class Menu {

    Scanner sc = new Scanner(System.in);

    public void menu() {
        do {
            System.out.println("""
                    1 - Cadastar o usuário.
                    2 - Listar todos usuários cadastrados.
                    3 - Deletar.
                    4 - Atualizar.
                    0 - Sair.
                    """);

            int opcao = sc.nextInt();

            switch (opcao) {
                case 0: System.out.println("Encerrando o programa."); return;
                case 1: cadastrar(); break;
                case 2: listar(); break;
                case 3: deletar(); break;
                case 4: atualizar(); break;
                default: System.out.println("Opção invalida.");
            }
        } while (true);
    }

    private void cadastrar() {
    }

    private void listar() {
    }

    private void deletar() {
    }

    private void atualizar() {
    }
}
