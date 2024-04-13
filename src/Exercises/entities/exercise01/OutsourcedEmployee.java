package Exercises.entities.exercise01;

public class OutsourcedEmployee extends Employee {

    private  double outsourcedValue;

    public OutsourcedEmployee(String name, Integer hours, Double valuePerHours, Double outsourcedValue) {
        super(name, hours, valuePerHours);
        this.outsourcedValue = outsourcedValue;
    }

    public double getOutsourcedValue() {
        return outsourcedValue;
    }

    public void setOutsourcedValue(double outsourcedValue) {
        this.outsourcedValue = outsourcedValue;
    }

    @Override
    public double payment(){
        return super.payment() + outsourcedValue * 1.1;
    }
}
