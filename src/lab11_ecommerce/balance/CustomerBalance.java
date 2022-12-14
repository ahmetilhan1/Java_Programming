package lab11_ecommerce.balance;

import java.util.UUID;

public class CustomerBalance extends Balance{

    public CustomerBalance(UUID customerID, Double balance) {
        super(customerID, balance);
    }

    @Override
    public Double addBalance(Double additionalBalance) {
        setBalance(getBalance() + additionalBalance);
        return getBalance();
    }
}
