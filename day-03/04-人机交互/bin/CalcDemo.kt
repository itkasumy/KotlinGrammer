fun main(args: Array<String>) {
	println("请输入一个数字:")
	var num1Str = readLine()
	println("请输入第二个数字")
	var num2Str = readLine()
	
	var num1:Int = num1Str!!.toInt()
	var num2:Int = num2Str!!.toInt()
	
	println("${num1} + ${num2} = ${num1 + num2}")
}