# java-basics


Installing Java:

Google download java, go to the oracle downloads page -> jdk21 -> Windows -> x64 Installer.
Run the installer. I installed at C:\Program Files\Java\jdk-21.
In cmd, run: javac -version & java -version
If this doesnt work, go to Environment Variables and add below in "Path":
C:\Program Files\Java\jdk-21\bin
Close the cmd, open again and try now: avac -version & java -version should work.

Installing Eclipse:

Google download eclipse
Eclipse Installer
Windows -> x86_64
Run the Installer

In the Eclipse Editor:
Create a Java project - MyJava
Create a package oops, a class Oops, select to create public static void main(String[] args) automatically.
Write a System.out.println() command and execute to verify.

Installing sqlite database:

From https://www.sqlite.org/download.html, download sqlite-tools-win-x64-3490200.zip.
Extract and copy the files to C:\sqlite.
cmd prompt:
cd C:\sqlite
sqlite3 
You will be taken to sql prompt

sqlite-JDBC driver:

Google for "download jdbc sqlite driver", download sqlite-jdbc-3.34.0.jar, copy to C:\MyJava
Use this in your project -> properties
Java Build Path
Libraries
Module Path
Add External JARs
C:\MyJava\sqlite-jdbc-3.34.0.jar

================ JAR decoded ======================

how to execute a jar file someone has given you: java -jar Star.jar
how to see jar contents: java -tvf Star.jar
how to extract jar contents: jar -xvf Star.jar (Note you can see only machine-readable .class code. you cannot modify it. you can extend the class though)
how to create jar: In Eclipse - Right Click on Project - Export - JAR file or Runnaable JAR file
how to create jar: Manual - create a manifest.mf in the same folder that has .java & .class files 
                          - so do a javac to get the class files. in our case, folder has MyProgram.java, MyProgram.class
Then run the command: jar -cvfm myprogram.jar manifest.mf *.class
you can also say, jar -cvfm myprogram.jar manifest.mf a.class b.class c.class for including specific classes
manifest.mf looks like:
Main-Class: MyProgram
<There is an ENTER here and this is important>

you must see a myprogram.jar in the same folder.
try: java -jar myprogram.jar to execute the program.

==========================================

Why getters and setters ?

Class members/variables should be private and getters/setters must be public.
Getters / setters help to perform some preprocessing / validation etc before setting / getting the class variables.

============================================


Inheritance ->  extends (Sub class extends Super class)

Sub s = new Sub();
Super s = new Super();
Super s = new Sub();

All above are possible.
Super s = new Sub(); -> only methods defined in Super class are accessible even though object is Sub() class.
But if both Super() & Sub() have the same method, then Sub() method takes higher precedence.

Polymorphism -> method overriding across extends classes (i.e. Sub and Super), method overloading possible within same class with different parameter signature.

===================================================================

Abstract classes: can have some concrete methods / members (variables) and some abstract methods. This class can be extended and abstract methods can be implemented.
Interfaces: can have some concrete methods (static/default) and static/final members (constants). This interface can be implemnted in another class.
We cannot create an objects of Interface or abstract classes.
One interface can extend another interface. 
One Class can extend one class only but can implement multiple intefaces -> main difference between abstract class & interface.
In C++ multiple inheritance is allowed, but in Java only one class can be extended and multiple inheritance is achieved using interfaces.

           Car  Music-Player
              Suzuki

In C++, Suzuki is both a Car and a Music Player.
In Java, Suzuki is a Car but it also has the functionality of music player implemented - This is correct.


Note: Initially there was no concept of "default" methods in interfaces.
The need arose because, say several classes have implemented an interface.
Now i need a new method defined in interface.
All dependent classes will become invalid because all these classes have to now override/implement this new method.
With the use of default, all existing classes will have a copy of the method and no change is needed. 
New classes implementing the interface can override the method.

Also, as Interface can have private methods.
This and the final/static members will be accessible within the interface, for the default method/s maybe.


=================================================================== static =================================================

variables
methods
classes
blocks

static variables are members of the class unlike normal variables that are members of an object.
These static variables are accessible from all objects of the class and change by one object reflects in other objects of the same class using the same variable.
So these are shared variables. normal variables can have different values in different objects but static variables will have same value across different objects.

static methods for some operations on static members.
static methods cannot access non-static members/properties/variables -> so main purpose of static methods is to access / modify the static variables.
but non-static methods can access static members/properties/variables.

static members / methods can be accessed by object.variable / object.method() or class.variable / class.method i.e. object creation is not needed.
because these are anyway at the class level, common across objects.

