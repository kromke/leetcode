package Medium;

public class longestPalindrome {

    public static void main(String[] args) {
        System.out.println(longestPalindrome.longestPalindrome("ccc"));
    }

    public static String longestPalindrome(String s) {
        int count = 0;
        int max = 0;
        String result = "";
        char c = 0;

        if (s.length() == 0)
            return s;

        for (int i = 0; i < s.length(); i++) {

            c = s.charAt(i);

            for (int j = s.length() - 1; j > i; j--) {

                if (c == s.charAt(j)) {

                    for (int k = i, l = j; k <= l; k++, l--) {

                        if (l != k)
                            count += 2;
                        else count++;

                        if (s.charAt(k) != s.charAt(l)) {
                            count = 0;
                            break;
                        }
                    }

                    if (count > max) {

                        result = s.substring(i, j + 1);
                        max = result.length();
                    }
                    count = 0;
                }

            }
        }
        return result.length() == 0 ? s.substring(0, 1) : result;
    }
}
