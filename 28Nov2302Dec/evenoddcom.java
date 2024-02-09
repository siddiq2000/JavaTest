public class evenoddcom {
    public static void main(String x[]){
        int num;
        System.out.println("Enter a Number ");
        num = Integer.parseInt(x[0]);
        if(num%2==0){
            System.out.printf("Number is Even ");
        }
        else System.out.println("Number is Odd");
    }
}
