package Quiz;

public class Account {
	
	private String owner;
	private long balance;
	
	Account(String owner, long balance){
		this.owner = owner;
		this.balance = balance;
	}
	
	public String getOwner() {
		return owner;
	}
	public void setOwner(String owner) {
		this.owner = owner;
	}
	public long getBalance() {
		return balance;
	}
	public void setBalance(long balance) {
		this.balance = balance;
	}
	public long deposit(long amount) {
		this.balance += amount;
		return 0;
	}
	public long withdraw(long amount) {
		if(balance>=amount) {
		balance -= amount;	
		}else 
			System.out.println("잔액이 부족합니다");
		return 0;
		
	}
	public static void main(String[] args) {
		Account account = new Account("윤대운", 3000);
		account.deposit(1000);
		account.withdraw(500);
		System.out.println(account.getBalance());
		account.withdraw(4000);
	}
	
	
	
	
	
			
}
