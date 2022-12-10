package lab11_ecommerce.discount;

import java.util.UUID;

public class AmountBasedDiscount extends Discount{

    private Double discountAmount;

    public AmountBasedDiscount(UUID id, String name, Double thresholAmount, Double discountAmount) {
        super(id, name, thresholAmount);
        this.discountAmount = discountAmount;
    }

    @Override
    public Double calculateCartAmountAfterDiscountApplied(Double amount) {
        return null;
    }
}
