package designpatterns.strategy;

/**
 * 收费计算类接口
 * @author liuhao
 *
 */
public interface CashStrategy {
	double acceptCash(double money);
}
