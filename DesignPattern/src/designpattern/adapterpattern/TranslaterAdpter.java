package designpattern.adapterpattern;

public class TranslaterAdpter implements VietNam{

	private England england;
	
	
	public TranslaterAdpter(England england) {
		this.england = england;
	}


	@Override
	public void say(String word) {
		System.out.println("Reading Words ...");
        System.out.println(word);
        String vietnameseWords = this.translate(word);
        System.out.println("Sending Words ...");
        england.receive(vietnameseWords);
	}

	private String translate(String vietnameseWords) {
        System.out.println("Translated!");
        return "Hello";
    }
	
}
