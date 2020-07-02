package Medium;

import java.util.HashSet;
import java.util.Set;

public class LongestSubstringWithoutRepeatingCharacters {

    // Вывести максимальную длину подстроки без повторения символов.


    public int lengthOfLongestSubstring(String s) {
        if (s.length() == 1)
            return 1;
        Set charSet = new HashSet();
        int maxLen = 0;
        int counter = 0;
        byte[] chars = s.getBytes();

        for (int i = 0; i < chars.length; i++) {
            if ((i + 1 < chars.length) && (chars[i] == chars[i + 1] && counter == 0))
                continue;
            if (charSet.add(chars[i]))
                counter++;
            else {
                maxLen = Math.max(maxLen, counter);
                i -= counter;
                counter = 0;
                charSet.clear();

            }
        }
        return Math.max(maxLen, counter);
    }
}

