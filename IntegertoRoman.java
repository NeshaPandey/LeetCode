import java.util.TreeMap;
class IntegertoRoman{
    public String intToRoman(int num) {
        TreeMap<Integer, String> romanMap = new TreeMap<>();
        romanMap.put(1, "I");
        romanMap.put(4, "IV");
        romanMap.put(5, "V");
        romanMap.put(9, "IX");
        romanMap.put(10, "X");
        romanMap.put(40, "XL");
        romanMap.put(50, "L");
        romanMap.put(90, "XC");
        romanMap.put(100, "C");
        romanMap.put(400, "CD");
        romanMap.put(500, "D");
        romanMap.put(900, "CM");
        romanMap.put(1000, "M");

        StringBuilder roman = new StringBuilder();

        // Iterate through the keys in reverse order
        for (int key : romanMap.descendingKeySet()) {
            while (num >= key) {
                roman.append(romanMap.get(key));
                num -= key;
            }
        }

        return roman.toString();
        
    }
}
