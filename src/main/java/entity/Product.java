package entity;

public class Product {
    protected long id;
    protected String productName;
    protected float price;
    protected float weight;
    protected String color;
    protected int productCount;

    public Product(long id,String productName,float price, float weight, String color, int productCount){
        this.id = id;
        this.productName = productName;
        this.price = price;
        this.weight = weight;
        this.color = color;
        this.productCount = productCount;
    }
        //Setters
    public void setPrice(int price){
        this.price = price;
    }
    public void setProductCount(int productCount){
        this.productCount = productCount;
    }
        //Getters
    public long setId(){
        return id;
    }

    public String getProductName() {
        return productName;
    }

    public float getWeight() {
        return weight;
    }

    public String getColor() {
        return color;
    }

    public int getProductCount() {
        return productCount;
    }


}
