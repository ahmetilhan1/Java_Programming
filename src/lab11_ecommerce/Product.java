package lab11_ecommerce;

import lab11_ecommerce.category.Category;

import java.time.LocalDateTime;
import java.util.UUID;

public class Product {

    private UUID id;
    private String name;
    private Double price;
    private Integer stock;
    private Integer remaniningstock;
    private UUID categoryid;

    public Product(UUID id, String name, Double price, Integer stock, Integer remaniningstock, UUID categoryid) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.stock = stock;
        this.remaniningstock = remaniningstock;
        this.categoryid = categoryid;
    }

    public UUID getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public Double getPrice() {
        return price;
    }

    public Integer getStock() {
        return stock;
    }

    public Integer getRemaniningstock() {
        return remaniningstock;
    }

    public UUID getCategoryid() {
        return categoryid;
    }
    public String getCategoryName() throws Exception{
        for(Category category: StaticConstant.CATEGORY_LIST){
            if(getCategoryid().toString().equals(category.getId().toString())){
                return category.getName();
            }
        }
        throw new Exception("Category not found, "+ getName());
    }
    public LocalDateTime getDeliveryDueDate() throws Exception{
        for (Category category: StaticConstant.CATEGORY_LIST){
            if(getCategoryid().toString().equals(category.getId().toString())){
                return category.findDeliveryDueDate();
            }
        }
        throw new Exception("Category could not be found");
    }
}
