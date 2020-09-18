package algorithmstudy;

/**
 * 最多约数问题
 * 打印给定区间约数最多的数
 */
public class MaximumDivisor {
    public static void main(String[] args) {
        int maxDiv = 0;
        for (int i = 1; i <= 36; i++) {
            int tmp = getDivisor(i);
            if (tmp > maxDiv) {
                maxDiv = tmp;
            }
        }
        System.out.println(maxDiv);
    }

    public static int getDivisor(int number) {
        if (number == 1) {
            return 1;
        }
        //1和这个数本身
        int res = 2;
        for (int i = 2; i < number; i++) {
            if (number % i == 0) {
                res++;
            }
        }
        return res;
    }
}
