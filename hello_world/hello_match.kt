/*
	Illustrate pattern matching for arguments
*/
//package hello

fun main(args: Array<String>){
	val lan = if (args.size == 0) "EN" else args[0]
	// if .. else - is an expression.. works like ternary operator
	println(when(lan){
		"EN" -> "Hello"
		"ES" -> "Hola"
		"IT" -> "Ciao"
		else -> "Sorry I do not understand $lan!"
	}
	)
}