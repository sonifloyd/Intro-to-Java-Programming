# Java interview question
# What is the difference between an Inner Class and a Sub-Class?

Ans: An Inner class is a class which is nested within another class. An Inner class has access rights for
the class which is nesting it and it can access all variables and methods defined in the outer class.
inner class is two type
1)static- It can not access non-static variable of outer claass.only access static variable of outer class.
and there is no need to make object of outer class . only make inner class object like this outer.Inner o1=new Outer.Inner();
2)non-static-.It can access both satic and non static variable.and create object of outer class.
class A{// outer class
class B{
void f1(){//inner classs
}
}
}
-outer class may be public or default
-inner class be public ,private ,protected ,default

A sub-class is a class which inherits from another class called super class. Sub-class can access all 
public and protected methods and fields of its super class.
# In a class implementing an interface, can we change the value of any variable defined in the interface?
Ans: No, we can't change the value of any variable of an interface in the implementing class as all variables defined in the interface are by default public, static and Final and final variables are like constants which can't be changed later.
# Can we have static methods in an Interface?
Ans: Static methods can't be overridden in any class while any methods in an interface are by default abstract and are supposed to be implemented in the classes being implementing the interface. So it makes no sense to have static methods in an interface in Java.
# Can we call a non-static method from inside a static method?
Ans: Non-Static methods are owned by objects of a class and have object level scope and in order to call the non-Static methods from a static block (like from a static main method), an object of the class needs to be created first. Then using object reference, these methods can be invoked.
 # Describe different states of a thread.
Ans: A thread in Java can be in either of the following states:

Ready: When a thread is created, it's in Ready state.
Running: A thread currently being executed is in running state.
Waiting: A thread waiting for another thread to free certain resources is in waiting state.
Dead: A thread which has gone dead after execution is in dead state.
# What are the two ways of implementing multi-threading in Java?

Ans: Multi threaded applications can be developed in Java by using any of the following two methodologies:

1. By using Java.Lang.Runnable Interface. Classes implement this interface to enable multi threading. There is a Run() method in this interface which is implemented.

2. By writing a class that extend Java.Lang.Thread class.
# How an object is serialized in java?

Ans: In java, to convert an object into byte stream by serialization, an interface with the name Serializable is implemented by the class. All objects of a class implementing serializable interface get serialized and their state is saved in byte stream.

#  When we should use serialization?

Ans: Serialization is used when data needs to be transmitted over the network. Using serialization, object's state is saved and converted into byte stream .The byte stream is transferred over the network and the object is re-created at destination.
 # What is the difference between continue and break statement?

Ans: break and continue are two important keywords used in Loops. When a break keyword is used in a loop, loop is broken instantly while when continue keyword is used, current iteration is broken and loop continues with next iteration.

In below example, Loop is broken when counter reaches 4.

for (counter = 0; counter & lt; 10; counter++)
    system.out.println(counter);

if (counter == 4) {

    break;
}

}
In the below example when counter reaches 4, loop jumps to next iteration and any statements after the continue keyword are skipped for current iteration.

for (counter = 0; counter < 10; counter++)
    system.out.println(counter);

if (counter == 4) {

    continue;
}
system.out.println("This will not get printed when counter is 4");
}
# What is an infinite Loop? How infinite loop is declared?

Ans: An infinite loop runs without any condition and runs infinitely. An infinite loop can be broken by defining any breaking logic in the body of the statement blocks.

Infinite loop is declared as follows:

for (;;)
{
    // Statements to execute

    // Add any loop breaking logic
}
# can we add a non abstract method on interface
Well, prior to Java 8, it wasn't possible to add non-abstract methods in Java but nowadays you can add non-abstract static, default, and private methods in Java interface. The static and default methods were supported as part of interface evolution in Java 8 and you can add private methods on an interface from Java 9 onwards. Since long, many Java programmers feel that there is no real use of an interface, well that's completely wrong, given how interface allows you to write generic, decoupled code, most of those sentiments comes from no implementation on the interface.
# Difference b/w heap and stack memory in java Jvm
Even though both are part of JVM and both consumers memory allocated to the Java process, there are many differences between them e.g. Heap memory is shared by all threads of Java application but Stack memory is local to each thread. Objects are created in heap memory but method frames are stored in Stack memory, and size of heap space is much bigger than the small size of Stack in Java. Even if you know this much information about heap and stack in Java.
# what is abstract class.
A class that is declared using “abstract” keyword is known as abstract class. It can have abstract methods(methods without body) as well as concrete methods (regular methods with body). A normal class(non-abstract class) cannot have abstract methods.
# Note 2 :A class derived from the abstract class must implement all those methods that are declared as abstract in the parent class.
# Note 3: If a child does not implement all the abstract methods of abstract parent class, then the child class must need to be declared abstract as well.
# Why can’t we create the object of an abstract class?
Because these classes are incomplete, they have abstract methods that have no body .
# Concrete class : A  class which is not abstract is referred as Concrete class.
# Key Points:
1. An abstract class has no use until unless it is extended by some other class.
2. If you declare an abstract method in a class then you must declare the class abstract as well. you can’t have abstract method in a concrete class. It’s vice versa is not always true: If a class is not having any abstract method then also it can be marked as abstract.
3. It can have non-abstract method (concrete) as well.
# Note: The class which is extending abstract class must override all the abstract methods.
abstract class MyClass{
   public void disp(){
     System.out.println("Concrete method of parent class");
   }
   abstract public void disp2();
}

class Demo extends MyClass{
   /* Must Override this method while extending
    * MyClas
    */
   public void disp2()
   {
       System.out.println("overriding abstract method");
   }
   public static void main(String args[]){
       Demo obj = new Demo();
       obj.disp2();
   }
}
//output
overriding abstract method













