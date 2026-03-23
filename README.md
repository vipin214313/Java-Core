# Java-Core
What is Java?
Java is a high-level, robust, object-oriented, and secure programming language as well as a platform. It was developed by Sun Microsystems (now owned by Oracle) in 1995, and James Gosling is known as the father of Java.

Java is a programming language and a platform. Java is a high-level, robust, object-oriented and secure programming language.

Java was developed by Sun Microsystems (which is now a subsidiary of Oracle) in the year 1995. James Gosling is known as the father of Java. Before Java, its name was Oak. Since Oak was already a registered company, so James Gosling and his team changed the name from Oak to Java.

Java Development Kit (JDK) :-
The Java Development Kit (JDK) is a software development kit used to develop Java applications. It includes tools necessary for Java programming, such as:
    1. JVM (Java Virtual Machine): The engine that runs Java applications.
    2. JRE (Java Runtime Environment): Provides libraries and other components to run Java programs, but does not include development tools.
    3. Compilers: The javac compiler that translates Java source code into bytecode.
    4. Java API Libraries: Pre-written code to handle common tasks like file I/O, networking, and GUI development.
    5. Debugging Tools: Tools like jdb to debug Java programs.
    6. Javadoc: A tool to generate documentation for Java code.
To download the JDK, visit the official Oracle website or use an open-source alternative like OpenJDK. Once installed, you can compile and run Java programs from the command line using commands like javac and java.

Java Runtime Environment (JRE):-
The Java Runtime Environment (JRE) is a set of software components that allows Java programs to run on a computer's operating system
JRE is a software package that provides the necessary environment to run Java programs.

Key point: JRE does not compile Java code — it only runs the already compiled .class (bytecode) file using the JVM.

The Java Runtime Environment (JRE) works by providing the necessary resources and environment to run Java applications. 

What is JVM (Java Virtual Machine):-

JVM (Java Virtual Machine) is a virtual (abstract) machine that executes Java bytecode and enables Java programs to run on any platform without modification.

JVM (Java Virtual Machine) is an abstract machine.it is called virtual machine because it does not physical exist. It is a specification that provides runtime environment in which java bytecode can be executed.
JVMs are available for many hardware and software platforms (i.e. JVM is platform dependent).

Heap Memory 

    • Heap memory is where objects are stored when you use new.
    • It is shared among all threads in the program.
    • Created at runtime in RAM — slower access compared to stack.
    • Java's Garbage Collector automatically removes unused objects from heap.
    • Heap size is larger but slower.
    
Example:
Student s = new Student();  // new Student() object goes to heap


======================================================================
 Stack Memory 
    • Stack memory stores method calls and local variables inside methods.
    • Works on LIFO (Last In First Out) principle.
    • Each thread has its own stack — thread-safe.
    • Created and managed by CPU — very fast but limited size.
    • Stack memory is temporary — cleared when method finishes.

Example:
public void show() {
    int a = 10;  // 'a' stored in stack memory
}
🧾 What Are Data Types in Java?
Data types define the type of value a variable can store and what kind of operations can be done on it.
                                         OR
In Java, data types define the type of data that can be stored in a variable. They determine the size and kind of values that variables can hold and the operations that can be performed on them.

✅ Primitive Data Types (8 types)
Primitive Data Types in Java
Primitive data are only single values and have no special capabilities.  Primitive data types are the most basic and predefined data types in Java. They store simple values and are directly mapped to memory.
Characteristics:
    • Fixed size
    • Fast performance
    • Stored directly in memory
Type	Size	Default	Example	Range / Notes
boolean	~1 byte	false	true, false	Logical values only
byte	1 byte	0	byte a = 10;	-128 to 127
short	2 bytes	0	short b = 1000;	-32,768 to 32,767
int	4 bytes	0	int x = 500;	-2,147,483,648 to 2,147,483,647
long	8 bytes	0L	long l = 10000L;	Larger integer values
float	4 bytes	0.0f	float f = 3.14f;	Up to 7 decimal digits
double	8 bytes	0.0d	double d = 3.14159;	Up to 16 decimal digits
char	2 bytes	'\u0000'	char c = 'A';	Unicode character
Non-Primitive (Reference) Data Types
The Non-Primitive (Reference) Data Types will contain a memory address of variable values because the reference types won’t store the variable value directly in memory. They are strings, objects, arrays, etc.
Non-primitive data types are user-defined types that are more complex and capable of storing multiple values.it is also called reference data types.
These data types store references to objects, not actual values.
Characteristics:
    • Size can vary (dynamic in nature)
    • Can hold complex data structures
    • Stored as references (pointers to data locations in memory)
