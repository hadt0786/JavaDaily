


public class ReverseDigit{
    public static void main(String[] args){
        int n;
        java.util.Scanner sc = new Scanner(System.in);
    
        n =sc.nextInt();
    
        int t, r=0,s=0;
        while(n!=0){
            t=n%10;
            r=r*10 + t;
            n=n/10;
        }
        System.out.println("reverse digit "+r);
    }
}