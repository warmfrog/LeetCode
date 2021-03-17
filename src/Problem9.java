import com.sun.tools.javac.util.Assert;

public class Problem9 {
    public static void main(String[] args) {
        Assert.check(isPalindrome(0));
        Assert.check(isPalindrome(9));
        Assert.check(!isPalindrome(10));
        Assert.check(isPalindrome(101));
        Assert.check(isPalindrome(11));
    }

    public static boolean isPalindrome(int x) {
        if(x < 0){
            return false;
        }
        if(x < 10){
            return true;
        }

        String s = x + "";
        for(int i=0, j=s.length() - 1; j > 0 && i <= j; i++, j--){
            if(s.charAt(i) != s.charAt(j)){
                return false;
            }
            if(i == j || i + 1 == j){
                return true;
            }
        }

        return false;
    }
}
