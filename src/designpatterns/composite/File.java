package designpatterns.composite;

/**
 * 文件
 * @author liuhao
 *
 */
public class File extends FolderInterface {

	public File(int index, String type) {
		super(index, type);
	}

	@Override
	public void add(FolderInterface folder) {
		//不用实现
	}

	@Override
	public void remove(FolderInterface folder) {
		//不用实现
	}

	@Override
	public void show() {
		System.out.println("第"+index+"层，"+type+"!");
	}

}
