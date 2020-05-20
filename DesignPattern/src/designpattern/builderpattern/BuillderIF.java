package designpattern.builderpattern;

import designpattern.builderpattern.BankAccount.BankAccountBuilder;

public interface BuillderIF {

	BankAccountBuilder name(String name);
	BankAccountBuilder accountNumber(String accountNumber);
	BankAccountBuilder address(String address);
	BankAccountBuilder email(String email);
	BankAccountBuilder newsletter(boolean newsletter);
	BankAccountBuilder mobileBanking(boolean mobileBanking);
	BankAccount build();
	
}
