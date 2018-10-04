

##Virtual Method Invocation
1.	Virtual method invocation is performed as follows:
```
Employee e = new Manager();
e.getDetails();

```

## Compile-time type and runtime type invocations have the following characteristics:
```
The method name must be a member of the declared variable
type; in this case Employee has a method called getDetails.
The method implementation used is based on the runtime
object’s type; in this case the Manager class has an
implementation of the getDetails method.
```


## TypeCasting

#### Upcasting

#### DownCasting

## Equals and ==

#### Shallow --> == reference variable of same object
#### Deep --> .equals check the data memebers and object idetical
