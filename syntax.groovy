Groovy is a dynamic language for the Java Virtual Machine (JVM) that is often used as a scripting language for Java applications. It has a syntax that is similar to Java but with some additional features and syntactic sugar. Here is a basic overview of Groovy syntax:

Hello World:

groovy
Copy code
println "Hello, World!"
Variables:

groovy
Copy code
def name = "John"
Groovy is dynamically typed, so you don't need to explicitly declare the type of a variable. The def keyword is used to define variables.

Data Types:
Groovy supports the basic data types such as int, double, boolean, String, etc.

groovy
Copy code
def age = 25
def salary = 1000.50
def isStudent = false
Strings:

groovy
Copy code
def greeting = "Hello"
def name = "John"
def message = "$greeting, $name!"
Groovy supports string interpolation, allowing variables to be directly embedded in strings.

Lists:

groovy
Copy code
def numbers = [1, 2, 3, 4, 5]
Maps:

groovy
Copy code
def person = [name: "John", age: 30, city: "New York"]
Control Flow:

If-Else:

groovy
Copy code
def score = 75
if (score >= 70) {
    println "Pass"
} else {
    println "Fail"
}
Switch:

groovy
Copy code
def day = "Monday"
switch (day) {
    case "Monday":
    case "Tuesday":
        println "It's a weekday"
        break
    case "Saturday":
    case "Sunday":
        println "It's the weekend"
        break
    default:
        println "Invalid day"
}
Loops:

For:

groovy
Copy code
for (i in 1..5) {
    println i
}
While:

groovy
Copy code
def count = 0
while (count < 5) {
    println count
    count++
}
Functions:

groovy
Copy code
def addNumbers(int a, int b) {
    return a + b
}

def result = addNumbers(3, 7)
Groovy supports both traditional function syntax and a shorter syntax for single-expression functions.

These are just some basic examples of Groovy syntax. Groovy has many more features, including closures, metaprogramming capabilities, and easy integration with Java libraries.
