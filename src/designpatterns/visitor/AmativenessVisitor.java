package designpatterns.visitor;

public class AmativenessVisitor extends Visitor {

	public AmativenessVisitor(String name) {
		super(name);
	}

	@Override
	public void getManReply(Man man) {
		System.out.println("当"+man.getTpye()+this.name+"时，"+"凡事不懂也要装懂！");
	}

	@Override
	public void getWomanReply(Woman woman) {
		System.out.println("当"+woman.getTpye()+this.name+"时，"+"凡事懂也要装不懂！");

	}

}
