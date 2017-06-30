/*
	Demonstrate declaring and using a class
*/
//package hello

class Greeter(val name: String){
	// class with default constructor
	fun greet(){
		println("Hello $name")
	}
}

fun main(args: Array<String>){
	val name = if (args.size == 0) "John Doe" else args[0]
	val greeter = Greeter(name)		
	// get an object of Greeter class, Note - no "new" keyword
	greeter.greet();
}