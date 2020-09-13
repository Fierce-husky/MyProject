package algorithmfourthedition.partone;

import java.io.*;

/**
 * 从中间向两边扩展寻找回文子串
 */
public class PalindromeSubstring {
    
    public static int res = 0;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String line = "";
        while ((line = br.readLine()) != null) {
            for (int i = 0; i < line.length(); i++) {
                find(line, i, i);
                find(line, i, i + 1);
            }
            System.out.println(res);
        }
    }

    public static void find(String str, int low, int high) {
        while (low >= 0 && high <= str.length() - 1) {
            if (str.charAt(low) == str.charAt(high)) {
                if (high - low + 1 > res) {
                    res = high - low + 1;
                }
                low--;
                high++;
            } else {
                break;
            }

        }
    }
}