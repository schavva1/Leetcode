import java.io.*
import java.math.BigInteger;
class Solution {
    public String addBinary(String a, String b) {
        BigInteger x = new BigInteger(a,2);
        BigInteger y = new BigInteger(b,2);
        return x.add(y).toString(2);
        
        
        //System.out.println("z:"+z);
        //return s;
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
            String a = stringToString(line);
            line = in.readLine();
            String b = stringToString(line);
            
            String ret = new Solution().addBinary(a, b);
            
            String out = (ret);
            
            System.out.print(out);
        }
    }
}
