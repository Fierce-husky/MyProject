package algorithmdesignandanalysis;

/**
 * 01背包问题
 */
public class PackageQuestion {
    public static void main(String[] args) {
//        int[] weight = {1, 3, 5, 7, 1};
//        int[] value = {2, 4, 3, 6, 3};
        int[] weight = {3, 3, 4, 5};
        int[] value = {42, 12, 40, 1};
        int capacity = 10; //容量
//        System.out.println(maxValueForce(weight, value, capacity));
        System.out.println(maxValue(weight, value, capacity));
    }

    /**
     * 暴力求解
     *
     * @param weight 物品重量
     * @param value 物品价值
     * @param capacity 背包重量
     * @return 最大价值
     */
    public static int maxValueForce(int[] weight, int[] value, int capacity) {
        //子集个数
        int row = (int) Math.pow(2, weight.length);
        //每个子集中元素个数，就是物品的个数
        int column = weight.length;
        //物品子集
        int[][] goodsSubset = new int[row][column];
        //最大价值
        int maxValue = 0;
        //填充所有子集
        for (int i = 0; i < row; i++) {
            int temp_1 = i;
            for (int j = 0; j < column; j++) {
                int temp_2 = temp_1 % 2;
                goodsSubset[i][j] = temp_2;
                temp_1 = temp_1 / 2;
            }
        }
        //遍历子集，为每一个子集计算总价值，输出总价值最大的子集
        for (int i = 0; i < goodsSubset.length; i++) {
            int tempWeight = 0;
            int tempValue = 0;
            for (int j = 0; j < goodsSubset[i].length; j++) {
                System.out.print(goodsSubset[i][j] + " ");
                tempWeight += goodsSubset[i][j] * weight[j];
                tempValue += goodsSubset[i][j] * value[j];
            }
            System.out.print("\t" + "总重量为：" + tempWeight);
            if (tempWeight <= capacity) {
                System.out.printf("\t" + "总价值为：" + tempValue);
            } else {
                System.out.printf("\t" + "不可行，超出背包最大承重");
            }
            if (tempWeight <= capacity && tempValue > maxValue) {
                maxValue = tempValue;
            }
            System.out.println();
        }
        System.out.println("最大值：" + maxValue);
        return maxValue;
    }

    /**
     * 动态规划
     *
     * @param weight 物品重量
     * @param value 物品价值
     * @param capacity 背包重量
     * @return 最大价值
     */
    public static int maxValue(int[] weight, int[] value, int capacity) {
        int weightLen = weight.length;
        int valueLen = capacity + 1;//列值长度加1，是因为最后一列要保证重量值为lenColumn
        int[][] v = new int[weightLen][valueLen];//
        for (int i = 0; i < weightLen; i++) {
            for (int j = 0; j < valueLen; j++) {
                if (weight[i] > j) {
                    if (i == 0) {
                        v[i][j] = 0;
                    } else {
                        v[i][j] = v[i - 1][j];
                    }
                } else {
                    int preValue, afterValue;
                    if (i == 0) {
                        preValue = 0;
                        afterValue = value[i];
                    } else {
                        preValue = v[i - 1][j];
                        afterValue = v[i - 1][j - weight[i]] + value[i];
                    }
                    v[i][j] = Math.max(preValue, afterValue);
                }

            }

        }
        //打印列表
        for (int i = 0; i < weightLen; i++) {
            for (int j = 0; j < valueLen; j++) {
                System.out.print(v[i][j] + " ");
            }
            System.out.println();
        }
        return v[weightLen - 1][capacity];
    }
}
