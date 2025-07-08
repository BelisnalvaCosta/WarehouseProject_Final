package br.com.dio.warehouse.model;

import java.math.BigDecimal;

public class BasicBasket {
    private BigDecimal price;

    public BasicBasket(BigDecimal price) {
        this.price = price;
    }

    public BigDecimal getPrice() {
        return price;
    }
}
