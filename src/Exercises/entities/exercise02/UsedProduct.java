package Exercises.entities.exercise02;

public class UsedProduct extends Product {
    private String manufactureDate;

    public UsedProduct(String name, double price, String manufactureDate) {
        super(name, price);
        this.manufactureDate = manufactureDate;
    }

    public String getManufactureDate() {
        return manufactureDate;
    }

    public void setManufactureDate(String manufactureDate) {
        this.manufactureDate = manufactureDate;
    }

    @Override
    public String toString() {
        return getName() + " $ " + getPrice() + " (Manufacture Date: " + manufactureDate + ")";
    }
}
