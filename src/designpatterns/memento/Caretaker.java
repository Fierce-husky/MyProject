package designpatterns.memento;

/**
 * 管理者类
 * @author liuhao
 *
 */
public class Caretaker {
	private RoleMemento memento;

	public RoleMemento getMemento() {
		return memento;
	}

	public void setMemento(RoleMemento memento) {
		this.memento = memento;
	}
	
	
}
