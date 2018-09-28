import java.util.Scanner;

public class Prime{

    public static void main(String[] args){

        Scanner in = new Scanner(System.in);

        int n ;
        System.out.println("enter a number");
        n = in.nextInt();

        int i, res= 0;
        boolean flag = true;
        
        for(i =2;i<=n/2;i++){
            res= n%i;
            if(res==0){
                flag=false;
                break;
            }
        }

        if(flag) System.out.println(n + " is Prime Number");
        else System.out.println(n + "is not a prime Num");


    }
}