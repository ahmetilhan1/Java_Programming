package lab11_ecommerce.discount;

import java.util.UUID;

public class RateBasedDiscount extends Discount{

    private Double rateAmount;

    public RateBasedDiscount(UUID id, String name, Double thresholAmount, Double rateAmount) {
        super(id, name, thresholAmount);
        this.rateAmount = rateAmount;
    }

    @Override
    public Double calculateCartAmountAfterDiscountApplied(Double amount) {
        return null;
    }
}
