fun DiaryGenerater(placeName:String):String {
	var diary = """
		今天天气晴朗，万里无云，我们去${placeName}玩，
		首先映入眼帘的是：${placeName}${numToChinese(placeName.length)}个镏金大字。
	"""
	return diary
}

fun numToChinese(num:Int):String {
	var res = when(num) {
		1 -> "一"
		2 -> "二"
		3 -> "三"
		4 -> "四"
		5 -> "五"
		6 -> "六"
		else -> num.toString()
	}
	return res
}

fun main(args: Array<String>) {
	println(DiaryGenerater("东方明珠东方明珠东方明珠"))
}