as for static classes, only inner classes can be static.

static = shared

=================================================================== final =================================================

variables 
methods
classes
blocks

final variables are like constants , they cannot be re-assigned.
final methods cannot be overridden in say a sub class that extends the super class.
final class cannot be extended i.e. cannot be used for inheritance.

final = constant

===================================================================== packages and access modifiers ===========================================

private: methods / members are accessible only within same class
default: methods / members are accessible across different classes but in the same package
protected: methods / members are accessible across different classes but in the same package and also across inherited classes in different package/s
public: methods / members are accessible everywhere across different classes, across different packages


Naming convention for packages:
If your company url is www.citi.com:
packages must be like: com.citi.loans.Account, com.citi.deposits.Account etc. 
Here Account is the class.
There can be Account class for loans as well as deposits and by saying loans.Account / deposits.Account, we have achieved class uniqueness within Citi.
Similarly barclays, can have loans Account and deposits Account. So, com.citi helps in achieving global uniqueness of a Class.


Generic notes:

What do you do with a Java class ? 
You can either create an object of a class or you can extend a class.

When you want to use a class defined in one package in another package, you need to import package.class or package.* etc.

====================================================================== multi-threading ========================================================

If your class is not extending from another class you can extend Thread class.
If your class is already extending another class, since you cannot extend 2 classes, you need to implement the Runnable interface.

To ensure 2 threads dont intersect each other, i.e. one thread has to wait when another process is using a shared object, you need to use synchronization.

To ensure a particular order between 2 threads (example: consumer thread has to run after producer thread), you need to use wait & notify on top of synchronization.
Also, note in this case of producer-consumer, the methods involved are different - so even if you synchronize, it doesnt affect anything across different methods.


====================================================================== Javadoc =================================================================

In Eclipse, after annotations are added - Project -> Generate Javadoc.
A separate doc folder will be created that is available in the Package explorer.
Open the index.html using a browser.


=================================================================================================================================================

Write programs to demo:

variable arguments
nested classes

basic OOPs, getters / setters, regex validation, constructors that use setters, toString(), polymorphism method overloading - Oops.java
inheritance, extends / super,  polymorphism method overriding - Inheritance.java
abstract classes - AbstractDemo.java
interfaces - InterfaceDemo.java
for loop, while loop, switch case - ForLoop.java
Arrays - ArrayDemo.java
try-catch exception, throw/throws exception, finally block - TryCatchDemo.java, ThrowExceptionDemo.java
multi-threading - ThreadDemo1.java, ThreadDemo2.java, RunnableDemo1.java, RunnableDemo2.java, ThreadDemo3.java, ThreadDemo4.java, ThreadDemo5.java
javadoc & annotations - JavaDocDemo.java, AnnotationsDemo.java, UserDefinedAnnotations.java
lambda - LambdaExpression1.java, LambdaExpression2.java

dates & times -> DateTimeDemo.java

----------- Generics ----------------------


GenericDemo1.java, GenericDemo2.java, GenericDemo3.java, GenericDemo4.java, GenericDemo5.java

Also, see the Project: Generics, which has the classes Container.java and Application.java
This covers Generic classes, Generic members, Generic methods.

Also, see the Project: Generics_Extended.
This covers wildcard parameters - i.e. ? in method parameters

----------- Java IO Streams -------------

FileOutputStream -> FileOutputStreamDemo.java (using throws Exception as a shortcut, not advisable)
FileInputStream -> FileInputStreamDemo.java (using try-catch as recommended)
SequenceInputStream -> FileCopyDemo.java (FileInputStream + FileOutputStream + SequenceInputStream)

ByteArrayInputStream -> ByteInputStreamDemo.java
ByteArrayOutputStream -> ByteOutputStreamDemo.java

BufferedInputStream -> BufferedInputStreamDemo.java 
BufferedInputReader -> BufferedInputReaderDemo.java -> Good one and ideal for reading files

ObjectInputStream & ObjectOutputStream -> ObjectStreamsDemo.java -> Good and ideal for storing objects.

~~~~~~~~~~ brief explanation of the Java IO Stream Input classes used above ~~~~~~~~~~~

FileInputStream:
It reads data as a stream of raw bytes, making it suitable for reading binary files such as images, audio, and video files. It does not perform any character encoding or decoding.

FileReader:
It reads data as a stream of characters, making it suitable for reading text files. It uses the platform's default character encoding to decode the bytes into characters.

ByteArrayInputStream:
Same as FileInputStream but source is byte array and not a file.

