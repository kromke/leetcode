package Medium;

import junit.framework.TestCase;
import org.junit.Assert;
import org.junit.Test;

public class longestPalindromeTest extends TestCase {

    @Test
    public void longestPalindromeTest() {
        Assert.assertEquals("ccc", longestPalindrome.longestPalindrome("ccc"));
    }
}