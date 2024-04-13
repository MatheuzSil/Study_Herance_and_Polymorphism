package Exercises.entities.exercise02;

public class ImportedProduct extends Product {
    private Double customsFee;

    public ImportedProduct(String name, double price, Double customsFee) {
        super(name, price);
        this.customsFee = customsFee;
    }

    public Double getCustomsFee() {
        return customsFee;
    }

    public void setCustomsFee(Double customsFee) {
        this.customsFee = customsFee;
    }

    @Override
    public String toString() {
        return  getName() + " $ " + getPrice() + " (Customs fee: " + customsFee + ")";


    }
}
