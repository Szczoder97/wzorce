package Strategy;

public class BadDeposit implements IDepositBehavior{
    @Override
    public void calculate() {
        System.out.println("Hey, I will take your deposit and return it with no interest.");
    }
}
