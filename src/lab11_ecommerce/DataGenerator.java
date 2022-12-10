package lab11_ecommerce;

import lab11_ecommerce.balance.Balance;
import lab11_ecommerce.balance.CustomerBalance;
import lab11_ecommerce.balance.GiftCardBalance;
import lab11_ecommerce.category.Category;
import lab11_ecommerce.category.Electronic;
import lab11_ecommerce.category.Furniture;
import lab11_ecommerce.discount.AmountBasedDiscount;
import lab11_ecommerce.discount.Discount;
import lab11_ecommerce.discount.RateBasedDiscount;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

public class DataGenerator {

    public static void createCustomer(){

        Address address1Customer1 = new Address("501","Midway Dr.","apt. 103","60056","Illinois");
        Address address2Customer1 = new Address("145","Washington Dr.","apt. 501","60021","Virginia");
        Address address1Customer2 = new Address("322","Seher Dr.","suite 120","40033","Michigan");

        List<Address> customer1AddressList = new ArrayList<>();
        customer1AddressList.add(address1Customer1);
        customer1AddressList.add(address2Customer1);

        Customer customer1 = new Customer(UUID.randomUUID(),"Ahmet","ahmetilhanpolat@gmail.com",customer1AddressList);
        Customer customer2 = new Customer(UUID.randomUUID(),"Ilhan","ahmetilhanpolat1@gmail.com");

        StaticConstant.CUSTOMER_LIST.add(customer1);
        StaticConstant.CUSTOMER_LIST.add(customer2);
    }

    public static void createCategory(){

        Category category1 = new Electronic(UUID.randomUUID(),"Electronic");
        Category category2 = new Furniture(UUID.randomUUID(),"Furniture");
        Category category3 = new Furniture(UUID.randomUUID(),"SkinCare");

        StaticConstant.CATEGORY_LIST.add(category1);
        StaticConstant.CATEGORY_LIST.add(category2);
        StaticConstant.CATEGORY_LIST.add(category3);
    }

    public static void createProduct(){

        Product product1 =
                new Product(UUID.randomUUID(),"PS5",1200.0,10,7,StaticConstant.CATEGORY_LIST.get(0).getId());
        Product product2 =
                new Product(UUID.randomUUID(),"XBOX",562.2,20,20,StaticConstant.CATEGORY_LIST.get(0).getId());
        Product product3 =
                new Product(UUID.randomUUID(),"Chair",10.2,50,50,StaticConstant.CATEGORY_LIST.get(1).getId());
        Product product4 =
                new Product(UUID.randomUUID(),"Face Creme",20.0,100,100,UUID.randomUUID());

        StaticConstant.PRODUCT_LIST.add(product1);
        StaticConstant.PRODUCT_LIST.add(product2);
        StaticConstant.PRODUCT_LIST.add(product3);
        StaticConstant.PRODUCT_LIST.add(product4);
    }

    public static void createBalance(){

        Balance customerBalance = new CustomerBalance(StaticConstant.CUSTOMER_LIST.get(0).getId(),450.00);
        Balance giftCardBalance = new GiftCardBalance(StaticConstant.CUSTOMER_LIST.get(1).getId(),500.00);

        StaticConstant.CUSTOMER_BAlANCE_LIST.add(customerBalance);
        StaticConstant.GIFT_CARD_BALANCE_LIST.add(giftCardBalance);

    }

    public static void createDiscount(){

        Discount amountBasedDiscount = new AmountBasedDiscount(UUID.randomUUID(),"Buy 250 Free 50",250.00,50.0);
        Discount rateBasedDiscount = new RateBasedDiscount(UUID.randomUUID(),"Buy 500 Free %10",500.0,10.0);

        StaticConstant.DISCOUNT_LIST.add(amountBasedDiscount);
        StaticConstant.DISCOUNT_LIST.add(rateBasedDiscount);
    }
}
