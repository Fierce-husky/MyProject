package designpatterns.strategy;

/**
 * 正常收费计算类
 * @author liuhao
 *
 */
public class CashNormal implements CashStrategy {

	@Override
	public double acceptCash(double money) {
		return money;
	}

}
