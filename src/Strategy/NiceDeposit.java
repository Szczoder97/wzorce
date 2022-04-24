package Strategy;

public class NiceDeposit implements IDepositBehavior{
    @Override
    public void calculate() {
        System.out.println("Hey, I will take your deposit and return it with great interest.");
    }
}
