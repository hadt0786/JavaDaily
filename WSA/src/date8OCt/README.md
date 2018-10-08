# Exception handling

## throws

writing multiple catch statement -- use throws keyword.
write multiple time write only once

`Example1.java`
`Example2.java`

## Overriding Phenomena -- Called Overridin of method

Overrding the parent method in child class
**Method signature**(Method name and Parameters) remains same

1. Method --
2. Constructor
3. Operator = + concatenation and + addition oprator
4. Checked exception should write in Parent class IOException
5. Unchecked exception are runtime and they fine Put any where

`Parent.java`
`TestExceptionChild.java`

## Exception heirarchy

1. Child cannot have parent exception, Parent class should have the parent excepiton
2. Exception is the main class should be in SUPER or Parent class

```
public class TestA {
public void methodA() throws IOException {
// do some file manipulation
}}
public class TestB1 extends TestA {
public void methodA() throws EOFException {
// do some file manipulation
}}
public class TestB2 extends TestA {
public void methodA() throws Exception { // WRONG
// do some file manipulation
}}
```

## Define own Exception

1. Extends Exception class
2. Override toString() method
3. Define constructor.

```
class NegativeAgeException extends Exception{
int age;
NegativeAgeException(int age){
this.age=age;
}
public String toString(){
Return “negative age exception:”+ age;
}
public static void main(String[] args){
Int age =-25;
if(age<=0){throw new NegativeAgeException(age)}
else{System.out.println(“your age is”+age)}
}}
```

`NegativeAgeException.java`
`UDException.java`
`UnChecked.java`
`UnCheckedException.java`
`UnCheckedExByTryCatch.java` --> no error

# Assert

## USed for test case

`AssertException.java`

1. Do not use assertion method

