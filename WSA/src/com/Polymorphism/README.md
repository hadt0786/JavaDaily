Ploymorhphism

Poly --> more than one

Morphism -- > more than one form

1 -- > In programming we can have more than one form

2 > Types + Compile -- > Overloadind -- > + Method -- same method name with different types of parameter and different number of parameters

                                            +   Constructor -- same

                                            +   Operator -- (+ , ++ , * , / , & , etc) no explicit overloading in java, in C++ we have ,
                                                using + (concatenation we do operator overloading)
                                                using + acts as a Addition

                                            Example :         System.out.println("AKASH"+10+20+"Soumil"); //                       output AKASH1020Soumil

                                                             System.out.println("AKASH"+(10+20)+"Soumil")
                                                             ouptut -- AKASH30Soumil


            + RunTime ---> OverRding        Inheritance in Picture
                                            + Class A {
                                                        public void m1(){
                                                            s.o.p ("cant overide")
                                                        }}
                                                Class B extends A {
                                                    super().m1();//cant be override

                                                        public void m1(){
                                                            s.o.p ("easily overide")
                                                        }}
                                                    public class Main{
                                                public static void main(String[] args){
                                                    B b = new B();
                                                    b.m1(); // esily override

                                                }
                                                    }


3 :     

    Property                Overloading         Overriding

+   Name                    Same                Same
+   Argument                Different           Same
+   Return type             same