Types:
    1. String – sequence of characters
String s = "Hello";
    2. Class – blueprint for creating objects
class Car {
    String color;
    void start() { System.out.println("Car started"); }
}
    3. Object – instance of a class
Car myCar = new Car();
    4. Interface – defines method structure (like a contract)
interface Animal {
    void sound();
}
    5. Array – collection of same data types
int[] arr = {1, 2, 3};
What is a Variable in Java?
A variable is a named memory location used to store data values.It acts as a container that holds data during program execution.

A variable in Java is a named memory location used to store data that can be changed during program execution. 

Syntax:
DataType   variableName = value;
 why is use variables:
• Store data in memory → Variables hold values while the program runs.
• Reuse data → We can use the same value multiple times without rewriting it.
• Make programs dynamic → Variable values can change during execution.
• To Modify Values
• To Make Programs Readable
• Improve readability → Descriptive variable names make code easier to understand.
Perform operations → Variables allow calculations and logical operations on data.

🔹 Rules for Naming Variables in Java
✅ Can contain: letters, numbers, _, $
✅ Can’t start with a number
✅ Must not be a Java keyword
✅ Case-sensitive (Age ≠ age)
✅ Use meaningful names (e.g., studentName, totalMarks)


Types of Variables in Java
1. Local Variables
Variables defined inside methods, constructors or blocks are called local variables.
    • Declared inside methods, constructors, or blocks.
    • Created when the method/block is entered and destroyed when exited.
    • Scope is limited to that block or method only.
    • Must be initialized before use.
    • It is created on stack memory.
    • This variables accessible only within method/constructor/class in which they are created.
It is accessible only variables name .

2. Instance Variables
Variables defined inside a class but outside any method, constructor or block are known as instance variable.no static keyword use.
Instance variables are known as non-static variables and are declared in a class outside of any method, constructor, or block. 

    • Declared inside a class but outside any method, constructor, or block (no static keyword use).
    • Each object of the class has its own copy.
    • Created when the object is created and destroyed when the object is destroyed.
    • Can have access modifiers (public, private, etc.).
    • Default values are assigned if not initialized (0 for int, null for objects).
    Initialization of instance variable is not compulsory
    • It is created on heap memory.
Accessed via object references.

3. Static Variables(Class variables)
Variables defined inside a class(not inside method, constructor or block) using static keyword are known as static or class variables.
Static variables in Java are variables declared with the static keyword inside a class but outside any method. They are shared among all objects of the class and exist for the entire lifetime of the program. 

    • Declared inside a class with the static keyword.
    • Only one copy exists, shared among all instances of the class.
    • Created when the program starts and destroyed when it ends.
    • Can be accessed without creating an object, using ClassName.variableName.
    • Cannot be declared inside methods or blocks.
Initialization of class variable is also not compulsory.

1. What is Type Casting?
Type casting in Java is the process of converting a variable from one data type to another.
    • Why needed?
Sometimes you want to store a value of one type into a variable of another type.

There are two types of Type Casting in Java:
    • Widening Type Casting
    • Narrow Type Casting
2. Types of Type Casting
A. Implicit Casting (Widening type casting)
    • Also called automatic type conversion.
    • Happens automatically when a smaller data type is converted to a larger data type.
    • No data loss occurs.
Example of widening:
byte → short → int → long → float → double
B. Explicit Casting (Narrowing)
    • Also called manual type conversion.
    • Needed when a larger data type is converted to a smaller data type.
    • Can lead to data loss, so programmer must manually cast using parentheses ().
    • Example of narrowing:
double → float → long → int → short → byte

The process of downsizing a bigger data type into a smaller one is known as narrowing type casting. Casting up or explicit type casting are other names for it. It doesn't just happen by itself. If we don't explicitly do that, a compile-time error will occur. Narrowing type casting is unsafe because data loss might happen due to the lower data type's smaller range of permitted values. A cast operator assists in the process of explicit casting.
Syntax:
smaller_data_type variable_name = (smaller_data_type) larger_data_type_variable;

Operators :-Operators in Java are special symbols or keywords used to perform specific operations on operands. These operations can be arithmetic, logical, relational, etc. 
2+2
Where=operands 2
+=operator 

Java provides several types of operators categorized as follows:
• Arithmetic Operators
• Relational Operators
• Logical Operators
• Assignment Operators
• Unary Operators
• Bitwise Operators
• Ternary Operator
• Instanceof Operator
