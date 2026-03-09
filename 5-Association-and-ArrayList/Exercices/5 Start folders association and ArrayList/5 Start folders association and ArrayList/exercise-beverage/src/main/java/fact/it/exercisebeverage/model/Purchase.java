package fact.it.exercisebeverage.model;

public class Purchase {
    private Customer customer;
    private Beverage beverage;
    private int purchasedAmount;

    public Purchase(Customer customer, Beverage beverage, int purchasedAmount) {
        this.customer = customer;
        this.beverage = beverage;
        this.purchasedAmount = purchasedAmount;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public Beverage getBeverage() {
        return beverage;
    }

    public void setBeverage(Beverage beverage) {
        this.beverage = beverage;
    }

    public int getPurchasedAmount() {
        return purchasedAmount;
    }

    public void setPurchasedAmount(int purchasedAmount) {
        this.purchasedAmount = purchasedAmount;
    }

    public String showPurchase(){
        return "Customer " + this.customer.getName() + " bought " + this.purchasedAmount + " bottle(s) of " + this.beverage.getName() + " (" + this.beverage.getAlcoholPercentage() + "%)";
    }
}
