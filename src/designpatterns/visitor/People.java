package designpatterns.visitor;

/**
 * 人类抽象类
 * @author liuhao
 *
 */
public abstract class People {
	protected String tpye;
	
	
	public String getTpye() {
		return tpye;
	}


	public void setTpye(String tpye) {
		this.tpye = tpye;
	}


	public People(String tpye) {
		this.tpye = tpye;
	}


	public abstract void accept(Visitor visitor);
}
