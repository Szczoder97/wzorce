package Strategy;

public class BadLoan implements ILoanBehavior{
    @Override
    public void calculate() {
        System.out.println("Hey, you should be careful if you gonna take a loan.");
    }
}
