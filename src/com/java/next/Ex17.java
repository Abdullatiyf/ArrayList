import java.util.Random;

public class Ex17 {
    public static void main(String[] args) {
        Random rand= new Random();
        int[][] intArr= new int[5][8];

        for (int row=0;row< intArr.length;row++){
            int rowSum=0;
            for (int col=0; col<intArr[row].length;col++){
                System.out.println(intArr[row][col]);
                rowSum+=intArr[row][col];
            }
            System.out.println(": "+rowSum);
        }
    }
}
