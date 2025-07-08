package br.com.dio.warehouse.model;

public class Supplier {
    private String name;
    private String cnpj;
    private String contact;

    public Supplier(String name, String cnpj, String contact) {
        this.name = name;
        this.cnpj = cnpj;
        this.contact = contact;
    }

    public String getName() {
        return name;
    }

    public String getCnpj() {
        return cnpj;
    }

    public String getContact() {
        return contact;
    }
}