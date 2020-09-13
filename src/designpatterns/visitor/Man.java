package designpatterns.visitor;

public class Man extends People {

	public Man(String tpye) {
		super(tpye);
	}

	@Override
	public void accept(Visitor visitor) {
		visitor.getManReply(this);
	}

}
