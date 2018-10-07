fun main(args: Array<String>) {
	var a = 16
	var b = 8
	println("a+b=" + plus(a, b))
	println("a-b=" + sub(a, b))
	println("a*b=" + mul(a, b))
	println("a/b=" + devide(a, b))
}

fun plus(a:Int, b:Int):Int {
	return a + b
}

fun sub(a:Int, b:Int):Int {
	return a - b	
}

fun mul(a:Int, b:Int):Int {
	return a * b;
}

fun devide(a:Int, b:Int):Int {
	return a / b
}