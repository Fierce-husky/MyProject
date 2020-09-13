package designpatterns.command;

/**
 * 命令实现类 菜A
 * @author liuhao
 *
 */
public class DishA implements Order{

	private Chef chef;
	
	public DishA(Chef chef) {
		super();
		this.chef = chef;
	}


	@Override
	public void execute() {
		chef.cookingA();
	}

}
