package com.alisher;

public class Main {

    public static void main(String[] args) {

        Products lehem = new Products("lehem",2.50);
        Products coffee = new Products("coffee",12.50);
        Products cake = new Products("cake",25.5);
        Products tea = new Products("tea",8.00);


        Products[] products ={cake,coffee,lehem,tea};

        Order muhamad = new Order(products);

        cake.setPrice(10);
        lehem.setPrice(muhamad.calculatePrice());
        muhamad.printAllProducts();
        System.out.println("you need to pay "+muhamad.calculatePrice());

    }
}