package Strategy;

public class NiceLoan implements ILoanBehavior {
    @Override
    public void calculate() {
        System.out.println("Hey, I can offer you quite nice loan.");
    }
}
