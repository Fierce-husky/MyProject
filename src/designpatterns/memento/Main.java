package designpatterns.memento;

public class Main {

	public static void main(String[] args) {
		Role role = new Role();
		role.setLifeValue(100);
		role.setAttackValue(100);
		System.out.println("初始化状态：");
		System.out.println(role.show());
		
		Caretaker caretaker = new Caretaker();
		caretaker.setMemento(role.saveState());
		
		role.setLifeValue(0);
		role.setAttackValue(0);
		System.out.println("死亡状态：");
		System.out.println(role.show());
		
		//恢复
		role.restoreState(caretaker.getMemento());
		System.out.println("恢复后状态：");
		System.out.println(role.show());
	}

}
