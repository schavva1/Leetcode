import java.io.*
class Solution {
    public int lengthOfLastWord(String s) {
        int cnt = 0,j=0;
        boolean l = false;
        for(int i= s.length()-1 ;i >=0;  i--)
        {
            if(Character.isLetter(s.charAt(i)))
            {
                
                l = true;
                j = j+1;
            }
            else
            {
                if(l == true)
                {
                    return j;
                }
            }
           
        }
        return j;
    }
}

public class MainClass {
    public static String stringToString(String input) {
        return JsonArray.readFrom("[" + input + "]").get(0).asString();
    }
    
    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        String line;
        while ((line = in.readLine()) != null) {
            String s = stringToString(line);
            
            int ret = new Solution().lengthOfLastWord(s);
            
            String out = String.valueOf(ret);
            
            System.out.print(out);
        }
    }
}
