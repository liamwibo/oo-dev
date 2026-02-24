package fact.it.exparkingticketmachine.model;

public class ParkingTicketMachine {
    private int price;
    private int balance;
    private int total;

    public ParkingTicketMachine(int price) {
        this.price = price;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

    public int getTotal() {
        return total;
    }

    public void setTotal(int total) {
        this.total = total;
    }

    public void receiveMoney(int money){
        this.balance += money;
    }

    public String showTicket(){
        if (this.balance >= this.price){
            this.balance -= this.price;
            this.total += price;
            if (this.balance != 0){
                return "#-# Parking meter #-# Ticket = " + this.price + " euros #-# (change = " + this.balance + " euros)";
            }
            return "#-# Parking meter #-# Ticket = " + this.price + " euros #-#";
        }
        return "You still need to insert at least " + (this.price - this.balance) + " euros";
    }
}
