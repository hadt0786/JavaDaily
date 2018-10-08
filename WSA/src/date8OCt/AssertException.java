import java.util.Scanner;

public class AssertException {
    public static void main(String[] args){
        Scanner cin  = new Scanner (System.in);
        System.out.println("Enter your age : ");
        int var = 10;
        assert(var>18):
        AssertException("value is "+var);
    }
}