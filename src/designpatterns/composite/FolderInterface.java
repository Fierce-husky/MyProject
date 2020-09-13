package designpatterns.composite;

/**
 * 文件夹接口
 * @author liuhao
 *
 */
public abstract class FolderInterface {
	
	protected int index;
	
	protected String type;

	public FolderInterface(int index, String type) {
		this.index = index;
		this.type = type;
	}


	public abstract void add(FolderInterface folder);
	public abstract void remove(FolderInterface folder);
	public abstract void show();
}
