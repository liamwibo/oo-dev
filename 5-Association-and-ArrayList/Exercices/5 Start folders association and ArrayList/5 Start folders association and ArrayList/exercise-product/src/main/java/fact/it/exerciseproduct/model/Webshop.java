package fact.it.exerciseproduct.model;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class Webshop {
    private String url;
    private ArrayList<Product> productList = new ArrayList<>();

    public Webshop(String url) {
        this.url = url;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public void addProduct(Product product){
        productList.add(product);
    }

    public int getNumberOfProducts(){
        return this.productList.size();
    }

    public String showProductFromProductList(int i){
        if (i < productList.size()){
            Product product = productList.get(i);
            return "The product " + product.getName() + " (" + product.getAmount() + " pieces in stock) costs €" + product.getPrice();
        }
        else {
            return "no product with this index in the list";
        }
    }
}
