package br.com.dio.warehouse.service;

import java.util.List;
import br.com.dio.warehouse.model.BasicBasket;

public class NotificationService {
    public void alertOutOfDate(List<BasicBasket> expiredItems) {
        if (!expiredItems.isEmpty()) {
            System.out.println("⚠ Atenção! Há itens vencidos no estoque!");
        }
    }

    public void alertLowStock(int currentStock) {
        if (currentStock < 10) {
            System.out.println("⚠ Estoque abaixo do mínimo!");
        }
    }
}