package com.michaelgreene;

public class Main {

    public static void main(String[] args) {

        VipCustomer customer = new VipCustomer();

        System.out.println(customer.getName());
        System.out.println(customer.getEmail());
        System.out.println(customer.getCreditLimit());

        VipCustomer customer2 = new VipCustomer("tim", 1000);

        System.out.println(customer2.getName());
        System.out.println(customer2.getEmail());
        System.out.println(customer2.getCreditLimit());

        VipCustomer customer3 = new VipCustomer("rob", 1000, "rob@email.com");

        System.out.println(customer3.getName());
        System.out.println(customer3.getEmail());
        System.out.println(customer3.getCreditLimit());

    }
}
