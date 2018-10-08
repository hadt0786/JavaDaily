

public class NegativeAgeException {

    int age;

    NegativeAgeException(int age){
        this.age = age;
    }

    public String toString(){
        return "negative age exception :" + age;
    }
}

class UDException {
    public static void main(String[] args) throws NegativeAgeException {
        int age = -25;
        
    }
}