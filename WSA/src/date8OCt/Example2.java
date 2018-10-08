package date8OCt;

import java.io.IOException;

public class Example2 {

   public static void myMethod(int num) throws IOException, ClassNotFoundException {

        if(num==1){
            throw new IOException("File Not Found");
        }
        else {
            throw new ClassNotFoundException("Class Found");
        }

    void myMethod2(int num) {
        try {
            if (num == 1) {
            }
        } catch (IOException e) {
            System.out.println("File Not Found");
        }

    }

    public static void main(String[] args) {
        myMethod(2);
    }
}