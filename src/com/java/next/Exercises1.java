public class Exercises1 {
    public static void main(String[] args) {
        for (int i=2; i<=100; i++){
          for (int j=2; j<1; j++){
              if (i%j==0){
                  continue;
              }
          }
            System.out.println(i);
        }
    }
}
