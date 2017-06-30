/*
	Writing, compiling and executing a simple 'Hello World' program
	in Kotlin.
	Note - 
		- No class specification is needed
		- Semicolons are optional
		- Package specification is optional
*/
//package hello 		- 	Package header is optional

fun main(args: Array<String>){	//- Package-level function
	println("Hello World!")
}

/* === Executing from Command Line Interface CLI =====
> kotlinc hello_world.kt -include-runtime -d hello.jar
-> hello.jar
> java -jar hello.jar
-> Hello World!
*/