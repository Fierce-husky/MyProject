package designpatterns.adapter;

/**
 * 适配器
 * @author liuhao
 *
 */
public class Adapter implements TypeCInterface {
	private OrdinaryAndroidinterface ordinaryInterface = new OrdinaryAndroidinterface();

	@Override
	public void tInterface() {
		System.out.print("type-c接口：");
		ordinaryInterface.oInterface();
	}

}
