/**
 * throw exception
 * */ 


public class Example { 
    static void checkEligibility(int age, int weight  ){
        if(age<12 && weight<41){

            throw new ArithmeticException("Student is not elligible");
        }
        else {
            System.out.println("Valid");
        }
    }


public static void main(String[] args){
    System.out.println("welcome");
    checkEligibility(10,39);
}


}