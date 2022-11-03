package chapter10.exercise;

public class CheckingAccount extends BankAccount {
	private SavingsAccount protectedBy;

	public CheckingAccount(int balance) {
		super(balance);
	}

	public CheckingAccount(int balance, SavingsAccount protectedBy) {
		super(balance);
		this.protectedBy = protectedBy;
	}
	
	@Override
	public boolean withdraw(int amount) {
		if (balance >= amount) {
			super.withdraw(amount);
			return true;
		} else {
			if (protectedBy.withdraw(amount - balance)) {
				balance = 0;
				return true;
			} else {
				return false;
			}
		}
	}

	@Override
	public String getAccountType() {
		return "당좌예금";
	}
	
}
