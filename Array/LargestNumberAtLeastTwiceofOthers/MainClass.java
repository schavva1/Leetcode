import java.io.*
class Solution {
    public int dominantIndex(int[] nums) {
        int max = nums[0];
        int index = 0;
        for(int i=0;i<nums.length;i++)
        {
            if(nums[i] > max)
            {
                max = nums[i];
                index = i;
            }
            else ;
        }
        for(int i=0;i< nums.length; i++)
        {
            if (index != i && nums[index] < 2 * nums[i]) 
                return -1; 
        }
        
        return index;
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
    
    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        String line;
        while ((line = in.readLine()) != null) {
            int[] nums = stringToIntegerArray(line);
            
            int ret = new Solution().dominantIndex(nums);
            
            String out = String.valueOf(ret);
            
            System.out.print(out);
        }
    }
}
