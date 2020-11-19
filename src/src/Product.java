public class Product {

    private int id;
    private String description;
    private int quantity;
    private double price;
    private double card;
//    private Card card;

    Product(int id, String description, int quantity, double price) {
        this.id = id;
        this.description = description;
        this.quantity = quantity;
        this.price = price;
    }

    Product(int id, String description, int quantity, double price, double card) {
        this.id = id;
        this.description = description;
        this.quantity = quantity;
        this.price = price;
        this.card = card;
    }

    double getTotal() {
        return this.quantity * this.price;
    }

    double getTotalWithCard() {
        double saleProc = card / 100;
        double sale = getTotal() * saleProc;
        return getTotal() - sale;
    }

    void printProduct() {
        System.out.printf("Quantity: %d \tDescription: %s \tPrice: $%.2f \tTotal: $%.2f \n", quantity, description, price, this.card == 0 ? getTotal() : getTotalWithCard());
    }
}