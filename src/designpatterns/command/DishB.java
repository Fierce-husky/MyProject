package designpatterns.command;

/**
 * 命令实现类 菜B
 * @author liuhao
 *
 */
public class DishB implements Order {
	
	private Chef chef;
	
	public DishB(Chef chef) {
		super();
		this.chef = chef;
	}
	@Override
	public void execute() {
		chef.cookingB();
	}

}
