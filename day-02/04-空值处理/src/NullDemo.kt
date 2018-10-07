//接收一个参数，参数是非空的 String 类型，加上问号代表的是参数可以为空
fun heat(str:String?):String {
	return "热" + str
}

fun main(args: Array<String>) {
	var res1 = heat("水")
	println(res1)
	var res2 = heat("狗")
	println(res2)
 
	var res3 = heat(null)
	println(res3)
}