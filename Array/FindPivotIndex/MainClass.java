import java.io.*
class Solution {
    public int pivotIndex(int[] nums) {
        int pivot = -1;
        //int first_pivot = -1;
        
        for(int i=0;i< nums.length; i++)
        {
            int sum_left=0, sum_right=0;
           /* if(i == 0)
            {
                
            }*/
            
            for(int j = i-1 ;j >=0 ; j--)
            {
                sum_left = sum_left + nums[j];
            }
            for(int j= i+1; j < nums.length; j++)
            {
                sum_right = sum_right + nums[j];
            }
            if(sum_left == sum_right)
            {
                
                pivot = i;
                break;
                
            }
            else ;
            
        }
        return pivot;
        
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
            
            int ret = new Solution().pivotIndex(nums);
            
            String out = String.valueOf(ret);
            
            System.out.print(out);
        }
    }
}
