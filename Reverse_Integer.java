public class Reverse_Integer {
    public int reverse(int x) {
        try{
            if (x > 0){
                StringBuilder result = new StringBuilder(String.valueOf(x)).reverse();
                int res=Integer.parseInt(result.toString());
                return res;
            }
            StringBuilder result = new StringBuilder(String.valueOf(x)).reverse();
            int res=Integer.parseInt(result.toString());
            return 0 - res;
        }
        catch(NumberFormatException e){
            return 0;
        }
    }
    public static void main(String[] args) {
        

    }
}

