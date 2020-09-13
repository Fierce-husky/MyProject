package designpatterns.visitor;

public class SuccessVisitor extends Visitor {

	public SuccessVisitor(String name) {
		super(name);
	}

	@Override
	public void getManReply(Man man) {
		System.out.println("当"+man.getTpye()+this.name+"时，"+"背后大多有一个伟大的女人！");
	}

	@Override
	public void getWomanReply(Woman woman) {
		System.out.println("当"+woman.getTpye()+this.name+"时，"+"背后大多有一个失败的男人！");
	}

}
