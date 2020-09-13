package designpatterns.composite;

public class Main {

	public static void main(String[] args) {
		Folder rootFolder = new Folder(0, "目录");
		Folder oneFolder = new Folder(1, "目录");
		File file1 = new File(1, "文件");
		rootFolder.add(file1);
		rootFolder.add(oneFolder);
		Folder twoFolder = new Folder(2, "目录");
		oneFolder.add(twoFolder);
		File file2 = new File(3, "文件");
		twoFolder.add(file2);
		rootFolder.show();
	}

}
