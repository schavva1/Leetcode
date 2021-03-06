import java.io.*;
class Solution {
    public int[] plusOne(int[] digits) {
       // int num[] = new int[digits.length];
        int carry = 1;
        for(int i = digits.length -1 ; i >=0;i--)
        {
            int sum = digits[i] + carry;
            if(sum == 10)
            {
                carry =1;
            }
            else 
            {
                carry = 0;
            }
            digits[i] = sum % 10;
        }
        if(carry == 1)
        {
             digits = new int[digits.length + 1];
             digits [0] = 1;
             return digits;
        }
        else 
        {
            return digits;
        }
    
    }
}

public class MainClass {
    public static int[] stringToIntegerArray(String input) {
        input = input.trim();
        input = input.substring(1, input.length() - 1);
        if (input.length() == 0) {
          return new int[0];
        }
    
        String[] parts = input.split(",");
        int[] output = new int[parts.length];
        for(int index = 0; index < parts.length; index++) {
            String part = parts[index].trim();
            output[index] = Integer.parseInt(part);
        }
        return output;
    }
    
    public static String integerArrayToString(int[] nums, int length) {
        if (length == 0) {
            return "[]";
        }
    
        String result = "";
        for(int index = 0; index < length; index++) {
            int number = nums[index];
            result += Integer.toString(number) + ", ";
        }
        return "[" + result.substring(0, result.length() - 2) + "]";
    }
    
    public static String integerArrayToString(int[] nums) {
        return integerArrayToString(nums, nums.length);
    }
    
    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        String line;
        while ((line = in.readLine()) != null) {
            int[] digits = stringToIntegerArray(line);
            
            int[] ret = new Solution().plusOne(digits);
            
            String out = integerArrayToString(ret);
            
            System.out.print(out);
        }
    }
}
