fun main(args: Array<String>) {
	var res1 = add(3, 5)
	println(res1)
	
//	函数表达式 1.0
	var fn = {a:Int, b:Int -> a + b}	
	var res2 = fn(3, 6)
	println(res2)
	
//	函数表达式 2.0
	var f:(Int, Int) -> Int = {x, y -> x + y}
	var res3 = f(3, 4)
	println(res3)
}

//函数声明 1.0
/*fun add(a:Int, b:Int):Int {
	return a + b
}*/

//函数声明 2.0
fun add(a:Int, b:Int):Int = a + b