package designpatterns.template;

public class Main {
	
	public static void main(String[] args) {
		RichMan richMan = new RichMan();
		PoorMan poorMan = new PoorMan();
		System.out.println("富二代：");
		richMan.run();
		System.out.println();
		System.out.println("穷小伙：");
		poorMan.run();
	}
}
