package designpatterns.composite;

import java.util.ArrayList;
import java.util.List;

/**
 * 目录
 * @author liuhao
 *
 */
public class Folder extends FolderInterface {

	private List<FolderInterface> folders = new ArrayList<>();
	
	public Folder(int index, String type) {
		super(index, type);
	}

	@Override
	public void add(FolderInterface folder) {
		folders.add(folder);
	}

	@Override
	public void remove(FolderInterface folder) {
		folders.remove(folder);
	}

	@Override
	public void show() {
		System.out.println("第"+index+"层，"+type+"!");
		for (FolderInterface folderInterface : folders) {
			folderInterface.show();
		}
	}

}
