public class Ex8to11 {
    public static void main(String[] args) {
        //Ex8to11
        String [] strArr=new String[50];
        //Ex9
        String[] strArr1;
        strArr1=new String[50];
        //Ex10
        for (int i=0; i<strArr.length; i++){
            strArr[i]="\\";
        }
        //Ex11
        for (int i= strArr.length-1;i>=0;i--){
            System.out.println(i + ": " + strArr[i]);
        }
    }
}
