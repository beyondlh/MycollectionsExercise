

public class Customer implements CustomerADT {
	
	private double balance;
	private String name;
	
	public Customer(String name, double balance) {
		this.balance = 0;
		this.name = name;
	}

	public void addBalance(double amount) throws NegativeBalanceException {
		if (this.balance + amount < 0) {
			throw new NegativeBalanceException();
		}
		this.balance = this.balance + amount;
	}

	public double getBalance() {
		return this.balance;
	}

	public String getName() {
		return this.name;
	}

}
