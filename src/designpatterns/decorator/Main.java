package designpatterns.decorator;

public class Main {
	public static void main(String[] args) {
		Person liuhao = new Person();
		liuhao.setName("liuhao");
		TShirts ts = new TShirts(liuhao);//装饰person类
		BigTrouser bt = new BigTrouser(ts);//继续装饰TShirts类
		bt.show();
	}
}
