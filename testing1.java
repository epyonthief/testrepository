import java.util.HashMap;
import java.util.Map;

public class testing1{
public static void main(String[]args){
	
	
String s1 = "aabcc";
String s2 = "adcaa";

int len = s1.length();
int len2 = s2.length();
Map<Character, Integer> numChars = new HashMap<Character, Integer>(Math.min(len, 26));
for (int i = 0; i < len; ++i){
    char charAt = s1.charAt(i);
	if (!numChars.containsKey(charAt)){
        numChars.put(charAt, 1);
    }
    else
    {
        numChars.put(charAt, numChars.get(charAt) + 1);
    }
}
int key = 2;
String value = Map.get(key);
System.out.println();
}

}
     

     