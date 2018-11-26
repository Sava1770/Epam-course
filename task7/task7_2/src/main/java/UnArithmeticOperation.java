public class UnArithmeticOperation {

    private double variable;

    public UnArithmeticOperation(){
        variable = 13.2d;
    }

    public UnArithmeticOperation(double variable){
        this.variable = variable;
    }

    public double getH() {
        return variable;
    }

    public void setH(double variable) {
        this.variable = variable;
    }

    @Override
    public String toString() {
        return String.valueOf(variable);
    }

    public void increment(){
        variable++;
    }

    public void decrement(){
        variable--;
    }

    public void markChange(){
        variable = (-variable);
    }
}
