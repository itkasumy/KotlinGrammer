fun main(args: Array<String>) {
	var i:Byte = 18
//	i = 19
//	i = 9999999999999999
	var j:Long = 9999999999999999
	var k:String = "hello"
	println(i)
	println(j)
	println(k)
	
//	var a 报错，智能类型推断不能推断出a的类型
	var a:Long // 这样就可以了
	a = 18500682038
	println(a)
	
	val PI = 3.14
//	PI = 6.28 报错，val 声明一个常量，不可以被改变
	println(PI)
}