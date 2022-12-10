package lab11_ecommerce.balance;

import java.util.UUID;

public abstract class Balance {

    private UUID customerId;
    private Double balance;

    public Balance(UUID customerID, Double balance) {
        this.customerId = customerID;
        this.balance = balance;
    }

    public abstract Double addBalance(Double additionalBalance);

    public UUID getCustomerId() {
        return customerId;
    }

    public Double getBalance() {
        return balance;
    }

    public void setBalance(Double balance) {
        this.balance = balance;
    }
}
