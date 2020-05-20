package designpattern.brigdepattern.implement;

import designpattern.brigdepattern.abstraction.Account;

public class CheckingAccount implements Account{

	@Override
	public void openAccount() {
		 System.out.println("Checking Account");
	}

}
