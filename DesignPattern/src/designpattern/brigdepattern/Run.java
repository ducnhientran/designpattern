package designpattern.brigdepattern;

import designpattern.brigdepattern.abstraction.Bank;
import designpattern.brigdepattern.implement.CheckingAccount;
import designpattern.brigdepattern.implement.SavingAccount;
import designpattern.brigdepattern.implement.TPBank;
import designpattern.brigdepattern.implement.Vietcombank;

public class Run {
	public static void main(String[] args) {
		Bank vcb = new Vietcombank(new SavingAccount());
		vcb.openAccount();
		
		Bank tpb = new TPBank(new CheckingAccount());
		tpb.openAccount();
	
	}
}
