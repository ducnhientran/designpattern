package designpattern.builderpattern;

public class BankAccount {
	private String name;
	private String accountNumber;
	private String address;
	private String email;
	private boolean newsletter;
	private boolean mobileBanking;
	
	
	
	public static class BankAccountBuilder implements BuillderIF{
		private String name;
		private String accountNumber;
		private String address;
		private String email;
		private boolean newsletter;
		private boolean mobileBanking;
		
		public BankAccountBuilder() {
	        }

		@Override
		public BankAccountBuilder name(String name) {
			this.name = name;
			return this;
		}

		@Override
		public BankAccountBuilder accountNumber(String accountNumber) {
			this.accountNumber = accountNumber;
			return this;
		}

		@Override
		public BankAccountBuilder address(String address) {
			this.address = address;
			return this;
		}


		@Override
		public BankAccountBuilder email(String email) {
			this.email = email;
			return this;
		}

		@Override
		public BankAccountBuilder newsletter(boolean newsletter) {
			this.newsletter = newsletter;
			return this;
		}

		@Override
		public BankAccountBuilder mobileBanking(boolean mobileBanking) {
			this.mobileBanking = mobileBanking;
			return this;
		}

		@Override
		public BankAccount build() {
			BankAccount bankAccount = new BankAccount();
			bankAccount.setName(this.name);
			bankAccount.setAddress(this.address);
			bankAccount.setEmail(this.email);
			bankAccount.setAccountNumber(this.accountNumber);
			bankAccount.setNewsletter(this.newsletter);
			bankAccount.setMobileBanking(this.mobileBanking);
			return bankAccount;
		}
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAccountNumber() {
		return accountNumber;
	}

	public void setAccountNumber(String accountNumber) {
		this.accountNumber = accountNumber;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public boolean isNewsletter() {
		return newsletter;
	}

	public void setNewsletter(boolean newsletter) {
		this.newsletter = newsletter;
	}

	public boolean isMobileBanking() {
		return mobileBanking;
	}

	public void setMobileBanking(boolean mobileBanking) {
		this.mobileBanking = mobileBanking;
	}
	
	@Override
	public String toString() {
		return "BankAccountBuilder [name=" + name + ", accountNumber="
				+ accountNumber + ", address=" + address + ", email="
				+ email + ", newsletter=" + newsletter + ", mobileBanking="
				+ mobileBanking + "]";
	}
}
