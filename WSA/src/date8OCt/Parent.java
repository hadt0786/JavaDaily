package package date8OCt;


import java.io.*;

public class Parent {
    void msg() {
        System.out.println("Parent");
    }
}

public class TestExceptionChild extends Parent{
    // checked exception must include in parent in compilation time
    // Unchecked excepition Arithmetic its a runtime
    // void msg()throws IOException {
    //     System.out.println("Child");
    // }
    void msg() throws ArithmeticException {
        System.out.println("Child");
    }
    public static void main(String[] args){
        Parent p = new TestExceptionChild();
        p.msg();
    }
}