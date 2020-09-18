package algorithmstudy;

import java.math.BigDecimal;
import java.util.Arrays;

/**
 * 最大间隙问题
 * 打印给定一排数字在实轴上相邻两个数之间的最大差值
 */
public class MaximumClearance {
    public static void main(String[] args) {
        Double[] arr = {2.3, 3.1, 7.5, 1.5, 6.3};
        Arrays.sort(arr);
        double res = 0;
        for (int i = 0; i < arr.length - 1; i++) {
            double tmp = Math.abs(new BigDecimal(arr[i].toString()).subtract(new BigDecimal(arr[i + 1].toString())).doubleValue());
            if (tmp > res) {
                res = tmp;
            }
        }
        System.out.println(res);
    }
}
