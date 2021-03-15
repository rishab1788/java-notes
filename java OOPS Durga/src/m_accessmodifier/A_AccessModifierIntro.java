package m_accessmodifier;

/**
 * Created by Rishabh on 03/01/2020.
 */

public class A_AccessModifierIntro {
// There are two types of modifiers in Java: access modifiers and non-access modifiers.
/**
 The access modifiers in Java specifies the accessibility or scope of a field, method, constructor, or class.
 We can change the access level of fields, constructors, methods, and class by applying the access modifier on it.
 */

/**
 Java access modifiers are used to provide access control in java.
 Java provides access control through three keywords – private, protected and public.
 We are not required to use these access modifiers always,
 so we have another one namely “default access“, “package-private” or “no modifier“.
 */

/**
Class Level -
 We are allowed to use only “public” or “default” access modifiers with java classes.

 1. If a class is “public” then we can access it from anywhere, i.e from any other class located in any other packages etc.
 2. We can have only one “public” class in a source file and file name should be same as the public class name.
 3. If the class has “default access” then it can be accessed only from other classes in the same package.

Java Access Modifiers with Class Member -
 we can have all the four access modifiers for class member variables and methods.
 However, member access modifier rules get applied after the class level access rules. For example,
 if a class is having default access then it will not be visible in other
 packages and hence methods and variables of the class will also be not visible.


 --------
 (Least Accessible) private < default < protected < public (Most Accessible)
 ---------

 (i).  Java Access Modifiers – public keyword
 If a class member is “public” then it can be accessed from anywhere.
 The member variable or method is accessed globally. This is the simplest way to provide access to class members.
 However, we should take care of using this keyword with class variables otherwise anybody can change the values. Usually,
 class variables are kept as private and getter-setter methods are provided to work with them.

 (ii). Java Access Modifiers – private keyword
 If a class member is “private” then it will be accessible only inside the same class.
 This is the most restricted access and the class member will not be visible to the outer world. Usually,
 we keep class variables as private and methods that are intended to be used only inside the class as private.

 (iii). Java Access Modifiers – protected keyword
 If class member is “protected” then it will be accessible only to the classes in the same package and to the subclasses.
 This modifier is less restricted from private but more restricted from public access.
 Usually, we use this keyword to make sure the class variables are accessible only to the subclasses.

 (iv). Java Access Modifiers – default access
 If a class member does not have any access modifier specified, then it’s treated with default access.
 The access rules are similar to classes and the class member with default access will be accessible to the classes in the same package only.
 This access is more restricted than public and protected but less restricted than private.
 */
/**
Interview Questions

    Q. Which access specifier can be used with a class?
    -  Public and Default access specifiers can be used with a class.
    Q.Can we declare a top-level class as private?
    -   No, we cannot declare a top-level or outer class as private. It can have either “public” or no modifier.
    Q.Can we declare an abstract method as private?
    -   No, an abstract method cannot be private. They must be declared as public, protected or
        default so that they can be further modified.
    Q.What is the access modifier for enumeration?
    - Enumeration members are always public. No other access modifiers are allowed.
 **/




}
