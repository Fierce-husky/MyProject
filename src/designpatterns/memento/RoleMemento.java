package designpatterns.memento;

/**
 * 备忘录类
 * @author liuhao
 *
 */
public class RoleMemento {
	
	private int lifeValue;
	
	private int attackValue;

	public RoleMemento(int lifeValue, int attackValue) {
		this.lifeValue = lifeValue;
		this.attackValue = attackValue;
	}

	public int getLifeValue() {
		return lifeValue;
	}

	public void setLifeValue(int lifeValue) {
		this.lifeValue = lifeValue;
	}

	public int getAttackValue() {
		return attackValue;
	}

	public void setAttackValue(int attackValue) {
		this.attackValue = attackValue;
	}

}