BufferedInputStream:
Helps in buffering for a smooth read. Attached to fileinputstream. You can mark / replay etc on a buffer and that is not possible on a File.

BufferedInputReader:
It reads data as a stream of characters, making it suitable for reading text files. readLine() type of methods that are not present in BufferedInputStream are present here.
Helps in buffering for a smooth read.

ObjectInputStream & ObjectOutputStream:
Note that whatever object you have written into the file using ObjectOutputStream & FileOutputStream will not be in human-readable format. The object is serialized when writing.
You need to use ObjectInputStream & FileInputStream to deserialize the objects and show in human-readable format.

~~~~~~~~~~ brief explanation of the Java IO Stream Output classes used above ~~~~~~~~~~~

same as input classes except that they perform write / output function.

=============================== Different types of JDBC Drivers ========================================================

Java would need separate drivers for Oracle database, MySQL database, Sqlite database.
Similarly, Python would need separate drivers for Oracle database, MySQL database, Sqlite database.
But, Microsoft has a solution where all these databases have ODBC drivers installed in them.
So, now Java needs a single ODBC driver instead of 3 drivers of Oracle, MySQL, Sqlite.
Similarly, Python needs a single ODBC driver instead of 3 drivers of Oracle, MySQL, Sqlite.
This is Type 1 JDBC-ODBC Bridge driver.

Then there is Type 2 Native-API driver.
For ex, Oracle has an interface called OCI and Java needs to interact with OCI to talk to Oracle database.
Sqlite provides a driver that is native to Sqlite and also compatible with Java.
This is what we have used below.

Then there is the Type 3 driver. Java-Net Protocol driver.
Java talks to a Server and the Server talks to different databases.

Finally, there is the Type 4 or Thin Driver.
Java directly interact with database - no ODBC, no OCI, no Server in the middle etc.

================================== Project Setup and implementation =======================================================

Setup sqlite database:

From https://www.sqlite.org/download.html, download sqlite-tools-win-x64-3490200.zip.
Extract and copy the files to C:\sqlite.
cmd prompt:
cd C:\sqlite
sqlite3 
You will be taken to sql prompt
.databases (shows list of databases)
.open univ.db (create a database)
.databases (now again see the list of databases)
create table dept(deptno integer primary key not null unique, dname text);
.tables
insert into dept values(10,'CSC');
insert into dept values(20,'ECE');
insert into dept values(30,'MECH');
insert into dept values(40,'EEE');
select * from dept;

Setup the driver that connects Java program and database:

Google for "download jdbc sqlite driver", download sqlite-jdbc-3.34.0.jar, copy to C:\MyJava

*** not sure if below are needed, getting errors like Class Not Found Exception ***
cmd prompt:
set classpath=C:\MyJava\sqlite-jdbc-3.34.0.jar;
Environment Variables - User defined - Add the key-value: CLASSPATH-C:\MyJava\sqlite-jdbc-3.34.0.jar
*** not sure if above are needed ***

*** this worked *****
In Eclipse IDE, Right-Click on the Project MyJava
Properties
Java Build Path
Libraries
Module Path
Add External JARs
C:\MyJava\sqlite-jdbc-3.34.0.jar
*** this worked *****

1. Then, created C:\Users\VINOD\eclipse-workspace\MyJava\src\oops\DatabaseDemo.java
Execute and see the results. From a Java Program, we have connected to a database and queried / retrieved the results.

2. DatabaseDynamicDemo.java -> This shows how to pass dynamic values into a Java Program that queries from a sqlite database.

3. DatabaseUpdatesDemo.java -> So far we have seen select / dynamic select. This class shows how to perform inserts, updates, deletes from a Java Program that interacts with a database.

4. DatabaseDynamicUpdatesDemo.java ->  This class shows how to perform dynamic inserts, updates, deletes from a Java Program that interacts with a database.

5. DatabaseDDLDemo.java -> This class shows how to perform DDL operations like create / drop table from a Java Program into a database.
To verify, go to sqlite prompt and say: .tables. also, .schema will show schema of all tables involved.

========================================================== Collections ===================================================

Below are the different interfaces under the Collection interface:

============================================================================= Lists: (ArrayListDemo.java & LinkedListDemo.java) =========================================

List is an ordered collection i.e. indexing works. This can have duplicate elements. 
ArrayList and LinkedList are both implementations of the List interface, but they differ in how they store elements and how they perform certain operations. 

ArrayList:
ArrayList uses a dynamic array, providing faster random access (retrieving elements by index) but slower insertions and deletions, especially in the middle of the list. 

