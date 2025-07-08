package br.com.dio.warehouse;

import br.com.dio.warehouse.ui.MenuUI;

public class Main {
    public static void main(String[] args) {
        MenuUI menu = new MenuUI();
        int option = -1;
        while (option != 0) {
            option = menu.showMainMenu();
            switch (option) {
                case 1 -> System.out.println("Verificando estoque...");
                case 2 -> System.out.println("Verificando caixa...");
                case 3 -> System.out.println("Recebendo cestas...");
                case 4 -> System.out.println("Vendendo cestas...");
                case 5 -> System.out.println("Removendo vencidos...");
                case 6 -> System.out.println("Relatório de fornecedores...");
                case 0 -> System.out.println("Saindo...");
                default -> System.out.println("Opção inválida");
            }
        }
    }
}