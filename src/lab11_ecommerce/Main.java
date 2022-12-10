package lab11_ecommerce;

import lab11_ecommerce.balance.Balance;
import lab11_ecommerce.balance.CustomerBalance;
import lab11_ecommerce.balance.GiftCardBalance;
import lab11_ecommerce.category.Category;
import lab11_ecommerce.discount.Discount;

import javax.xml.crypto.Data;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.UUID;

import static lab11_ecommerce.StaticConstant.CATEGORY_LIST;

public class Main {

    public static void main(String[] args) throws Exception {

        DataGenerator.createCustomer();
        DataGenerator.createCategory();
        DataGenerator.createProduct();
        DataGenerator.createBalance();
        DataGenerator.createDiscount();

        Scanner scanner = new Scanner(System.in);

        System.out.println("select customer");

        for (int i = 0; i < StaticConstant.CUSTOMER_LIST.size(); i++) {
            System.out.println("Type " + i + " for customer: " + StaticConstant.CUSTOMER_LIST.get(i).getUserName());
        }

        Customer customer = StaticConstant.CUSTOMER_LIST.get(scanner.nextInt());

        Cart cart = new Cart(customer);

        while(true){

            System.out.println("What would you like to do? Just type id for selection");
            for (int i = 0; i < prepateMenuOptions().length; i++) {
                System.out.println(i+ "-"+prepateMenuOptions()[i]);
            }

            int menuSelection = scanner.nextInt();

            switch (menuSelection){
                case 0:
                    for(Category category: CATEGORY_LIST){
                        System.out.println("Category Code: " +category.generateCategoryCode()+ " Category name:"+category.getName());
                    }
                    break;
                case 1:
                    try {
                        for (Product product : StaticConstant.PRODUCT_LIST) {
                            System.out.println("Product code: " + product.getCategoryName() + " Product name: " + product.getName());
                        }
                    }
                    catch(Exception e){
                            System.out.println("Product could not print because category could not be found "+ e.getMessage().split(",")[1] );
                        }
                    break;
                case 2:
                    for(Discount discount:StaticConstant.DISCOUNT_LIST){
                        System.out.println("Discount name: "+discount.getName()+ " Discount Threshold Amount: "+ discount.getThresholdAmount());
                    }
                    break;
                case 3:
                    CustomerBalance cbalance = findCustomerBalance(customer.getId());
                    GiftCardBalance gBalance = findGiftCardBalance(customer.getId());
                    double totalBalance= cbalance.getBalance()+gBalance.getBalance();
                    System.out.println("Total Balance: "+totalBalance);
                    System.out.println("Customer Balance: "+cbalance.getBalance());
                    System.out.println("Gift Card Balance: "+gBalance.getBalance());
                    break;
                case 4:
                    CustomerBalance customerBalance = findCustomerBalance(customer.getId());
                    GiftCardBalance giftCardBalance = findGiftCardBalance(customer.getId());
                    System.out.println("Which Account would you like to add? ");
                    System.out.println("Type 1 for CUstomer Balance: ");
                    System.out.println("Type 2 for Gift Card Balance:");
                    int balanceAccountSelection= scanner.nextInt();
                    System.out.println("How much would you like to add?");
                    double additionAmount=scanner.nextInt();

                    switch (balanceAccountSelection){
                        case 1:
                            customerBalance.addBalance(additionAmount);
                            System.out.println("New Customer Balance: "+customerBalance.getBalance());
                            break;
                        case 2:
                            giftCardBalance.addBalance(additionAmount);
                            System.out.println("New Gift Card Balance:"+giftCardBalance.getBalance());
                            break;
                    }
                    break;
                case 5:

                    Map<Product,Integer> map = new HashMap<>();
                    cart.setProductMap(map);
                    while(true){
                        System.out.println("Which product you want to add to your cart. To exit product selection type : exit");
                        for(Product product:StaticConstant.PRODUCT_LIST){
                            System.out.println("id: "+product.getId()+"price: "+product.getPrice()+
                            " product category: "+product.getCategoryName()+" stock: "+product.getRemaniningstock()+
                                    " product delivery due: "+product.getDeliveryDueDate());
                        }
                        String productId = scanner.next();

                        try {
                            Product product = findProductById(productId);
                            if (!putItemToCartIfStockAvailable(cart, product)) {
                                System.out.println("Not enough stock.Please try again.");
                                continue;
                            }
                        } catch (Exception e) {
                            System.out.println("Product does not exist. please try again");
                            continue;
                        }
                        System.out.println("Do you want to add more product. Type Y to add more, N for exit");
                        String decision = scanner.next();
                        if(!decision.equals("Y")){
                            break;
                        }

                    }
                    break;
                case 6:
                    break;
                case 7:
                    break;
                case 8:
                    break;
                case 9:
                    break;
            }
        }


    }
    private static boolean putItemToCartIfStockAvailable(Cart cart,Product product){
        System.out.println("Please provide product count:");
        Scanner scanner = new Scanner(System.in);
        int count = scanner.nextInt();
        Integer cartCount = cart.getProductMap().get(product);

        if(cartCount !=null &&product.getRemaniningstock()>cartCount+count){
            cart.getProductMap().put(product,cartCount+count);
            return true;
        }else if(product.getRemaniningstock()>=count){
            cart.getProductMap().put(product,count);
            return true;
        }
        return false;
    }

    private static String[] prepateMenuOptions(){
       return new String[]{"List Categories","List Products","List Discounts",
               "See Balance","Add Balance","Place an order","See Cart","See order details","See order details","See yor address","Close App"};
    }
    private static CustomerBalance findCustomerBalance(UUID customerId){

        for(Balance customerBalance:StaticConstant.CUSTOMER_BAlANCE_LIST){
            if(customerBalance.getCustomerId().toString().equals(customerId.toString())){
                return (CustomerBalance) customerBalance;
            }
        }

        CustomerBalance customerBalance = new CustomerBalance(customerId,0d);
        StaticConstant.CUSTOMER_BAlANCE_LIST.add(customerBalance);
        return customerBalance;
    }
    private static GiftCardBalance findGiftCardBalance(UUID customerId){

        for(Balance giftcardBalance:StaticConstant.GIFT_CARD_BALANCE_LIST){
            if(giftcardBalance.getCustomerId().toString().equals(customerId.toString())){
                return(GiftCardBalance) giftcardBalance;
            }
        }
        GiftCardBalance giftCardBalance = new GiftCardBalance(customerId,0d);
        StaticConstant.GIFT_CARD_BALANCE_LIST.add(giftCardBalance);
        return giftCardBalance;
    }
    private static Product findProductById(String productId) throws Exception {
        for(Product product : StaticConstant.PRODUCT_LIST){
            if (product.getId().toString().equals(productId)) {
                return product;
            }
        }
        throw new Exception("Product not found");
    }



    }






/*
    Design Database

    Create menu items
        -Buy Product

    Write Business Logic for these menu items

    ---------------------------------------

    Create Customer
        -With username, email
        -With username, email, address(can have more than one address)

    -Address should be created with these infos:
        -Name, Street, Zipcode, AdditionalLine, State

 */
