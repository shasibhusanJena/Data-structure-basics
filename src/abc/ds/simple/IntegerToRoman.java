package abc.ds.simple;

import java.util.LinkedHashMap;
import java.util.Map;

class IntegerToRoman {
    public String intToRoman(int num) {
        Map<Integer, String> map = getIntToRomanMap();
        
        StringBuffer sb = new StringBuffer();
        for (int key : map.keySet()) {
            while (num >= key) {
            	System.out.println(num +"  "+key);
                sb.append(map.get(key));
                num -= key;
            }
            
            if (num == 0) break;
        }
        
        return sb.toString();
    }
    
    private Map<Integer, String> getIntToRomanMap() {
        Map<Integer, String> map = new LinkedHashMap();
        map.put(1000, "M");
        map.put(900, "CM");
        map.put(500, "D");
        map.put(400, "CD");
        map.put(100, "C");
        map.put(90, "XC");
        map.put(50, "L");
        map.put(40, "XL");
        map.put(10, "X");
        map.put(9, "IX");
        map.put(5, "V");
        map.put(4, "IV");
        map.put(1, "I");
        
        return map;
    }
    public static void main(String[] args) {
		IntegerToRoman a1 = new IntegerToRoman();
		System.out.println(a1.intToRoman(8));
	}
}