LinkedList:
LinkedList, on the other hand, uses a doubly linked list, allowing for efficient insertions and deletions, particularly at the beginning or middle, but slower random access. 
Memory overhead is higher in LinkedList (due to pointers).

------------------------ Arrays vs ArrayLists ------------------------ 

Arrays in Java are fixed-size data structures that store elements of the same type. Once an array is created, its size cannot be changed. 
ArrayLists, on the other hand, are dynamic data structures that can grow or shrink in size as needed. 
They are part of the Java Collections Framework and provide a rich set of methods for manipulating data.

Arrays can store both primitive data types (e.g., int, char, boolean) and objects. 
ArrayLists can only store objects. When using ArrayLists with primitive types, autoboxing and unboxing occur, which can impact performance. 

ArrayLists support generics, allowing you to specify the type of objects that can be stored in the list. 
This provides type safety and avoids the need for casting. Arrays do not support generics.

Arrays are generally faster than ArrayLists for accessing and modifying elements, especially when the size of the data structure is known and fixed. 
ArrayLists can be slower for certain operations, such as inserting or deleting elements in the middle of the list, as this may require shifting elements.

Choose arrays when you know the size of the data structure in advance and it will not change, and when performance is critical. 
Choose ArrayLists when you need a dynamic data structure that can grow or shrink as needed, or when you need to use the methods provided by the Java Collections Framework.


============================================================================= Queues: (ArrayDequeDemo.java & PriorityQueueDemo.java) ==================================


Note that in Queues, you cannot add elements in the middle like: add(index, element).
You cannot also remove / get items from the middle.

Deque (Double-Ended Queue):
Maintains insertion order.
It is a more general type of queue that allows insertion and removal of elements from both ends (front and rear). 
It can be used as a regular queue (FIFO) or as a stack (LIFO).

PriorityQueue:
Orders elements by priority (naturally or by Comparator).
Access from both sides not possible - You cannot perform addFirst(), addLast(), removeFirst(), removeLast(), getFirst(), getLast() etc here as you can do in Deque.
It is a special type of queue where each element has a priority. Elements are dequeued based on their priority, with the highest priority element being removed first. 
If multiple elements have the same priority, they are dequeued in FIFO order. 
By default, Java's PriorityQueue implements a min-heap, meaning the smallest element has the highest priority.



============================================================================ Sets (HashSetDemo.java, TreeSetDemo.java, LinkedHashSetDemo.java) ==============================

Set has no indexing and this has only unique elements. 
Here as well, like in Queues, you cannot add elements in the middle using index like add(index, element). You cannot also remove / get items using index.
For differences between HashSet, LinkedHashSet and TreeSet, refer HashSet vs LinkedHashSet vs TreeSet.docx.


========================================================= Maps (HashMapDemo.java, TreeMapDemo.java, LinkedHashMapDemo.java) ==================================================

Map for storing key/value pairs. 
Again, HashMap doesnt have an order. TreeMap has an order (sorted based on keys).
LinkedHashMap is used in cache - when you add beyond limit, Least Recently Used (LRU) data will be removed.
put / get are the common methods.


----------- good summary for sets and maps ----------


HashSet / HashMap -> order not maintained
TreeSet / TreeMap -> order by values for TreeSet / by keys for TreeMap
LinkedHashSet / LinkedHashMap -> order of insertion maintained
In the case of LinkedHashMap -> you can control by order of access instead of order of insertion by using appropriate constructor at the time of defining the LinkedHashMap.
In the case of LinkedHashMap -> you can also fix the size i.e you can control from expanding beyond the initial size - LRU element is thrown out when new elements come in. used in caching.

HashSet, HashMap, LinkedHashSet, LinkedHashMap can have a loading factor that determines how many slots are filled up.
There must be some free space to ensure easier / faster access of elements that are stored by hashing technique - 
if an element falls in same slot as another element becoz of hashing logic, it will be put in the next slot and so on, till an empty slot is found.
If empty slots are not there, it will have to go through the entire structure which can result in slowness.


===================================================== Properties (PropertiesDemo.java) ====================================================

Kind of a Map class with keys and values but keys and values have to be strings.
Can store the properties in txt, xml format and read the properties as well, using the Properties class.



==================================================== StringTokenizer (StringTokenizerDemo.java & StringTokenizerDemo1.java) ====================================================


This has got nothing do with Collections seen till above.
Just a way to split a string into multiple tokens -> StringTokenizerDemo.java
Reads a file as byte array, converts byte array to String and then splits string into multiple tokens -> StringTokenizerDemo1.java

