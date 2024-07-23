

public class Array2D{
    public static void main(String[] args) {
        int [][] arr={{10,20,30,40},{15,25,35,45},{28,29,37,49},{33,34,38,50}};
        int target =37;
        int[] result = Binary_Search(arr, target);
        for (int i : result){
            System.out.print(i + " ");
        }
        
    }
    public static int[] Binary_Search(int[][] arr,int target){
        int row =0;
        int col =arr.length-1;
        while(row<arr.length && col>=0){
            if(arr[row][col]==target){
                int[] result ={row,col};
                return result;
            }
            else if(arr[row][col]>target){
                col--;
            }
            else if(arr[row][col]<target){
                row++;
            }

        }
        return new int[] {-1};
        

    }
}