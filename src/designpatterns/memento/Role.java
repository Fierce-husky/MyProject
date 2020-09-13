package designpatterns.memento;

/**
 * 游戏角色类
 * @author liuhao
 *
 */
public class Role {
	private int lifeValue;
	private int attackValue;
	
	public RoleMemento saveState() {
		return new RoleMemento(lifeValue, attackValue);
	}
	
	public void restoreState(RoleMemento roleMemento) {
		this.attackValue = roleMemento.getAttackValue();
		this.lifeValue = roleMemento.getLifeValue();
	}

	public String show() {
		return "Role [lifeValue=" + lifeValue + ", attackValue=" + attackValue + "]";
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
