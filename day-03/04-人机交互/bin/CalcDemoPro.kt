fun main(args: Array<String>) {
	while(true) {
		println("欢迎使用ksm计算器")
	
		println("请输入一个数字")
		var num1Str = readLine()
		println("请输入第二个数字")
		var num2Str = readLine()
		
		try {
			var num1:Int = num1Str!!.toInt()
			var num2:Int = num2Str!!.toInt()
			println("${num1} + ${num2} = ${num1 + num2}")
		} catch(e:Exception) {
			println("您输入的值有误，请确认输入的值为数字")
		}
	}
}