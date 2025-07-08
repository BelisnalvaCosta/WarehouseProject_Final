package br.com.dio.warehouse.ui;

import java.util.Scanner;

public class MenuUI {
    private final Scanner scanner = new Scanner(System.in);

    public int showMainMenu() {
        System.out.println("\n== SISTEMA DE ARMAZENAMENTO ==");
        System.out.println("1 - Verificar estoque");
        System.out.println("2 - Verificar caixa");
        System.out.println("3 - Receber Cestas");
        System.out.println("4 - Vender Cestas");
        System.out.println("5 - Remover vencidos");
        System.out.println("6 - Relatório de fornecedores");
        System.out.println("0 - Sair");
        return scanner.nextInt();
    }
}