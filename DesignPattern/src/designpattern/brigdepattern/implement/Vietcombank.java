package designpattern.brigdepattern.implement;

import designpattern.brigdepattern.abstraction.Account;
import designpattern.brigdepattern.abstraction.Bank;

public class Vietcombank extends Bank{


	public Vietcombank(Account account) {
		super(account);
	}

	@Override
	public void openAccount() {
		 System.out.print("Open your account at VietcomBank is a ");
	     account.openAccount();
	}
}
