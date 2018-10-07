fun main(args: Array<String>) {
	println(sayHello("ksm"))
	println(checkAge(19))
	saveLog(18)
}

fun sayHello(name:String):String {
	return "hello " + name
}

fun checkAge(age:Int):Boolean {
	return age > 18
//	if(age > 18) return true else return false
}

fun saveLog(logLevel:Int) {
	println(logLevel)
}