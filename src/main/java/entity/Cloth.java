package entity;

public class Cloth extends Product {
    int size;
    String material;

    public Cloth(int id,String productName,float price, float weight, String color, int productCount , int size, String material){
        super(id, productName, price, weight, color, productCount);
        this.size = size;
        this.material = material;
    }

    //Getters
    public int getSize(){
        return size;
    }
    public String getMaterial(){
        return material;
    }
}
