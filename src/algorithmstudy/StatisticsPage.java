package algorithmstudy;

/**
 * 统计数字
 * 给定一个数字n，打印1-n中0-9分别出现的次数
 */
public class StatisticsPage {

    static int[] res = new int[10];

    public static void main(String[] args) {
        Integer number = 1001;
        statisticsPage(number);

        int len = number.toString().length();
        //去掉多余的0的个数
        for (int i = 0; i < len; i++) {
            res[0] -= (int) Math.pow(10, i);
        }
        for (int n : res) {
            System.out.println(n);
        }
    }

    /**
     * 递归统计每个数字出现次数
     * @param number 页码
     */
    private static void statisticsPage(Integer number) {
        String num = number.toString();
        //数字位数
        int len = num.length();
        //终止条件
        if (len == 1) {
            for (int i = 0; i <= number; i++) {
                res[i]++;
            }
            return;
        }
        //最高位数字
        int highBit = number / (int) Math.pow(10, len - 1);
        //该公式计算出除去高位且补0后0~9每个数字出现的次数
        int tmp = (int) ((len - 1) * Math.pow(10, len - 2));
        for (int i = 0; i < 10; i++) {
            res[i] += tmp;
        }
        //计算除0~最高位数（不包括当前最高位）数字出现的次数
        int highBitCount = (int) Math.pow(10, len - 1);
        for (int i = 0; i < highBit; i++) {
            res[i] += highBitCount;
        }
        //如果是101这样的数字，去掉最高位，01中的0会被忽略，此处处理
        String remainder = num.substring(1);
        while (remainder.startsWith("0") && remainder.length() != 1) {
            res[0]++;
            remainder = remainder.substring(1);
        }
        //计算当前最高位数字
        res[highBit] += ((number % (int) Math.pow(10, len - 1)) + 1);
        statisticsPage(Integer.valueOf(num.substring(1)));
    }

}
