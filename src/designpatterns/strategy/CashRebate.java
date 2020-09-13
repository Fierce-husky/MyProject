package designpatterns.strategy;

/**
 * 折扣收费计算类
 * @author liuhao
 *
 */
public class CashRebate implements CashStrategy{
	private double moneyRebate;
	
	public CashRebate(double moneyRebate) {
		this.setMoneyRebate(moneyRebate);
	}


	@Override
	public double acceptCash(double money) {
		return 0;
	}


	public double getMoneyRebate() {
		return moneyRebate;
	}


	public void setMoneyRebate(double moneyRebate) {
		this.moneyRebate = moneyRebate;
	}

}
