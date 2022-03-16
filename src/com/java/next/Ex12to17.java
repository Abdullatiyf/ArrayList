import java.util.Random;

public class Ex12to16 {
    public static void main(String[] args) {
        //Ex12
        Random rand= new Random();
        int[] intArr= new int[50];
        for (int i=0; i< intArr.length; i++){
            int indexOfMin=i;

            for (int j=i+1;j<intArr.length;j++){
                if (intArr[j]<intArr[indexOfMin]){
                    indexOfMin=j;
                }
            }
            if (indexOfMin!=i){
                int tmp= intArr[i];
                intArr[i]=intArr[indexOfMin];
                intArr[indexOfMin]=tmp;
            }
        }
        //Ex13
        int [][]intArr1=new int[5][8];
        //Ex14
        int [][]intArr2;
        intArr2=new int[5][8];
        //Ex15

        int[][] intArr3;
        intArr3=new int[5][];
        for (int i=0;i<intArr3.length;i++){
            intArr3[i]=new int[8];
        }
        //Ex16
        for (int row=0; row<intArr1.length; row++){
            for (int col=0; col< intArr1[row].length;col++){
                intArr1[row][col]=row*col;
            }
        }
    }
}
