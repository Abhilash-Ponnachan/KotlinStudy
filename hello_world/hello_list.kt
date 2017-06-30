/*
	Illustrate a for loop, to read multiple args
*/
//package hello

fun main(args: Array<String>){
	if(args.size == 0){
		println("Please provide a list of names.")
		return
	}
	println()
	print("Hello ")
	for(name in args)
		print("$name, ")
	println()
}
/*
	Iterator Pattern in Kotlin with "for ..in" keywords
	- Similar to "foreach ..in" in C#
*/