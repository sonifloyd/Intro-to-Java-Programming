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

