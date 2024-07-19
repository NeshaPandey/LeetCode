public class PalindromeNumber {
    public static boolean isPalindrome(int num) {
        int originalNum = num;
        int reversedNum = 0;
        if(num<0)
        return false;

        // Reverse the number
        while (num!= 0) {
            int digit = num % 10;
            reversedNum = reversedNum * 10 + digit;
            num /= 10;
        }

        // Check if the original number is equal to its reverse
        return originalNum == reversedNum;
    }
}
