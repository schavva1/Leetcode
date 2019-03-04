import java.io.*
class Solution {
    public boolean isMonotonic(int[] A) {
        int count1 = 0;
        int count2 = 0;
        
        for(int i=0;i< A.length-1 ; i++)
        {
            
                if((A[i] - A[i+1]) > 0)
                {
                     count1++;
                }
                else if(A[i] - A[i+1] < 0)
                {
                    count2++;
                }
                else
                {
                    count1 ++;
                    count2 ++;
                }
          
        }
        System.out.println("count1"+ count1);
        System.out.println("count2"+ count2);
        System.out.println("length"+ A.length);
        if(count1 == A.length-1 || count2 == A.length-1) return true;
       
        return false;
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
    
    public static String booleanToString(boolean input) {
        return input ? "True" : "False";
    }
    
    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        String line;
        while ((line = in.readLine()) != null) {
            int[] A = stringToIntegerArray(line);
            
            boolean ret = new Solution().isMonotonic(A);
            
            String out = booleanToString(ret);
            
            System.out.print(out);
        }
    }
}
