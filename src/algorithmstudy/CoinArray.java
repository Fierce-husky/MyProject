package algorithmstudy;

/**
 * 金币阵列问题
 * 有m*n枚金币在桌面上排列成一个m行n列的金币阵列。每一枚金币或正面朝上，或背面朝上。用数字表示金币状态，0表示正面朝上，1表示背面朝上。
 * <p>
 * 金币阵列游戏的规则是：
 * （1）每次将任一行金币翻过来放在原来的位置上。
 * （2）每次可以任选2列，交换这2列金币的位置。
 * <p>
 * 任务：给定金币的初始状态和目标状态，编程计算按金币游戏规则，将金币排列从初始状态变换到目标状态所需的最少变换次数。
 */
public class CoinArray {
    //case 1
    private static int[][] source = {{1, 0, 1}, {0, 0, 0}, {1, 1, 0}, {1, 0, 1}};
    private static int[][] target = {{1, 0, 1}, {1, 1, 1}, {0, 1, 1}, {1, 0, 1}};
    //case 2
//    private static int[][] source = {{1, 0, 1}, {0, 0, 0}, {1, 0, 0}, {1, 1, 1}};
//    private static int[][] target = {{1, 1, 0}, {1, 1, 1}, {0, 1, 1}, {1, 0, 1}};

    private static int[][] tempMatrix = new int[4][3];

    private static int rows = 4;
    private static int columns = 3;
    private static int count, best = 9999;

    public static void main(String[] args) {
        /*思路：一、首先将每一列运用列交换作为第1列，
               二、然后对每一行进行判断，如果元素与目标元素不相等，则进行行翻转处理，
               三、最后向后判断后面列是否相同*/

        //一、每一列运用列交换作为第1列
        for (int k = 0; k < columns; k++) {
            //每次操作缓存数组，为了不改变原来数组
            fillTempArr();
            count = 0;
            exchangeColumns(0, k);

            //二、对每一行进行判断，如果元素与目标元素不相等，则进行行翻转处理
            for (int i = 0; i < rows; i++) {
                if (tempMatrix[i][0] != target[i][0])
                    turnoverRow(i);
            }

            //三、向后判断后面列是否相同
            boolean found = true;
            for (int i = 0; i < columns; i++) {
                found = false;

                //1 先判断tempMatrix当前列是否与目标矩阵的当前列相同
                if (isSameColumns(i, i)) {
                    found = true;
                    continue;
                }

                //2 tempMatrix当前列与目标矩阵的当前列不相同时，看tempMatrix当前列之后的列是否与目标矩阵当前列相同
                //  1）若之后有相同的列，则进行列交换操作，继续比较后面的列
                //  2）若之后也没有相同的列，则说明此次变换不能变换成目标矩阵，进行下一种变换尝试
                for (int j = i + 1; j < columns; j++) {
                    if (isSameColumns(i, j)) {
                        exchangeColumns(i, j);
                        found = true;
                        break;
                    }
                }

                if (!found)
                    break;
            }

            if (found)
                best = (count < best) ? count : best;
        }

        if (best < 9999)
            System.out.println("At least " + best + " steps needed to change source to target!");
        else
            System.out.println("Can not change source to target!");
    }

    //turnover one row
    private static void turnoverRow(int i) {
        for (int j = 0; j < columns; j++)
            tempMatrix[i][j] = 1 - tempMatrix[i][j];

        count++;
    }

    private static void fillTempArr() {
        for (int i = 0; i < rows; i++)
            for (int j = 0; j < columns; j++)
                tempMatrix[i][j] = source[i][j];
    }

    //exchange two columns
    private static void exchangeColumns(int i, int j) {
        if (i == j)
            return;

        for (int k = 0; k < rows; k++) {
            int tempValue = tempMatrix[k][i];
            tempMatrix[k][i] = tempMatrix[k][j];
            tempMatrix[k][j] = tempValue;
        }

        if (i != j)
            count++;
    }

    //check whether two columns are same
    private static boolean isSameColumns(int i, int j) {
        boolean isSame = true;
        for (int k = 0; k < rows; k++) {
            if (target[k][i] != tempMatrix[k][j]) {
                isSame = false;

            }
        }
        return isSame;
    }
}
