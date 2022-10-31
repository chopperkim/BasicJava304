package chapter07.exercise.bank;

public class BankAccount {
	/**
	 * 잔액
	 */
	private int balance;

	public BankAccount(int balance) {
		this.balance = balance;
	}
	/**
	 * 현재 계좌의 잔액
	 * @return balance 잔액
	 */
	public int getBalance() {
		return balance;
	}
	/**
	 * 입금
	 * @param amount
	 */
	public void deposit(int amount) {
		balance += amount;
	}
	/**
	 * 출금
	 * @param amount
	 * @return
	 */
	public boolean withdraw(int amount) {
		if (balance >= amount) {
			balance -= amount;
			return true;
		}
		return false;
	}
	/**
	 * 이체
	 * @param amount
	 * @param otherAccount
	 * @return
	 */
	public boolean transfer(int amount, BankAccount otherAccount) {
		if (withdraw(amount)) {
			otherAccount.deposit(amount);
			return true;
		}
		return false;
	}
}



