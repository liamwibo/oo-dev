package fact.it.exerciseproduct.model;

public class Product {
    private String name;
    private int amount;
    private double price;

    public Product(String name) {
        this.name = name;
    }

    public Product(String name, int amount, double price) {
        this.name = name;
        this.amount = amount;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String showProduct(){
        return "The product " + this.name + " costs €" + this.price;
    }

    public String showProductWithAmount(){
        return "The product " + this.name +  " (" + this.amount + " pieces in stock) costs €" + this.price;
    }

    public void sell(){
        this.amount = Math.max(0, this.amount - 1);
    }

    public void addStockAmount(int amount){
        if (amount > 0){
            this.amount += amount;
        }
    }
}
