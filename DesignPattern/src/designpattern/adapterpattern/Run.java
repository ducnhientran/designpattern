package designpattern.adapterpattern;

public class Run {

	public static void main(String[] args) {
		VietNam vn = new TranslaterAdpter(new England());
		vn.say("Xin Chao");
	}
}
