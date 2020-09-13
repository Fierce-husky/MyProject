package designpatterns.strategy;

/**
 * 調用策略類的上下文類
 * @author liuhao
 *
 */
public class CashContext {
	private CashStrategy cashStrategy;

	public CashContext(CashStrategy cashStrategy) {
		this.cashStrategy = cashStrategy;
	}
	
	public double acceptCash(double money) {
		return cashStrategy.acceptCash(money);
	}
}
