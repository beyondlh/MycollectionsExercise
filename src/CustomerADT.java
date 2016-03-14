

public interface CustomerADT {
	public void addBalance(double amount) throws NegativeBalanceException;
	public double getBalance();
	public String getName();
}
