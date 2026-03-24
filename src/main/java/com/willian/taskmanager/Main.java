package com.willian.taskmanager.main;

import com.willian.taskmanager.service.TarefaService;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        TarefaService service = new TarefaService();

        int opcao;

        do {
            System.out.println("\n=== GERENCIADOR DE TAREFAS ===");
            System.out.println("1 - Adicionar tarefa");
            System.out.println("2 - Listar tarefas");
            System.out.println("3 - Concluir tarefa");
            System.out.println("4 - Remover tarefa");
            System.out.println("0 - Sair");

            opcao = scanner.nextInt();
            scanner.nextLine();

            switch (opcao) {

                case 1:
                    System.out.print("Digite a tarefa: ");
                    String titulo = scanner.nextLine();
                    service.adicionarTarefa(titulo);
                    break;

                case 2:
                    service.listarTarefas();
                    break;

                case 3:
                    System.out.print("Índice: ");
                    int c = scanner.nextInt();
                    service.concluirTarefa(c);
                    break;

                case 4:
                    System.out.print("Índice: ");
                    int r = scanner.nextInt();
                    service.removerTarefa(r);
                    break;

                case 0:
                    System.out.println("Saindo...");
                    break;

                default:
                    System.out.println("Opção inválida");
            }

        } while (opcao != 0);

        scanner.close();
    }
}