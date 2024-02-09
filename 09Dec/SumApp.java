
class Sum {
    void calSum(int ...x){
        int sum=0;
        for(int i=0; i<x.length; i++){
            sum = sum+x[i];
        }
        System.out.println("Sum of Values "+sum);
    }
}
public class SumApp {
   public static void main(String[] args) {

     Sum s1 = new Sum();
     s1.calSum(1,2,3,4,5,6,7,8,9);
     
   }
}
