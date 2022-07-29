/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entity;

/**
 *
 * @author ADMIN
 */
public class Product {
    private int idProdut;
    private int idAdmin;
    private int idPrt;
    private String name;
    private String des;
    private int quantity;
    private int price;
    private String color;
    private String size;
    
    public Product() {
        
    }

    public Product(int idProdut, int idAdmin, int idPrt, String name, String des, int quantity, int price, String color, String size) {
        this.idProdut = idProdut;
        this.idAdmin = idAdmin;
        this.idPrt = idPrt;
        this.name = name;
        this.des = des;
        this.quantity = quantity;
        this.price = price;
        this.color = color;
        this.size = size;
    }

    public int getIdProdut() {
        return idProdut;
    }

    public void setIdProdut(int idProdut) {
        this.idProdut = idProdut;
    }

    public int getIdAdmin() {
        return idAdmin;
    }

    public void setIdAdmin(int idAdmin) {
        this.idAdmin = idAdmin;
    }

    public int getIdPrt() {
        return idPrt;
    }

    public void setIdPrt(int idPrt) {
        this.idPrt = idPrt;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDes() {
        return des;
    }

    public void setDes(String des) {
        this.des = des;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }
    
    
}
