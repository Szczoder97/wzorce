package Strategy;

public class Bank {
    private IDepositBehavior depositBehavior;
    private  ILoanBehavior loanBehavior;

    public Bank(IDepositBehavior depositBehavior, ILoanBehavior loanBehavior) {
        this.depositBehavior = depositBehavior;
        this.loanBehavior = loanBehavior;
    }

    public void displayBehaviors(){
        depositBehavior.calculate();
        loanBehavior.calculate();
    }
}
