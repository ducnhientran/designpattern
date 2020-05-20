package designpattern.brigdepattern.implement;

import designpattern.brigdepattern.abstraction.Account;
import designpattern.brigdepattern.abstraction.Bank;

public class TPBank  extends Bank{

	public TPBank(Account account) {
		super(account);
	}

	@Override
	public void openAccount() {
		System.out.print("Open your account at TPBank is a ");
        account.openAccount();
	}
}
