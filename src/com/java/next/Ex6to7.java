public class Ex6to7 {
    public static void main(String[] args) {
        //Ex6
        String [] strArr= new String[5];
        String sep="";
        for (String s : strArr) {
            System.out.print(sep + s);
            sep = ", ";
        }
        //Ex7

        int[] intArr=new int[5];
        for (int i=0;i< intArr.length;i++){
            intArr[i]=i*2;
        }
        for (int j : intArr) {
            System.out.print(j + ", ");
        }
    }
}
