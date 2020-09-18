package algorithmstudy;

import java.util.Scanner;

/**
 * 字典序问题
 * a-z 对应1-26，接下来ab,ac,ad,升序一次排列
 * 给定一个升序排列的字母字符串，打印对应的数字
 */
public class LexicographicOrder {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("请输入k的值:");
        int k = input.nextInt();
        String str;
        for (int i = 0; i < k; i++) {
            System.out.print("请输入第" + (i + 1) + "个字符串:");
            str = input.next();

            int num = getNum(str);
            System.out.println(str + "的编码是:" + num);
        }


    }

    /*
     * f(i,k):第i位（共26位对应a-z）字符开头，字符串长度为k的升序
     * 字符串个数（注意是升序字符串，是串的个数）
     * 举个例子就是以a开头，长度为2即f(1,2)就是ab，ac，ad....az这样的字符串一共25个
     * 以b开头，长度为2即f(2,2)就是bc,bd,be...bz这样的字符串一共24个
     */
    public static int f(int i, int k) {
        int sum = 0;
        if (k == 1) {  //如果字符串长度是1，那不管是什么开头的都是只有本身这一种字符串
            return 1;
        } else {
            for (int j = i + 1; j <= 26; j++) {
                //就比如f(1,2)ab-az就是从后面b算到z的个数，因为把a抛弃了所以长度k-1，再次递归，
                //结果发现抛弃了a，长度就变1了，那么长度为1，b开头的字符串就只有本身-->b
                //接着j++来到c开头，也是同理...
                sum += f(j, k - 1);

                //如果是(1,3)abc-abz、acd-acz、ade-adz....ayz很多种，也是通过递归，第一次递归
                //长度变成2.第二次递归长度变成1，就可以相应累加计算了
            }
            return sum;
        }
    }

    /*
     * 此方法用于字符串长度为k的所有字符串的总个数
     * 比如字符串长度为1时，即(a,b,c,d....z)所有的字符总个数为26个,
     * 即f(1,1)+f(2,1)+f(3,1)+f(4,1)+...f(26,1)的和算得是26
     *
     * 字符串长度为2时，即(ab,ac,ad,ae....az)、(bc,bd,be...bz)、(cd,ce...cz)、(yz)
     * 即f(1,2)+f(2,2)+f(3,2)+f(3,3)+f(4,3)+....f(26,2)的和
     * 即调用上面的递归 25+24+23+22+...1=325  ((1+25)*25)/2=325
     *
     * 字符串长度为3时也类似.....
     */
    public static int g(int k) {
        int sum = 0;
        for (int i = 1; i <= 26; i++) {

            sum += f(i, k);
        }
        return sum;
    }

    /*
     * 获取编码值，即求最后的字典序
     */
    public static int getNum(String str) {

        int len = str.length();//计算字符串的长度，比如传入字符串"ab"，则len=2
        int sum = 0;
        for (int i = 1; i < len; i++) {
            //1.计算所有小于len位的各个位的升序字符串的总和
            //比如"ab",len=2,则会计算出字符串长度为1时字符串的总个数即26
            //"abc",则会计算那么len为3，小于len的有1和2所以个数是26+325=351个
            sum += g(i);
        }
        //2.把字符串转换为字符数组
        char[] ch = str.toCharArray();
        int head = ch[0] - 'a' + 1; //比如传入"ab",ch[0]='a',则head='a'-'a'+1=1
        //head=1说明输入的是打头元素a，前面没有
        for (int i = 1; i < head; i++) {
            //3.计算以head字符之前的字符  打头长度为len的字符串个数并加到sum中
            //            //"ab"的话，a就是最前面的了，不需要累加了
            sum += f(i, len);
        }
        //4.计算s字符开头即,剩下的所有字符的字符串个数
        //若"ab",就是计算a字符开头剩下的所有字符串个数
        for (int i = 1, temp = head; i < len; i++) {
            int str2 = ch[i] - 'a' + 1;//获取下一个要计算的首字母如果是"ab",就算得值是2，即b
            int len2 = len - i;//获取新的字符串即当前字符串长度
            for (int j = temp + 1; j < str2; j++) {
                sum += f(j, len2);
            }
            temp = str2;//要放在内循环外，外循环内，放在里面循环一次temp就会往下跳一次
        }


        return sum + 1;//最后加上原字符串
    }
}
