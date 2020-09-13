package designpatterns.visitor;

public class FailVisitor extends Visitor {

	public FailVisitor(String name) {
		super(name);
	}

	@Override
	public void getManReply(Man man) {
		System.out.println("当"+man.getTpye()+this.name+"时，"+"闷头喝酒，谁也不用劝！");
	}

	@Override
	public void getWomanReply(Woman woman) {
		System.out.println("当"+woman.getTpye()+this.name+"时，"+"眼泪汪汪，谁也劝不了！");
	}

}
