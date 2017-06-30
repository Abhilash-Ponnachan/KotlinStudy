/*
	Demonstrate reading command-line arguments
*/
//package hello

fun main(args: Array<String>){
	if(args.size == 0){
		println("Please provide a name as command-line argument.")
		return
	}
	println("Hello ${args[0]}")
	// Note String template (interpolation) using $ prefix!
	// Use {} to evaluate, i.e if not a single value
}