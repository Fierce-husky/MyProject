package designpatterns.strategy;

/**
 * 满减计费计算类
 * @author liuhao
 *
 */
public class CashReturn implements CashStrategy {

	private double moneyCondition;
	private double moneyReturn;
	
	
	public CashReturn(double moneyCondition, double moneyReturn) {
		this.moneyCondition = moneyCondition;
		this.moneyReturn = moneyReturn;
	}

	@Override
	public double acceptCash(double money) {
		double res = money;
		if (money > moneyCondition) {
			res = money - Math.floor(money / moneyCondition) * moneyReturn;
		}
		return res;
	}
	
	public double getMoneyCondition() {
		return moneyCondition;
	}


	public void setMoneyCondition(double moneyCondition) {
		this.moneyCondition = moneyCondition;
	}


	public double getMoneyReturn() {
		return moneyReturn;
	}


	public void setMoneyReturn(double moneyReturn) {
		this.moneyReturn = moneyReturn;
	}



}
