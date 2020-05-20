package designpattern.builderpattern;

import designpattern.builderpattern.BankAccount.BankAccountBuilder;

public class App {
	public static void main(String[] args) {
		BankAccount account = 	new BankAccountBuilder()
									.name("NhienTD")
									.address("Quang Tri")
									.accountNumber("12346789")
									.email("ducnhientran071094@gmail.com")
									.mobileBanking(true)
									.newsletter(false)
									.build();
		
		System.out.println(account.toString());
		
	}
}
